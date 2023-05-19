package org.example.entity;

import org.example.strategy.Preference;

import java.util.List;

public abstract class Meal {

    private String name;
    private String ingredientList;
    private String recipe;
    private String servingSize;
    private float rate;

    private String category;

    private Preference preference;

    public Meal(String name, String ingredientList, String recipe, String servingSize, Preference preference,String category) {
        this.name = name;
        this.ingredientList = ingredientList;
        this.recipe = recipe;
        this.servingSize = servingSize;

        this.preference = preference;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIngredientList() {
        return ingredientList;
    }

    public void setIngredientList(String ingredientList) {
        this.ingredientList = ingredientList;
    }

    public String getRecipe() {
        return recipe;
    }

    public void setRecipe(String recipe) {
        this.recipe = recipe;
    }

    public String getServingSize() {
        return servingSize;
    }

    public void setServingSize(String servingSize) {
        this.servingSize = servingSize;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public float getRate() {
        return rate;
    }

    public void setRate(float rate) {
        if (getRate() ==0){
            this.rate = rate;
        }
        else {
            float rate1 = (getRate() + rate)/2;
            this.rate = rate1;
        }

    }

    public String executePreference(){
        return preference.preference();
    }

    @Override
    public String toString() {
        return "Meal{" +
                "name='" + name + '\'' +
                ", ingredientList='" + ingredientList + '\'' +
                ", recipe='" + recipe + '\'' +
                ", servingSize='" + servingSize + '\'' +
                ", rate=" + rate +
                ", category='" + category + '\'' +
                ", preference=" + preference.preference() +
                '}';
    }
}
