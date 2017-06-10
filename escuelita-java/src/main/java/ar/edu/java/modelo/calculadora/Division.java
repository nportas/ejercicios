package ar.edu.java.modelo.calculadora;

public class Division extends Operacion {
	
	public Division(double operando1, double operando2) {
		super.operando1 = operando1;
		super.operando2 = operando2;
	}

	@Override
	public double obtenerResultado() {
		
		if(operando2 == 0) {
			throw new RuntimeException("El dividor no puede ser cero");
		}
		
		return operando1 / operando2;
	}
	
	public double obtenerResto(double operando1, double operando2) {
		return operando1 % operando2;
	}

}
