package hr.fer.oop.homework_03;

public class Food {
    // 5. zadatak
    private int weight;
    private FoodType type;

    public Food(FoodType type, int weight) {
        this.type = type;
        this.weight = weight;
    }

    public FoodType getFoodType() {
        return type;
    }
    public int getWeight() {
        return weight;
    }

    public String toString() {
        return String.format("%s, w - %dg", type.toString(), weight);
    }

    // 6. zadatak
    public double getProtein() {
        return weight * type.getProtein() / 100.;
    }

    public double getCarbs() {
        return weight * type.getCarbs() / 100.;
    }

    public double getFat() {
        return weight * type.getFat() / 100.;
    }

    public FoodType getType() { return type; }

    public String toStringInGrams() {
        return String.format("%s: p - %.1fg, c - %.1fg, f - %.1fg, w - %dg", type.getName(), getProtein(), getCarbs(), getFat(), weight);
    }

}
