import java.util.ArrayList;


public class Manzanas {

	private ArrayList<String> Manzanas= new ArrayList<String>();
	private float precioManzana;
	private int cantidadManzanas;
	
	/**
	 * Constructor donde se crea una cesta de manzanas
	 * @param cantManzanas
	 * @param kilosTotal
	 */
	public Manzanas(float precioManzana,String colorManzanas) {
		
		this.precioManzana= precioManzana;
		
		this.cantidadManzanas=1;
		this.Manzanas.add(colorManzanas);
		
		
		System.out.println("Cesta de manzanas creada");
	}
	
	
	
	/****/
	public int AddManzana(String color) {
		
		this.Manzanas.add(color);
		
		return this.cantidadManzanas=this.Manzanas.size();
		
	}
	
	public float precioTotal() {
		return this.precioManzana * this.cantidadManzanas;
	}

	//Assert arrayEquals
	
	public Object[] getManzanas() {
		return this.Manzanas.toArray();
	}
	
	
	/**Assert true **/
	/**Assert false **/
	
	public boolean comprar() {
		
		
		if(this.precioManzana<=0) {
			
			return false;
			
		}else {
			System.out.println("Manzana comprada");
			return true;
		}
	}
	
	
	
}
