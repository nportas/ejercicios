package ar.com.java.escuelita.modelo;

public class Tomate implements Agregado {

	private Double precio;
	
	public Tomate(Double precio) {
		this.precio = precio;
	}

	@Override
	public Double calcularPrecioComoAgregado() {
		
		return precio * 1.5;
	}
	
}
