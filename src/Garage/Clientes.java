package Garage;

public class Clientes extends Plazas{
	
	private String nombreCompleto;
	private String nif;
	private Vehiculo vehiculo;
	
	public Clientes(String nif, String nombreCompleto, Vehiculo vehiculo) {
		this.nif = nif;
		this.nombreCompleto = nombreCompleto;
		this.vehiculo = vehiculo;
	}

	public String getNombreCompleto() {
		return nombreCompleto;
	}

	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}

	public String getNif() {
		return nif;
	}

	public void setNif(String nif) {
		this.nif = nif;
	}

	public Vehiculo getVehiculo() {
		return vehiculo;
	}

	public void setVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}

	@Override
	public String toString() {
		return "Clientes Nombre y apellidos = " + nombreCompleto + ", DNI= " + nif + ", Vehiculo = " + vehiculo;
	}
	
}