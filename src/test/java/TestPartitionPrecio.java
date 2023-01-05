import org.junit.Test;
import org.junit.*;
import static org.junit.Assert.*;

import org.junit.BeforeClass;

public class TestPartitionPrecio {

	Manzanas m1= new Manzanas(4.5f, "verde");
	Manzanas m2= new Manzanas(-4.5f, "verde");
	
	public Object expectedArray[]= {"verde"};
	
	@BeforeClass
	 public static void beforeClass() {
		System.out.println("\nPruebas de particion atributo Precio\n");
	 }
	
	@Test
	public void testcomprar() {
		assertTrue(m1.comprar());
	}
	
	@Test 
	public void testcomprar2() {
		assertFalse(m2.comprar());
	}
	
	
	
	@Test
	public void testprecioTotal() {
		m1.AddManzana("rojo");
		assertEquals(9f, m1.precioTotal(),0);
		
	}
}
