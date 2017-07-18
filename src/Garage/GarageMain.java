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
		System.out.println("3: Reservar una Plaza");
		System.out.println("4: Listar Clientes");
		System.out.println("5: Listar Vehiculos");
		System.out.println("6: Calcular ingresos");
//		Systemo.ut.println("1: Listar Plazas");
//		System.out.println("1: Listar Plazas");
		Scanner in = new Scanner(System.in);
		Integer opcion = in.nextInt();
		System.out.println("Ha elegido la opcion: " + opcion);
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
			System.out.println("Error");
			break;
		}
		
		if (opcion==3&&resultado) {
			System.out.println("se ha reservado tu plaza de garage");
			
		}else if (opcion==3){
			System.out.println("no se ha reservado tu plaza de garage");

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
		
		}

	public static Garage getGarage() {
		return garage;
	}

	public static void setGarage(Garage garage) {
		GarageMain.garage = garage;
	}
}