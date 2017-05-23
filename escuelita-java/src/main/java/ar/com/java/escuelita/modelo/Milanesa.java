package ar.com.java.escuelita.modelo;

public class Milanesa implements Ingrediente {
	
	private Double precio;

	public Milanesa(Double precio) {
		this.precio = precio;
	}

	@Override
	public Double calcularPrecioComoIngrediente() {

		return precio;
	}
}
