package hr.fer.oop.homework_03;

public class FoodType {
    /* 1. zadatak - javni atributi
     *public String name;
     *public int protein, carbs, fat;
     */
    // 2. zadatak
    private String name;
    private int protein, carbs, fat;

    //konstruktor
    public FoodType(String name, int protein, int carbs, int fat) {
        this.name = new String(name);
        this.protein = protein;
        this.carbs = carbs;
        this.fat = fat;
        FoodType.counter++;
    }

    // get metode
    public String getName() {
        return name;
    }

    public int getFat() {
        return fat;
    }

    public int getCarbs() {
        return carbs;
    }

    public int getProtein() {
        return protein;
    }

    // 3. zadatak
    public String toString() {
        return String.format("%s: p - %d%%, c - %d%%, f - %d%%", name, protein, carbs, fat);
    }

    // 4. zadatak
    private static int counter;

    static int getNumberOfCreatedInstances() {
        return counter;
    }

}
