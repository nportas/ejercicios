package ar.edu.java.modelo.tdd.sandwich;

public class Lechuga extends Alimento implements Agregado {
	
	public Lechuga(Double precio) {
		this.precio = precio;
	}

	@Override
	public Double calcularPrecioComoAgregado() {

		return precio * 1.5;
	}

}
