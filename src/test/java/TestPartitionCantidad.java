import org.junit.Test;
import org.junit.*;
import static org.junit.Assert.*;

import org.junit.BeforeClass;

public class TestPartitionCantidad {

	Manzanas m1= new Manzanas(4.5f, "verde");
	
	
	public Object expectedArray[]= {"verde"};
	
	@BeforeClass
	 public static void beforeClass() {
		System.out.println("\nPruebas de particion atributo cantidadManzanas\n");	
	 }
	
	@Test
	public void testConstructor2() {
		assertNotNull(m1);
	}
	
	
	@Test
	public void testprecioTotal() {
		assertEquals(4.5f, m1.precioTotal(),0);
		
	}
	
	@Test
	public void testAddManzana() {
		assertEquals(2, m1.AddManzana("rojo"));
	}
}
