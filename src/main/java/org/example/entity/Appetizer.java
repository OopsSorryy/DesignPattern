package org.example.entity;

import org.example.strategy.Preference;

import java.util.List;

public class Appetizer extends Meal {

    public Appetizer(String name, String ingredientList, String recipe, String servingSize,  Preference preference,String category) {
        super(name, ingredientList, recipe, servingSize, preference,category);
    }
}
