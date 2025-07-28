interface MealPlan {
    void displayPlan();
}

class VegetarianMeal implements MealPlan {
    public void displayPlan() {
        System.out.println("Vegetarian Meal Plan");
    }
}

class VeganMeal implements MealPlan {
    public void displayPlan() {
        System.out.println("Vegan Meal Plan");
    }
}

class KetoMeal implements MealPlan {
    public void displayPlan() {
        System.out.println("Keto Meal Plan");
    }
}

class Meal<T extends MealPlan> {
    private T plan;
    public Meal(T plan) {
        this.plan = plan;
    }
    public void showMeal() {
        plan.displayPlan();
    }
    public static <T extends MealPlan> void generateMealPlan(T plan) {
        System.out.print("Generated: ");
        plan.displayPlan();
    }
}

public class MealPlanMain {
    public static void main(String[] args) {
        VegetarianMeal veg = new VegetarianMeal();
        VeganMeal vegan = new VeganMeal();
        KetoMeal keto = new KetoMeal();

        Meal.generateMealPlan(veg);
        Meal.generateMealPlan(vegan);
        Meal.generateMealPlan(keto);

        Meal<VegetarianMeal> meal = new Meal<>(veg);
        meal.showMeal();
    }
}
