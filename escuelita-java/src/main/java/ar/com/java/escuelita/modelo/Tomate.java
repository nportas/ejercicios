package ar.com.java.escuelita.modelo;

public class Tomate extends Alimento implements Agregado {

	public Tomate(Double precio) {
		this.precio = precio;
	}

	@Override
	public Double calcularPrecioComoAgregado() {
		
		return precio * 1.5;
	}
	
}
