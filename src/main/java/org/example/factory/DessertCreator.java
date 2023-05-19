package org.example.factory;

import org.example.entity.Dessert;
import org.example.entity.Meal;
import org.example.strategy.Preference;

import java.util.List;

public class DessertCreator extends Creator {

    //Factory Design Pattern
    @Override
    public Meal createMeal(String name, String ingredientList, String recipe, String servingSize, Preference preference) {
        return new Dessert(name, ingredientList, recipe,servingSize,preference,"Dessert");
    }
}
