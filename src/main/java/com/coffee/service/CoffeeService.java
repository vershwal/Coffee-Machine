package com.coffee.service;

import com.coffee.constants.MachineConstants;
import com.coffee.constants.enums.Ingredient;

import java.util.Map;

public class CoffeeService implements IBeverageService{
    public void prepareBeverage(Map<Ingredient,Integer> ingredientMap) {
        if(ingredientMap.get(Ingredient.HOT_WATER) < MachineConstants.Coffee.HOT_WATER) {
            System.out.println("Coffee cannot be prepared because hot water is not available.");
        } else if(ingredientMap.get(Ingredient.HOT_MILK) < MachineConstants.Coffee.HOT_MILK) {
            System.out.println("Coffee cannot be prepared because hot milk is not available.");
        } else if(ingredientMap.get(Ingredient.COFFEE_POWDER) < MachineConstants.Coffee.COFFEE_POWDER) {
            System.out.println("Coffee cannot be prepared because coffee powder is not available.");
        } else if(ingredientMap.get(Ingredient.SUGAR_SYRUP) < MachineConstants.Coffee.SUGAR_SYRUP) {
            System.out.println("Coffee cannot be prepared because sugar syrup is not available.");
        } else {
            ingredientMap.put(Ingredient.HOT_WATER, ingredientMap.get(Ingredient.HOT_WATER) - MachineConstants.Coffee.HOT_WATER);
            ingredientMap.put(Ingredient.HOT_MILK, ingredientMap.get(Ingredient.HOT_MILK) - MachineConstants.Coffee.HOT_MILK);
            ingredientMap.put(Ingredient.COFFEE_POWDER, ingredientMap.get(Ingredient.COFFEE_POWDER) - MachineConstants.Coffee.COFFEE_POWDER);
            ingredientMap.put(Ingredient.SUGAR_SYRUP, ingredientMap.get(Ingredient.SUGAR_SYRUP) - MachineConstants.Coffee.SUGAR_SYRUP);
            System.out.println("Coffee is prepared.");
        }

    }
}
