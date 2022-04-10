package hr.fer.oop.pred04.primjer.ducan;

public class Food extends Item {

	private double weight;
	
	public Food(String sku, String name, double netSalePrice, double weight) {
		//ovdje ručno zovemo super konstruktor
		//inače bi se pozvao super() tj. defaultni, ali mi baš želimo ovaj s 3 par.
		super(sku, name, netSalePrice);
		System.out.println("Food constr. s 4 parametra");
		this.weight = weight;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	@Override
	public double getVAT() {
		return 0.13;
	}
	
	public String getItemType() {
		return "Food";
	}
	
	//Ne želim da izvedene klase nadjačaju getSKU() iz Item-a
	//zato smo u kalsi Item stavili ključnu riječ "final" ispred metode
	//pa se compiler buni na ovo dolje
//	@Override
//	public String getSKU() {
//		return "aaaaaaaaaa";
//	}
	
	@Override
	public String toString() {
		return super.toString() + " weight: " + weight;
	}	
}
