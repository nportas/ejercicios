package ar.edu.java.modelo.calculadora;

import java.util.LinkedList;
import java.util.List;

public class Calculadora {
	
	private List<Operacion> operaciones = new LinkedList<Operacion>();
	
	public List<Operacion> obtenerOperaciones() {		
		
		return operaciones;
	}

	public void agregarOperacion(Operacion operacion) {
		
		operaciones.add(operacion);
	}

	public double obtenerSumaDeOperaciones() {
		
		double resultado = 0;
		
		for (Operacion operacion : operaciones) {
			
			resultado = operacion.obtenerResultado() + resultado;
		}
		
		return resultado;
	}

}
