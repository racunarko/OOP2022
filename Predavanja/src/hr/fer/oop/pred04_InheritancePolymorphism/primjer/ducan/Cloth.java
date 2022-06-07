package hr.fer.oop.pred04_InheritancePolymorphism.primjer.ducan;

public class Cloth extends Item {

	private double size;
	
	public Cloth(String sku, String name, double netSalePrice, double size) {
		//ovdje ručno zovemo super konstruktor
		//inače bi se pozvao super() tj. defaultni, ali mi baš želimo ovaj s 3 par.
		super(sku, name, netSalePrice); 
		System.out.println("Cloth constr. s 4 par");
		this.size = size;
	}

	public double getSize() {
		return size;
	}
	
	public String getItemType() {
		return "Cloth";
	}

	public void setSize(double size) {
		this.size = size;
	}
	
	@Override
	public String toString() {
		return super.toString() + " size: " + size;
	}	
	
}
