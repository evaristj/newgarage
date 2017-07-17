package Garage;

public class Plazas extends GarageMain {
	
	private Clientes cliente;
	
	private double precio;

	public Clientes getCliente() {
		return cliente;
	}

	public void setCliente(Clientes cliente) {
		this.cliente = cliente;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Plazas [cliente=" + cliente + ", precio=" + precio + "]";
	}

}
