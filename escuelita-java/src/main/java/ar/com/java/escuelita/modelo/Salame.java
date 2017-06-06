package ar.com.java.escuelita.modelo;

public class Salame extends Alimento implements Ingrediente {
	
	public Salame(Double precio) {
		this.precio = precio;
	}

	@Override
	public Double calcularPrecioComoIngrediente() {

		return precio;
	}

}
