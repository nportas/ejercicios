package ar.edu.java.modelo.tdd.sandwich;

public class Salame extends Alimento implements Ingrediente {
	
	public Salame(Double precio) {
		this.precio = precio;
	}

	@Override
	public Double calcularPrecioComoIngrediente() {

		return precio;
	}

}
