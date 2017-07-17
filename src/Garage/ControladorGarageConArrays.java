package Garage;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ControladorGarageConArrays implements ControladorGaraje{

	@Override
	public void listarPlazasLibres() {
		List<Plaza> plazaslibres= new ArrayList<Plaza>();
		
		Plaza[] plazas =GarageMain.getGarage().getPlaza();
		for (int i = 0; i < plazas.length; i++) {
			Plaza plaza = plazas[i];
			
			if (plaza.getLibre()) {
				plazaslibres.add(plaza);
			}
		}
		
		for (Plaza plaza : plazaslibres) {
			System.out.println(plaza);
			}
	}
	
	@Override
	public void listarPlazasOcupadas() {
		
		List<Plaza> plazasOcupadas= new ArrayList<Plaza>();
		Plaza[] plazas=GarageMain.getGarage().getPlaza();
	}

	@Override
	public boolean reservarPlazas() {
		
		Cliente clientes = new Cliente();
		//vamos a escribir por pantalla un menu para meter los datos del cliente
		System.out.println("Inserte el nombre del Cliente");
		
		Scanner in = new Scanner(System.in);
		clientes.setNombreCompleto(in.nextLine());
		System.out.println("Inserte el DNI del Cliente");
		in = new Scanner(System.in);
		clientes.setNif(in.nextLine());
		
		Vehiculo vehiculo = null;
		
		System.out.println("tipo de vehiculo del propietario");
		System.out.println("1: coche");
		System.out.println("2: motocicleta");
		System.out.println("3: camion");

		//clientes.setNombreCompleto(null);
		in=new Scanner(System.in);
		
		switch (in.nextInt()) {
		case 1:
			vehiculo=new Coche();
			break;
		case 2:
			vehiculo=new Motocicleta();
			break;
		case 3:
			vehiculo=new Camion();
			break;

		default:
			System.out.println("Error");
			break;
		}
		
//		if (in.nextInt()==3) {
//			System.out.println("no se puede guardar el camion");			
//		}
		
		System.out.println("inserte la matricula");
		in =new Scanner(System.in);
		vehiculo.setMatricula(in.nextLine());
		
		clientes.setVehiculo(vehiculo);
		
		boolean hayPlaza=false;
		Garage garage = GarageMain.getGarage();
		
		Plaza[] plaza = garage.getPlaza();
		
		for (int i = 0; i < plaza.length; i++) {
			Plaza plazas = plaza[i];
			if (plazas.getLibre()&& vehiculo instanceof Aparcable) {
				plazas.setCliente(clientes);
				hayPlaza=true;
				return hayPlaza;
			} 
			
		}
		return hayPlaza;
		}
	
		//logica de si hay vacias
		
		//si hay plazas libres seteamos un cliente a la plaza que queramos
		
}
