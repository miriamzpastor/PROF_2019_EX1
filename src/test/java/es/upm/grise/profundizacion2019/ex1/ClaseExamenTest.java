package es.upm.grise.profundizacion2019.ex1;

import static org.junit.Assert.*;

import org.junit.Test;


public class ClaseExamenTest {
	ClaseExamen prueba =new ClaseExamen();
	
	@Test
	public void test() {
		assertEquals(0,prueba.metodoAProbar(8,7),0);
	}
	@Test
	public void test2() {
		assertEquals(0,prueba.metodoAProbar(3,4),0);
	}
}
