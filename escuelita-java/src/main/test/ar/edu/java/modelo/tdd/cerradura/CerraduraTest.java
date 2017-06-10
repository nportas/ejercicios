package ar.edu.java.modelo.tdd.cerradura;

import org.junit.Assert;
import org.junit.Test;

import ar.edu.java.modelo.tdd.cerradura.Cerradura;

import static org.assertj.core.api.Assertions.*;

public class CerraduraTest {

	private Cerradura cerradura = new Cerradura();

	@Test
	public void alCrearLaCerraduraDeberiaEstarCerrada(){
		Assert.assertTrue(cerradura.estaCerrada());
		assertThat(cerradura.estaCerrada()).isTrue();
	}
	
	@Test
	public void alAbrirLaCerraduraDeberiaEstarAbierta(){
		cerradura.abrir();
		Assert.assertFalse(cerradura.estaCerrada());
		assertThat(cerradura.estaCerrada()).isFalse();
	}
	
	@Test
	public void alCerrarLaCerraduraDeberiaEstarCerrada(){
		cerradura.cerrar();
		Assert.assertTrue(cerradura.estaCerrada());
		assertThat(cerradura.estaCerrada()).isTrue();
	}
	
	@Test
	public void alCerrarLaCerraduraLuegoDeAbrirlaDeberiaEstarCerrada(){
		cerradura.abrir();
		cerradura.cerrar();
		Assert.assertTrue(cerradura.estaCerrada());
		assertThat(cerradura.estaCerrada()).isTrue();
	}
	
}
