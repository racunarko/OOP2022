package hr.fer.oop.pred04_InheritancePolymorphism.primjer.ducan;

public class Beverage extends Item {

	private double volume;
	
	public Beverage() {
		//super(); // - ovo ne moramo pisati, jer će java automatski pozvati super() 
		System.out.println("Bev constr.");
	}

	public Beverage(String sku, String name, double netSalePrice, double volume) {
		//ovdje ručno zovemo super konstruktor
		//inače bi se pozvao super() tj. defaultni, ali mi baš želimo ovaj s 3 par.
		super(sku, name, netSalePrice); 
		System.out.println("Bev constr. s 4 par");
		this.volume = volume;
	}
	
	public String getItemType() {
		return "Beverage";
	}
	
	//toString iz Item (tj. "nadređeni", gdje god bio) + dodatak: volumen pića
	@Override
	public String toString() {
		return super.toString() + " volume: " + volume;
	}	
	
}
