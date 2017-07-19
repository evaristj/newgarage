package com.everis.alicante.courses.becajava.garage.domain;

import com.everis.alicante.courses.becajava.garage.interfaces.Aparcable;

public class Bicicletas extends Vehiculo implements Aparcable{
	
	private String model;

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	@Override
	public void aparcar() {
		// TODO Auto-generated method stub
		
	}

}
