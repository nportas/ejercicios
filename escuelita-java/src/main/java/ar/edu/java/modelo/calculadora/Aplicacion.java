package ar.edu.java.modelo.calculadora;

public class Aplicacion {

	public static void main(String[] args) {
		
		Calculadora calculadora = new Calculadora();
		
		calculadora.agregarOperacion(new Suma(1.0,1.0));//2
		calculadora.agregarOperacion(new Resta(2.0,1.0));//1
		calculadora.agregarOperacion(new Division(4.0,2.0));//2
		calculadora.agregarOperacion(new Resta(4.0,2.0));//2
		calculadora.agregarOperacion(new Multiplicacion(2.0,3.0));//6
	
		double suma = calculadora.obtenerSumaDeOperaciones();
		
		if(13 == suma){
			
			System.out.println("EXITO");
			
		} else{
			
			System.out.println("FALLO");
		}
	}

}
