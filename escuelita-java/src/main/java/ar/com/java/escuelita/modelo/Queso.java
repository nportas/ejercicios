package ar.com.java.escuelita.modelo;

public class Queso implements Ingrediente, Agregado {

	private Double precio;
	
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
