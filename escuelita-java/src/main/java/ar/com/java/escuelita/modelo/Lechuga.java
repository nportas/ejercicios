package ar.com.java.escuelita.modelo;

public class Lechuga implements Agregado {
	
	private Double precio;
	
	public Lechuga(Double precio) {
		this.precio = precio;
	}

	@Override
	public Double calcularPrecioComoAgregado() {

		return precio * 1.5;
	}

}