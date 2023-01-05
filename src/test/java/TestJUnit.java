import org.junit.Test;
import org.junit.*;
import static org.junit.Assert.*;

public class TestJUnit {
	
	 private Manzanas m1;
	 private Manzanas m2;
	
	 private Object[] expectedArray= {" "};

	 @Before
	 public void before() {
		 m1= new Manzanas(4.5f,"verde");
		 m2= new Manzanas(4.5f,"verde");
		 expectedArray[0]= "verde";
		 
	 }
	
	 @BeforeClass
	 public static void beforeClass() {
		 System.out.println("Pruebas de Unidad");
	 }
	 
	@Test //falla
	public void testConstructor() {
		assertNull(m1);
	}
	
	
	@Test
	public void testConstructor2() {
		assertNotNull(m1);
	}
	
	@Test //falla
	public void testConstructor3() {
		
		assertSame(m1, m2);
	}
	
	@Test
	public void testConstructor4() {
		
		assertNotSame(m1, m2);
	}
	
	@Test
	public void testcomprar() {
		assertTrue(m1.comprar());
	}
	
	@Test //falla
	public void testcomprar2() {
		assertFalse(m1.comprar());
	}
	
	@Test
	public void testgetManzanas() {
		assertArrayEquals(expectedArray, m1.getManzanas());
	}
	
	@Test
	public void testprecioTotal() {
		assertEquals(4.5f, m1.precioTotal(),0);
		
	}
	
	@Test //falla
	public void testAddManzana() {
		assertEquals(1, m1.AddManzana("rojo"));
	}
	
	@AfterClass
	public static void afterClass() {
	System.out.println("-----------------------------------------------------------------------");
	}
	
	@After
	public void after() {
		m1=null;
		m2=null;
		expectedArray=null;
	}
	
	@Ignore
	public void ignore() {
		System.out.println(m1.AddManzana("azul"));
	}
	
	
	
}
