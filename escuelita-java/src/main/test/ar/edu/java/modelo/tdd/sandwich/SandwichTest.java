package ar.edu.java.modelo.tdd.sandwich;

import org.junit.Test;

import ar.edu.java.modelo.tdd.sandwich.Lechuga;
import ar.edu.java.modelo.tdd.sandwich.Milanesa;
import ar.edu.java.modelo.tdd.sandwich.Queso;
import ar.edu.java.modelo.tdd.sandwich.Salame;
import ar.edu.java.modelo.tdd.sandwich.Sandwich;
import ar.edu.java.modelo.tdd.sandwich.Tomate;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

/**
 *  Se pretende modelar un sandwich, el cual puede estar formado una serie de ingredientes y agregados.
	Estos últimos son opcionales.
	Entre los ingredientes puede elegirse milanesa, queso, salame. De cada ingrediente puede obtenerse su
	precio.
	Los agregados pueden ser queso, tomate y/o lechuga y también puede saberse el precio de los mismos.
	Todo agregado deberá calcular su precio incrementando un 50% el valor de venta que poseen.
	Al sándwich pueden agregarse ingredientes y agregados los que, ambos, incrementan el precio total del
	sándwich. Además el sandwich tiene un precio base al cual se le suma el costo de los agregados y los
	ingredientes.
	El sandwich puede calcular su precio en cualquier momento.
	Implementar el ejemplo, haciendo que funcionen correctamente los siguientes tests.
 *	
 * @author nportas
 *
 */

public class SandwichTest {
	
	@Test
	public void comprobarPrecioDeSandwichConTresIngredientesYDosAgregados() throws Exception {
		
		/* Inicialización */
		Sandwich sandwich = new Sandwich(20.0);
		
		Queso queso = new Queso(10.0);
		Milanesa milanesa = new Milanesa(30.0);
		Salame salame = new Salame(20.0);
		
		sandwich.agregarIngrediente(queso);
		sandwich.agregarIngrediente(milanesa);
		sandwich.agregarIngrediente(salame);

		Lechuga lechuga = new Lechuga(5.0);
		Tomate tomate = new Tomate(10.0);
		
		sandwich.agregarAgregado(lechuga);
		sandwich.agregarAgregado(tomate);
		
		/* Operación */
		Double precioSandwich = sandwich.calcularPrecio();
		
		/* Comprobación */
		assertThat(precioSandwich, is(equalTo(102.50)));
	}
	
	@Test
	public void comprobarPrecioDeSandwichConSoloUnIngrediente() throws Exception {
		
		/* Inicialización */
		Sandwich sandwich = new Sandwich(20.0);
		
		Milanesa milanesa = new Milanesa(30.0);
		
		sandwich.agregarIngrediente(milanesa);

		/* Operación */
		Double precioSandwich = sandwich.calcularPrecio();
		
		/* Comprobación */
		assertThat(precioSandwich, is(equalTo(50.0)));
	}
	
	@Test
	public void comprobarPrecioDeSandwichConDosIngredientesYUnAgregadoQueEsIngrediente() throws Exception {
		
		/* Inicialización */
		Sandwich sandwich = new Sandwich(20.0);
		
		Queso quesoComoIngrediente = new Queso(10.0);
		Milanesa milanesa = new Milanesa(30.0);
		
		sandwich.agregarIngrediente(quesoComoIngrediente);
		sandwich.agregarIngrediente(milanesa);

		Queso quesoComoAgregado = new Queso(10.0);
		
		sandwich.agregarAgregado(quesoComoAgregado);
		
		/* Operación */
		Double precioSandwich = sandwich.calcularPrecio();
		
		/* Comprobación */
		assertThat(precioSandwich, is(equalTo(75.0)));
	}
	
	@Test(expected = Exception.class)
	public void comprobarQueFallaCuandoNoTieneAlMenosUnIngrediente() throws Exception {
		
		/* Inicialización */
		Sandwich sandwich = new Sandwich(20.0);
		
		Queso quesoComoAgregado = new Queso(10.0);
		
		sandwich.agregarAgregado(quesoComoAgregado);
		
		/* Operación */
		sandwich.calcularPrecio();
	}

}
