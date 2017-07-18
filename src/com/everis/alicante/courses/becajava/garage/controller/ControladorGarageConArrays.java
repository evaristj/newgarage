package com.everis.alicante.courses.becajava.garage.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Scanner;

import com.everis.alicante.courses.becajava.garage.GarageMain;
import com.everis.alicante.courses.becajava.garage.domain.Camion;
import com.everis.alicante.courses.becajava.garage.domain.Cliente;
import com.everis.alicante.courses.becajava.garage.domain.Coche;
import com.everis.alicante.courses.becajava.garage.domain.Garage;
import com.everis.alicante.courses.becajava.garage.domain.Motocicleta;
import com.everis.alicante.courses.becajava.garage.domain.Plaza;
import com.everis.alicante.courses.becajava.garage.domain.Reserva;
import com.everis.alicante.courses.becajava.garage.domain.Vehiculo;
import com.everis.alicante.courses.becajava.garage.interfaces.Aparcable;
import com.everis.alicante.courses.becajava.garage.interfaces.ControladorGaraje;
import com.everis.alicante.courses.becajava.garage.interfaces.ReservaDAO;
import com.everis.alicante.courses.becajava.garage.interfaces.ReservaDAOFileImp;

public class ControladorGarageConArrays implements ControladorGaraje{

	@Override
	public void listarPlazasLibres() {
		List<Plaza> plazaslibres= new ArrayList<Plaza>();
		
		List<Plaza> plazas =GarageMain.getGarage().getPlazas();
		for (Plaza plaza : plazas) {
			
			if (plaza.getLibre()) {
				plazaslibres.add(plaza);
			}
		}
		
		for (Plaza plaza1 : plazaslibres) {
			System.out.println(plaza1);
		
			}
	}
	
	@Override
	public void listarPlazasOcupadas() {
		
		List<Plaza> plazasOcupadas = new ArrayList<Plaza>();
		List<Plaza> plazas=GarageMain.getGarage().getPlazas();
		
		for(Plaza plaza : plazas) {

			if(!plaza.getLibre()) {
				plazasOcupadas.add(plaza);
			}
		}
		
		//listar por pantalla
		for(Plaza plaza1 : plazasOcupadas) {
			System.out.println(plaza1);
		}
		
	}

	@Override
	public boolean reservarPlazas() throws IOException {
		
		Cliente cliente = new Cliente();
		
		ReservaDAO dao = new ReservaDAOFileImp();

		System.out.println("Inserte el nombre del Cliente");
		
		Scanner in = new Scanner(System.in);
		cliente.setNombreCompleto(in.nextLine());
		System.out.println("Inserte el DNI del Cliente");
		in = new Scanner(System.in);
		cliente.setNif(in.nextLine());
		
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
		
		System.out.println("inserte la matricula");
		in =new Scanner(System.in);
		vehiculo.setMatricula(in.nextLine());
		
		cliente.setVehiculo(vehiculo);
		
		boolean hayPlaza=false;
		Garage garage = GarageMain.getGarage();
		
		List<Plaza> plazas = garage.getPlazas();
		
		for (Plaza plaza : plazas) {

			if (plaza.getLibre()&& vehiculo instanceof Aparcable) {
				plaza.setCliente(cliente);
				hayPlaza=true;
				
				Reserva reserva=new Reserva();
				reserva.setCliente(cliente);
				reserva.setPlaza(plaza);
				reserva.setFechaReserva(Calendar.getInstance().getTime());
				dao.saveReserva(reserva);
				return hayPlaza;
			} 
			
		}
		return hayPlaza;
		}
}
