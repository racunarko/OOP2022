package hr.fer.oop.pred04.primjer.ducan;

public class Item {

	private String SKU;
	private String name;
	private double netSalePrice;
	
	public Item() {
		System.out.println("def. item constr.");
	}

	public Item(String sku, String name, double netSalePrice) {
		SKU = sku;
		this.name = name;
		this.netSalePrice = netSalePrice;
		System.out.println("Item constructor s 3 par.");
	}
	
	public Item(String sku, String name) {
		this(sku, name, 0);
		System.out.println("Item constructor s 2 par.");
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getNetSalePrice() {
		return netSalePrice;
	}

	public void setNetSalePrice(double netSalePrice) {
		this.netSalePrice = netSalePrice;
	}

	//ne želimo da nam netko nadjača getSKU()
	//zato smo stavili "final" ispred metode
	public final String getSKU() {
		return SKU;
	}
	
	public double getVAT() {
		return 0.25;
	}
	
	public double getPrice(int count) {
		return count*netSalePrice * (1 + this.getVAT());
	}
	
	//ova metoda nema smisla, tj. u klasi Item ne znamo što vratiti
	//vraćanje stringa "item" nije baš smisleno... ali za sad ne znamo
	//kako reći "mora postojati ova metoda ali je ne znam implementirati u ovoj klasi"
	public String getItemType() {
		return "Item";
	}

	@Override
	public String toString() {
		return getSKU() + " : " + name + "(" + netSalePrice + ")";
	}	
	
}
