package hr.fer.oop.homework_03;

public class Main {
    public static void main(String[] args) {
        FoodType foodType = new FoodType("banana", 4, 93, 3);
        Food food = new Food(foodType, 110);
        System.out.println("protein: " + food.getProtein() + "\ncarbs: " + food.getCarbs() + "\nfat: " + food.getFat());
        System.out.println(food.toStringInGrams());

        FoodType banana = new FoodType("banana", 4, 93, 3);
        Food oneBanana = new Food(banana, 110);

        FoodType grapes = new FoodType("grapes", 4, 94, 2);
        Food grapeCluster = new Food(grapes, 151);

        Meal fruitSalad = new Meal(oneBanana, grapeCluster);
        fruitSalad.printIngredients();
        System.out.println("*** printing ingredients");
        for(int i = -1; i <= fruitSalad.getNumberOfIngredients(); i++) {
            System.out.println("Ingredient[" + i + "] = " + fruitSalad.getIngredient(i));
        }

        System.out.println("* original meal:");
        fruitSalad.printIngredients();

        System.out.println("* new meal:");
        Meal doubleFruitSalad = new Meal(fruitSalad, 522);
        doubleFruitSalad.printIngredients();


        FoodType milk = new FoodType("milk", 3, 5, 2);
        FoodType palenta = new FoodType("palenta", 2, 16, 0);
        FoodType cornFlakes = new FoodType("corn flakes", 7, 83, 1);

        Meal palentaMeal = new Meal(new Food(milk, 500), new Food(palenta, 200));
        Meal cornFlakesMeal = new Meal(new Food(milk, 200), new Food(cornFlakes, 100));
        System.out.println("similarity is: " + palentaMeal.compare(cornFlakesMeal));
    }
}