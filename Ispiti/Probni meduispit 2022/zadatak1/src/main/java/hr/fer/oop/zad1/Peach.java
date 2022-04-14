package hr.fer.oop.zad1;

class Peach extends Fruit{
	private int peachDiameter;

	public Peach(String species, int numberOfFruits, double productionPrice, int peachDiameter) {
		super(species, numberOfFruits, productionPrice);
		this.peachDiameter = peachDiameter;
	}

	public int getPeachDiameter() {
		return peachDiameter;
	}

	public void setPeachDiameter(int peachDiameter) {
		this.peachDiameter = peachDiameter;
	}

	@Override
	public double myMarketPrice() {
		double pricePerFruit = getProductionPrice() / getNumberOfFruits();
		return (peachDiameter >= 2 && peachDiameter <= 8) ? 1.4 * pricePerFruit : 1.3 * pricePerFruit;
	}
}
