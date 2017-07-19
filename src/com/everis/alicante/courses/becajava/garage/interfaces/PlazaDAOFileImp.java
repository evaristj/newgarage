package com.everis.alicante.courses.becajava.garage.interfaces;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.everis.alicante.courses.becajava.garage.domain.Plaza;

public class PlazaDAOFileImp implements PlazaDAO{

	@Override
	public List<Plaza> readPlazas() throws IOException{
		
		List plazas = new ArrayList<Plaza>();
		String linea;

		File file = new File("resources/Plazas.txt");
		FileReader reader= new FileReader(file);
		
		BufferedReader buffer= new BufferedReader(reader);
		
		while ((linea=buffer.readLine())!=null) {
			
			if(!linea.contains("NUMERO_PLAZA")) {
			
			Plaza plazaTemp=new Plaza();
			
			String numeroPlaza=linea.substring(0,linea.indexOf(";"));
			
			plazaTemp.setNumeroPlaza(Integer.parseInt(numeroPlaza));
			
			String[] temp= linea.split(";");
			
			plazaTemp.setNumeroPlaza(Integer.parseInt(temp[0]));
			plazaTemp.setPrecio(Double.parseDouble(temp[0]));
			
			plazas.add(plazaTemp);
			}
		}
		
		reader.close();
		
		return plazas;
	}

	@Override
	public void write(Plaza[] plazas) {

		
	}
	
	public static void main(String args[]) throws IOException {
		
		PlazaDAO dao =new PlazaDAOFileImp();
		
		dao.readPlazas();
		
	}

}
