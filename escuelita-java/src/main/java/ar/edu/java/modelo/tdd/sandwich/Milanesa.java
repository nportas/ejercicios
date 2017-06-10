package ar.edu.java.modelo.tdd.sandwich;

public class Milanesa extends Alimento implements Ingrediente {
	
	private Double precio;

	public Milanesa(Double precio) {
		this.precio = precio;
	}

	@Override
	public Double calcularPrecioComoIngrediente() {

		return precio;
	}
}
