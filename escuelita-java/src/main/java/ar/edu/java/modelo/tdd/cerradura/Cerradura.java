package ar.edu.java.modelo.tdd.cerradura;

public class Cerradura {

	private boolean estaCerrada = true;
	
	public boolean estaCerrada() {
		return estaCerrada;
	}

	public void abrir() {
		estaCerrada = false;
	}

	public void cerrar() {
		estaCerrada = true;
	}

}
