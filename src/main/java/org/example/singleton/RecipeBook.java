package org.example.singleton;

import org.example.entity.Meal;

import java.util.ArrayList;
import java.util.List;

public class RecipeBook {

    //Singleton Design Pattern
    private static RecipeBook recipeBook = new RecipeBook();

    private List<Meal> mealList;


    private RecipeBook(){
        this.mealList = new ArrayList<>();
    }

    public static RecipeBook getInstance(){
        return recipeBook;
    }

    public List<Meal> getMealList() {
        return mealList;
    }

    public void setMealList(Meal meal) {
        getMealList().add(meal);
        this.mealList = getMealList();
    }
}
