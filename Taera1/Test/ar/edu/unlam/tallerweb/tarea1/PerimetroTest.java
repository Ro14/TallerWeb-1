package ar.edu.unlam.tallerweb.tarea1;

import org.junit.Test;

public class PerimetroTest {

	@org.junit.Test
	public void testPerimetroCuadrado() {
		Perimetro miPerimetro= new Perimetro();
		Integer lado=7;
		miPerimetro.PerimetroCuadrado(lado);
		
	}
	
	@Test
	public void testPerimetroCirculo()
	{
		Perimetro miPerimetro= new Perimetro();
		Integer radio=15;
		miPerimetro.PerimetroCirculo(radio);
		
	}
	
}
