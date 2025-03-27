package com.bridgelabz.mealPlanGenerator;

public class PersonalizedMealPlan {
    public static void main(String[] args) {
        Meal<VegetarianMeal> vegMeal = new Meal<>(new VegetarianMeal("Grilled Veggie Salad"));
        Meal<VeganMeal> veganMeal = new Meal<>(new VeganMeal("Tofu Stir-Fry"));
        Meal<KetoMeal> ketoMeal = new Meal<>(new KetoMeal("Grilled Chicken with Avocado"));

        MealManager manager = new MealManager();
        manager.addMeal(vegMeal);
        manager.addMeal(veganMeal);
        manager.addMeal(ketoMeal);

        System.out.println("Available Meal Plans:");
        manager.displayMeals();

        // Validate a meal
        System.out.println("\nValidating Meals:");
        System.out.println("Vegetarian Meal Valid: " + manager.validateMeal(vegMeal.getMeal()));
        System.out.println("Vegan Meal Valid: " + manager.validateMeal(veganMeal.getMeal()));
        System.out.println("Keto Meal Valid: " + manager.validateMeal(ketoMeal.getMeal()));
    }
}
