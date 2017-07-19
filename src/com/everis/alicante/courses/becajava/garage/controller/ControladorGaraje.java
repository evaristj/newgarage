package com.everis.alicante.courses.becajava.garage.controller;

import java.io.IOException;
import java.util.List;

import com.everis.alicante.courses.becajava.garage.domain.Reserva;

public interface ControladorGaraje {
	
	void listarPlazasLibres();
	void listarPlazasOcupadas();
	boolean reservarPlaza() throws IOException;
	void listarClientes();
	List<Reserva> listarReservas();

}