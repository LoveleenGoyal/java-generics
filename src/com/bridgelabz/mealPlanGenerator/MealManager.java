package com.bridgelabz.mealPlanGenerator;

import java.util.ArrayList;
import java.util.List;

public class MealManager {
    private List<Meal<? extends MealPlan>> meals = new ArrayList<>();

    public void addMeal(Meal<? extends MealPlan> meal) {
        meals.add(meal);
    }

    public void displayMeals() {
        for (Meal<? extends MealPlan> meal : meals) {
            System.out.println(meal);
        }
    }

    public <T extends MealPlan> boolean validateMeal(T meal) {
        return meal != null && !meal.getMealName().isEmpty();
    }
}
