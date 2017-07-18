package com.everis.alicante.courses.becajava.garage.interfaces;

import java.io.IOException;

public interface ControladorGaraje {
	
	void listarPlazasLibres();
	void listarPlazasOcupadas();
	boolean reservarPlazas() throws IOException;
}
