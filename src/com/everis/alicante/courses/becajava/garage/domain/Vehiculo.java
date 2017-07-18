package com.everis.alicante.courses.becajava.garage.domain;

import com.everis.alicante.courses.becajava.garage.GarageMain;

public class Vehiculo  extends GarageMain{
	
	private String matricula;

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	@Override
	public String toString() {
		return "Vehiculo con matrícula = " + matricula;
	}
	
}
