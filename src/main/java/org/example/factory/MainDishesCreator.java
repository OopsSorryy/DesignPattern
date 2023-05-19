package org.example.factory;

import org.example.entity.MainDishes;
import org.example.entity.Meal;
import org.example.strategy.Preference;

import java.util.List;

public class MainDishesCreator extends Creator {

    //Factory Design Pattern
    @Override
    public Meal createMeal(String name, String ingredientList, String recipe, String servingSize, Preference preference) {
        return new MainDishes(name, ingredientList, recipe,servingSize,preference,"Main Dishes");
    }
}
