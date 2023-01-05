import org.junit.Test;
import org.junit.*;
import static org.junit.Assert.*;

import org.junit.BeforeClass;

public class TestPartitionManzanas {

	Manzanas m1= new Manzanas(4.5f, "verde");

	
	public Object expectedArray[]= {"verde","rojo"};
	
	
	@BeforeClass
	 public static void beforeClass() {
		System.out.println("\nPruebas de particion atributo manzanas\n");	
	 }
	
	@Test
	public void testConstructor2() {
		assertNotNull(m1);
	}
	
	
	@Test
	public void testgetManzanas() {
		m1.AddManzana("rojo");
		assertArrayEquals(expectedArray, m1.getManzanas());
	}
	

	@Test 
	public void testAddManzana() {
		assertEquals(2, m1.AddManzana("rojo"));
	}
	
}

