package Garage;

import java.util.ArrayList;
import java.util.List;

public class GarageMain {
	
		
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		//1 garaje
		
		inicializarComponentes();

	}
	
	public static void inicializarComponentes() {
		//4 clientes
		List<Clientes> listClientes = new ArrayList<>();
		//5 vehiculos
		List<Vehiculo> listVehiculos = new ArrayList<>();
		
		List<Plazas> listPlaza = new ArrayList<>();
		
		// 30 plazas de garaje
		for (int i=0; i<30;i++) {
			Plazas precio = new Plazas();
			precio.setPrecio(i); 
			listPlaza.add(precio);
			System.out.println(precio);
			
		}
		//5 vehiculos
		for (int i=0; i<5;i++) {
			Vehiculo matricula = new Vehiculo();
			((Vehiculo)(matricula)).setMatricula("34rer");
			
			listVehiculos.add(matricula);
			System.out.println("" + matricula);
		}
		//4 clientes
				for (int i=0; i<4;i++) {
					Vehiculo vehiculo = new Vehiculo();
					Clientes cliente = new Clientes("Nif"+i, "nombreCmpleto"+i, vehiculo);
					
					System.out.println(cliente);
				}
			
		}		

	private Plazas plaza;

	public Plazas getPlaza() {
		return getPlaza();
	}

	public void setPlaza(Plazas plaza) {
		this.plaza = plaza;
	}

}
