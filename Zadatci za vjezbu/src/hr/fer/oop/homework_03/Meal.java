package hr.fer.oop.homework_03;

public class Meal {
    private Food[] ingredients;
    public Meal(Food ... ingredients) {
        this.ingredients = new Food[ingredients.length];
        for(int i = 0; i < ingredients.length; i++) {
            this.ingredients[i] = ingredients[i];
        }
    }

    public Meal(Meal meal, int weight) {
        this.ingredients = new Food[meal.ingredients.length];
        for (int i = 0; i < meal.ingredients.length; i++) {
            this.ingredients[i] = new Food(meal.ingredients[i].getType(), meal.ingredients[i].getWeight() * weight / meal.getWeight());
        }
    }

    private int getWeight() {
        int weight = 0;
        for (int i = 0; i < ingredients.length; i++) {
            weight += ingredients[i].getWeight();
        }
        return weight;
    }

    public void printIngredients() {
        for(int i = 0; i < ingredients.length; i++) {
            System.out.printf("Ingredient[%d] = %s%n", i, ingredients[i].toStringInGrams());
        }
    }
    public int getNumberOfIngredients() {
        return ingredients.length;
    }
    public Food getIngredient(int index) {
        if(index >= ingredients.length || index < 0) {
            return null;
        }
        return ingredients[index];
    }

    public double compare (Meal other) {
        double similarityPercentage = 0.0;

        for (int i = 0; i < ingredients.length; i++) {
            Food otherIngredient = other.findFoodByType(ingredients[i].getType());
            if(otherIngredient == null) {
                continue;
            }
            double thisPercent = 100.0 * ingredients[i].getWeight() / getWeight();
            double otherPercent = 100.0 * otherIngredient.getWeight() / other.getWeight();

            similarityPercentage += Math.min(thisPercent, otherPercent);
        }
        return similarityPercentage;
    }

    private Food findFoodByType (FoodType type) {
        for (int i = 0 ; i < ingredients.length; i++) {
            if (ingredients[i].getType() == type) {
                return ingredients[i];
            }
        }
        return null;
    }
}
