package org.example.factory;

import org.example.entity.Meal;
import org.example.strategy.Preference;

import java.util.List;

public abstract class Creator {
    //Factory Design Pattern

    public abstract Meal createMeal(String name,
                                    String ingredientList,
                                    String recipe,
                                    String servingSize,
                                    Preference preference);
}
