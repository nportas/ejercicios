package ar.com.java.escuelita.modelo;

import java.util.ArrayList;
import java.util.List;

public class Sandwich {
	
	Double precioBase;
	List<Ingrediente> ingredientes = new ArrayList<>();
	List<Agregado> agregados = new ArrayList<>();

	public Sandwich(Double precioBase) {
		
		this.precioBase = precioBase;
	}

	public Double calcularPrecio() {
		
		Double precio = 0.0;
		
		for (Ingrediente ingrediente : ingredientes) {
			
			precio = precio + ingrediente.calcularPrecioComoIngrediente(); 
		}
		
		for (Agregado agregado : agregados) {
			
			precio = precio + agregado.calcularPrecioComoAgregado();
		}
		
		return precioBase + precio;
	}

	public void agregarIngrediente(Ingrediente ingrediente) {

		ingredientes.add(ingrediente);
	}

	public void agregarAgregado(Agregado agregado) {

		agregados.add(agregado);
	}
}
