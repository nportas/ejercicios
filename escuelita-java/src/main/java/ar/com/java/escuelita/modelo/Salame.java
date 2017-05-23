package ar.com.java.escuelita.modelo;

public class Salame implements Ingrediente {
	
	private Double precio;
	
	public Salame(Double precio) {
		this.precio = precio;
	}

	@Override
	public Double calcularPrecioComoIngrediente() {

		return precio;
	}

}
