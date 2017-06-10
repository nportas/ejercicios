package ar.edu.java.modelo.tdd.sandwich;

public class Queso extends Alimento implements Ingrediente, Agregado {

	public Queso(Double precio) {
		this.precio = precio;
	}

	@Override
	public Double calcularPrecioComoAgregado() {

		return precio * 1.5;
	}

	@Override
	public Double calcularPrecioComoIngrediente() {

		return precio;
	}


}
