package Tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import JUnit.Junit09_Geometria.dto.Geometria;

class Geometríatest {

	
	@Test
	public void testareacuadrado() {
		int resultado= Geometria.areacuadrado(4);
		int esperado= 16;
		assertEquals(resultado,esperado);
	}
	
	@Test
	public  void testareacirculo() {
		double resultado= Geometria.areaCirculo(8);
		double esperado= 201.06;
		double delta= 0.5;
		assertEquals(resultado,esperado,delta);
	}
	@Test 
	public void testareaRectangulo() {
		int resultado= Geometria.arearectangulo(2,4);
		int esperado=8;
		assertEquals(resultado,esperado);
	}
	
	@Test
	public void testareaTriangulo() {
		int resultado= Geometria.areatriangulo(4,2);
		int esperado= 4;
		assertEquals(resultado,esperado);
	}
	@Test
	public void testareapentagono() {
		double resultado= Geometria.areapentagono(4,2);
		double esperado= 4;
		assertEquals(resultado,esperado);
	}
	@Test
	public void testarearombo() {
		int resultado= Geometria.arearombo(4,4);
		int esperado= 8;
		assertEquals(resultado,esperado);
	}
	@Test 
	public void testarearomboide() {
		int resultado= Geometria.arearomboide(4,4);
		int esperado= 16;
		assertEquals(resultado,esperado);
	}
	@Test 
	public void testareaTrapecio() {
		int resultado= Geometria.areatrapecio(4,4,4);
		int esperado=16;
		assertEquals(resultado,esperado);
	}
	@Test
	public void testFigura() {
		 String resultado= Geometria.figura(1);
		 String esperado= "cuadrado";
		 assertEquals(resultado,esperado);
		 String resultado1= Geometria.figura(2);
		 String esperado1= "Circulo";
		 assertEquals(resultado1,esperado1);
		 String resultado2= Geometria.figura(3);
		 String esperado2= "Triangulo";
		 assertEquals(resultado2,esperado2);
		 String resultado3= Geometria.figura(4);
		 String esperado3= "Rectangulo";
		 assertEquals(resultado3,esperado3);
		 String resultado4= Geometria.figura(5);
		 String esperado4= "Pentagono";
		 assertEquals(resultado4,esperado4);
		 String resultado5= Geometria.figura(6);
		 String esperado5= "Rombo";
		 assertEquals(resultado5,esperado5);
		 String resultado6= Geometria.figura(7);
		 String esperado6= "Romboide";
		 assertEquals(resultado6,esperado6);
		 String resultado7= Geometria.figura(8);
		 String esperado7= "Trapecio";
		 assertEquals(resultado7,esperado7);
		 Geometria a=new Geometria();
		 String resultado8= a.figura(0);
		 String esperado8= "Default";
		 assertEquals(resultado8,esperado8);
		 
		 
	}
	@Test 
	public void testgetId() {
		Geometria resultado= new Geometria(2);
		int esperado=2;
		assertEquals(esperado,resultado.getId());
	}
	@Test 
	public void testsetId() {
	Geometria resultado= new Geometria(1);
	resultado.setId(2);
	int esperado=2;
	assertEquals(esperado,resultado.getId());
	}
	@Test
	public void testgetNom() {
		Geometria resultado= new Geometria(2);
		String esperado= "Circulo";
		assertEquals(esperado,resultado.getNom());
	}
	@Test
	public void testsetNom() {
		Geometria resultado= new Geometria(2);
		resultado.setNom("figura");
		String esperado= "figura";
		assertEquals(esperado, resultado.getNom());
	}
	@Test 
	public void testGetArea() {
		Geometria resultado= new Geometria(1);
		int esperado=0;
		assertEquals(esperado,resultado.getArea());
	}
	@Test
	public void testSetArea() {
		Geometria resultado= new Geometria(1);
		resultado.setArea(4);
		int esperado= 4;
		assertEquals(esperado, resultado.getArea());
	}
	@Test
	public void testtoString() {
		Geometria resultado= new Geometria(1);
		resultado.setArea(4);
		String esperado= "Geometria [id=1, nom=cuadrado, area=4.0]";
		assertEquals(esperado,resultado.toString());
	}
	@Test
	public void testGeometria() {
		Geometria resultado= new Geometria();
		String esperado= "Geometria [id=9, nom=Default, area=0.0]";
		assertEquals(esperado, resultado.toString());
		
	}
	
	
}
