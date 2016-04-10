package ar.edu.unlam.tallerweb.tarea1;

import org.junit.Test;

public class AreaTest {

	@org.junit.Test
	public void testAreaCuadrado() {
		Area miArea= new Area();
		Integer lado=7;
		miArea.AreaCuadrado(lado);
		
	}
	
	@Test
	public void testAreaCirculo()
	{
		Area miArea=new Area();
		Integer radio=15;
		miArea.AreaCirculo(radio);
		
	}
	
}
