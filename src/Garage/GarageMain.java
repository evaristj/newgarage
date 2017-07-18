<<<<<<< HEAD
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
=======
package Garage;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GarageMain {
	
	static Garage garage;
	static ControladorGaraje controlador;
	
	public static void main(String[] args) {
		//1 garaje
		
		inicializarComponentes();
		// iniciar aplicacion o listar menu por pantalla
		
		iniciarAplicacion();
	}
	
	private static void iniciarAplicacion() {
		
		System.out.println("Seleccione una opción: ");
		System.out.println("1: Listar Plazas Libres");
		System.out.println("2: Listar Plazas Ocupadas");
		System.out.println("3: Reservar Plazas");
		System.out.println("4: Listar Clientes");
		System.out.println("5: Listar Vehiculos");
		System.out.println("6: Calcular ingresos");
//		Systemo.ut.println("1: Listar Plazas");
//		System.out.println("1: Listar Plazas");
		Scanner in = new Scanner(System.in);
		Integer opcion = in.nextInt();
		System.out.println("Ha elegido la opcion :" + opcion);
		boolean resultado = true;
		switch (opcion) {
		case 1:
			controlador.listarPlazasLibres();
			break;
		case 2:
			controlador.listarPlazasOcupadas();
			break;
		case 3:
			resultado=controlador.reservarPlazas();
			break;
//		case 4:
//			controlador.listarPlazaOcupada();
//			break;
//		case 5:
//			controlador.listarPlazaOcupada();
//			break;
//		case 6:
//			controlador.listarPlazaOcupada();
//			break;

		default:
			System.out.print("Error");
			break;
		}
		
		if (opcion==3&&resultado) {
			System.out.println("se ha reservado");
			
		}else if (opcion==3){
			System.out.println("no se ha reservado");

		}
		
		iniciarAplicacion();
		
	}

	public static void inicializarComponentes() {
		garage = new Garage();
		
		Plaza[] plaza = new Plaza[30];
		
		for (int i = 0; i < plaza.length; i++) {

			Plaza plazasTemp = new Plaza();
			plazasTemp.setNumeroPlaza(i+1);
			
			if (i<10) {
				plazasTemp.setPrecio(50);
				
			} else if(i<20){
				plazasTemp.setPrecio(75);
				
			}else {
				plazasTemp.setPrecio(100);
			}
			
			plaza[i]=plazasTemp;
		}
		
		garage.setPlaza(plaza);
		
		controlador = new ControladorGarageConArrays();
		
		System.out.println("test");
			
		}

	public static Garage getGarage() {
		return garage;
	}

	public static void setGarage(Garage garage) {
		GarageMain.garage = garage;
	}
		
//		//4 clientes
//		List<Clientes> listClientes = new ArrayList<>();
//		//5 vehiculos
//		List<Vehiculo> listVehiculos = new ArrayList<>();
//		
//		List<Plazas> listPlaza = new ArrayList<>();
//		
//		// 30 plazas de garaje
//		for (int i=0; i<30;i++) {
//			Plazas precio = new Plazas();
//			precio.setPrecio(i); 
//			listPlaza.add(precio);
//			System.out.println(precio);
//			
//		}
//		//5 vehiculos
//		for (int i=0; i<5;i++) {
//			Vehiculo matricula = new Vehiculo();
//			((Vehiculo)(matricula)).setMatricula("34rer");
//			
//			listVehiculos.add(matricula);
//			System.out.println("" + matricula);
//		}
//		//4 clientes
//		for (int i=0; i<4;i++) {
//			Vehiculo vehiculo = new Vehiculo();
//			Clientes cliente = new Clientes("Nif"+i, "nombreCmpleto"+i, vehiculo);
//					
//			System.out.println(cliente);
//			}
//			
//		}		

}
>>>>>>> 7ac307beac7bf049d7d89e78e3a4fe13bb0f0d87
