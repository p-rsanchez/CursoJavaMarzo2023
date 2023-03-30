package Calculadora;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class CalculadoraTest{

	static Calculadora calculadora;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		calculadora = new Calculadora();
	}

	@Test
	void testSuma() {
		assertEquals("Prueba 1", 6, calculadora.suma(3, 3), 0);
	}

	@Test
	void testResta() {
		assertEquals("Prueba 1", 0, calculadora.resta(3, 3), 0);
	}

	@Test
	void testMulti() {
		assertEquals("Prueba 1", 9, calculadora.multi(3, 3), 0);
	}

	@Test
	void testDiv() {
		assertEquals("Prueba 1", 1, calculadora.div(3, 3), 0);
	}

}
