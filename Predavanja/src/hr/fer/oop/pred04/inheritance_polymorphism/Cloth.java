package hr.fer.oop.pred04.inheritance_polymorphism;

public class Cloth extends Item{
    private double size;

    public Cloth(String sku, String name, double size) {
        super(sku, name);
        this.size = size;
    }

    public Cloth(String sku, String name, double netSalePrice, double size) {
        super(sku, name, netSalePrice);
        this.size = size;
    }

    @Override
    public String getItemType() {
        return "Cloth";
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }
}
