package ar.edu.java.modelo.tdd.sandwich;

import java.util.ArrayList;
import java.util.List;

public class Sandwich {
	
	Double precioBase;
	List<Ingrediente> ingredientes = new ArrayList<>();
	List<Agregado> agregados = new ArrayList<>();

	public Sandwich(Double precioBase) {
		
		this.precioBase = precioBase;
	}

	public Double calcularPrecio() throws Exception {
		
		Double precio = 0.0;
		
		if(ingredientes.size() > 0) {
			
			for (Ingrediente ingrediente : ingredientes) {
				
				precio = precio + ingrediente.calcularPrecioComoIngrediente(); 
			}
			
			for (Agregado agregado : agregados) {
				
				precio = precio + agregado.calcularPrecioComoAgregado();
			}
			
		} else {
			
			throw new Exception("El sandwich debe contener al menos un ingrediente");
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
