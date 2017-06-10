package ar.edu.java.modelo.calculadora;

public class Resta extends Operacion {
	
	public Resta(double operando1, double operando2) {
		super.operando1 = operando1;
		super.operando2 = operando2;
	}

	@Override
	public double obtenerResultado() {
		return operando1 - operando2;
	}

}
