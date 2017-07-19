package com.everis.alicante.courses.becajava.garage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.everis.alicante.courses.becajava.garage.controller.ControladorGarageConArrays;
import com.everis.alicante.courses.becajava.garage.domain.Garage;
import com.everis.alicante.courses.becajava.garage.domain.Plaza;
import com.everis.alicante.courses.becajava.garage.interfaces.ControladorGaraje;
import com.everis.alicante.courses.becajava.garage.interfaces.PlazaDAO;
import com.everis.alicante.courses.becajava.garage.interfaces.PlazaDAOFileImp;

public class GarageMain {
	
	static Garage garage;
	static ControladorGaraje controlador;
	
	public static void main(String[] args) throws IOException {
		
		inicializarComponentes();
		// iniciar aplicacion o listar menu por pantalla
		
		iniciarAplicacion();
	}
	
	private static void iniciarAplicacion() throws IOException {
		
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

	public static void inicializarComponentes() throws IOException{
		garage = new Garage();
		
		PlazaDAO plazaDao =new PlazaDAOFileImp();
		
	//	Plaza[] plazas= plazaDao.readPlazas();
		List<Plaza> plazasTemp= plazaDao.readPlazas();
		
		garage.setPlazas((plazasTemp));
		
		controlador = new ControladorGarageConArrays();
		
		}

	public static Garage getGarage() {
		return garage;
	}

}