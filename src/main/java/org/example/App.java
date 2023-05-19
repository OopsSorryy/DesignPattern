package org.example;


import org.example.entity.Meal;
import org.example.factory.AppetizerCreator;
import org.example.factory.Creator;
import org.example.factory.DessertCreator;
import org.example.factory.MainDishesCreator;
import org.example.singleton.RecipeBook;
import org.example.strategy.GlutenFree;
import org.example.strategy.Spicy;
import org.example.strategy.Vegetarian;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class App
{
    public static void main( String[] args )
    {
        RecipeBook recipeBook = RecipeBook.getInstance();

        Scanner scanner = new Scanner(System.in);

        try{
            Menu(scanner,recipeBook);
        }
        catch (Exception e){
            System.out.println("Wrong Input");
        }


    }

    public static void Menu(Scanner scanner,RecipeBook recipeBook){


        while (true){

            recipeBook.getMealList().forEach(System.out::println);
            System.out.println("You can choose 1 for Create Recipe\n" +
                    "You can choose 2 for Search Recipe\n" +
                    "You can choose 3 for Rate Recipe\n" +
                    "You can choose 4 for Modify Recipe\n" +
                    "You can choose 0 for Exit");

            int prefer = scanner.nextInt();

           if (prefer == 1){
               System.out.println("What will you create\n" +
                       "1-Main Dishes\n" +
                       "2-Dessert\n" +
                       "3-Appetizer");
               int preferCreate = scanner.nextInt();
               if (preferCreate ==1){
                   System.out.println("Enter name");
                   scanner.nextLine();
                   String name = scanner.nextLine();
                   System.out.println("Enter ingredients");
                   String ingredients = scanner.nextLine();
                   System.out.println("Enter the recipe");
                   String recipe =scanner.nextLine();
                   System.out.println("Enter the Serving Size");
                   String servingSize =scanner.nextLine();


                   System.out.println("Please choose preference\n" +
                           "1-Vegetarian\n" +
                           "2-Spicy\n" +
                           "3-Gluten-Free");
                   int choosePreference = scanner.nextInt();

                   Creator creator = new MainDishesCreator();
                   if (choosePreference == 1){
                       Meal meal = creator.createMeal(name,ingredients,recipe,servingSize,new Vegetarian());
                       System.out.println(meal.executePreference());
                       recipeBook.setMealList(meal);
                   }
                   else if (choosePreference == 2) {
                       Meal meal = creator.createMeal(name,ingredients,recipe,servingSize,new Spicy());
                       System.out.println(meal.executePreference());
                       recipeBook.setMealList(meal);
                   }
                   else if (choosePreference == 3) {
                       Meal meal = creator.createMeal(name,ingredients,recipe,servingSize,new GlutenFree());
                       System.out.println(meal.executePreference());
                       recipeBook.setMealList(meal);
                   }
               }
               else if (preferCreate == 2) {
                   scanner.nextLine();
                   System.out.println("Enter name");
                   String name = scanner.nextLine();
                   System.out.println("Enter ingredients");
                   String ingredients = scanner.nextLine();
                   System.out.println("Enter the recipe");
                   String recipe =scanner.nextLine();
                   System.out.println("Enter the Serving Size");
                   String servingSize =scanner.nextLine();


                   System.out.println("Please choose preference\n" +
                           "1-Vegetarian\n" +
                           "2-Spicy\n" +
                           "3-Gluten-Free");
                   int choosePreference = scanner.nextInt();

                   Creator creator = new DessertCreator();
                   if (choosePreference == 1){
                       Meal meal = creator.createMeal(name,ingredients,recipe,servingSize,new Vegetarian());
                       System.out.println(meal.executePreference());
                       recipeBook.setMealList(meal);
                   }
                   else if (choosePreference == 2) {
                       Meal meal = creator.createMeal(name,ingredients,recipe,servingSize,new Spicy());
                       System.out.println(meal.executePreference());
                       recipeBook.setMealList(meal);
                   }
                   else if (choosePreference == 3) {
                       Meal meal = creator.createMeal(name,ingredients,recipe,servingSize,new GlutenFree());
                       System.out.println(meal.executePreference());
                       recipeBook.setMealList(meal);
                   }
               }
               else if (preferCreate == 3) {
                   scanner.nextLine();
                   System.out.println("Enter name");
                   String name = scanner.nextLine();
                   System.out.println("Enter ingredients");
                   String ingredients = scanner.nextLine();
                   System.out.println("Enter the recipe");
                   String recipe =scanner.nextLine();
                   System.out.println("Enter the Serving Size");
                   String servingSize =scanner.nextLine();


                   System.out.println("Please choose preference\n" +
                           "1-Vegetarian\n" +
                           "2-Spicy\n" +
                           "3-Gluten-Free");
                   int choosePreference = scanner.nextInt();

                   Creator creator = new AppetizerCreator();
                   if (choosePreference == 1){
                       Meal meal = creator.createMeal(name,ingredients,recipe,servingSize,new Vegetarian());
                       System.out.println(meal.executePreference());
                       recipeBook.setMealList(meal);
                   }
                   else if (choosePreference == 2) {
                       Meal meal = creator.createMeal(name,ingredients,recipe,servingSize,new Spicy());
                       System.out.println(meal.executePreference());
                       recipeBook.setMealList(meal);
                   }
                   else if (choosePreference == 3) {
                       Meal meal = creator.createMeal(name,ingredients,recipe,servingSize,new GlutenFree());
                       System.out.println(meal.executePreference());
                       recipeBook.setMealList(meal);
                   }
               }
           }
           else if (prefer == 2) {
               scanner.nextLine();
               System.out.println("Choose one category\n" +
                       "Main Dishes\n" +
                       "Dessert\n" +
                       "Appetizer");

               String category = scanner.nextLine();

                 List<Meal> mealList =recipeBook.getMealList().stream().
                         filter(meal -> meal.getCategory().equals(category)).
                         collect(Collectors.toList());

               mealList.forEach(System.out::println);

           }
           else if (prefer == 3) {
               scanner.nextLine();
               recipeBook.getMealList().forEach(meal -> System.out.println(meal.getName()));
               System.out.println("Select one of the name");
               String name = scanner.nextLine();
               Meal meal1 = recipeBook.getMealList().stream().filter(meal -> meal.getName().equals(name)).
                       collect(Collectors.toList()).get(0);
               System.out.println("Please enter a number between 1-5 for rating the meal");

               float rate = scanner.nextFloat();

               meal1.setRate(rate);

           }
           else if (prefer == 4) {
               scanner.nextLine();
               recipeBook.getMealList().forEach(meal -> System.out.println(meal.getName()));
               System.out.println("You can enter the name for modifying");
               String name = scanner.nextLine();
               Meal meal1 = recipeBook.getMealList().stream().filter(meal -> meal.getName().equals(name)).
                       collect(Collectors.toList()).get(0);
               System.out.println("Enter ingredients");
               String ingredients = scanner.nextLine();
               meal1.setIngredientList(ingredients);



           }
           else {
               if (prefer == 0){
                   return;
               }
           }
        }
    }
}
