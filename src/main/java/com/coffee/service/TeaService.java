package com.coffee.service;

import com.coffee.constants.MachineConstants;
import com.coffee.constants.enums.Ingredient;

import java.util.Map;

public class TeaService implements IBeverageService {
    public void prepareBeverage(Map<Ingredient,Integer> ingredientMap) {
        if(ingredientMap.get(Ingredient.HOT_WATER) < MachineConstants.Tea.HOT_WATER) {
            System.out.println("Tea cannot be prepared because hot water is not available.");
        } else if(ingredientMap.get(Ingredient.HOT_MILK) < MachineConstants.Tea.HOT_MILK) {
            System.out.println("Tea cannot be prepared because hot milk is not available.");
        } else if(ingredientMap.get(Ingredient.GINGER_SYRUP) < MachineConstants.Tea.GINGER_SYRUP) {
            System.out.println("Tea cannot be prepared because ginger syrup is not available.");
        } else if(ingredientMap.get(Ingredient.SUGAR_SYRUP) < MachineConstants.Tea.SUGAR_SYRUP) {
            System.out.println("Tea cannot be prepared because sugar syrup is not available.");
        } else if(ingredientMap.get(Ingredient.TEA_LEAVES_SYRUP) < MachineConstants.Tea.TEA_LEAVES_SYRUP) {
            System.out.println("Tea cannot be prepared because tea leaves syrup is not available.");
        } else {
            ingredientMap.put(Ingredient.HOT_WATER, ingredientMap.get(Ingredient.HOT_WATER) - MachineConstants.Tea.HOT_WATER);
            ingredientMap.put(Ingredient.HOT_MILK, ingredientMap.get(Ingredient.HOT_MILK) - MachineConstants.Tea.HOT_MILK);
            ingredientMap.put(Ingredient.GINGER_SYRUP, ingredientMap.get(Ingredient.GINGER_SYRUP) - MachineConstants.Tea.GINGER_SYRUP);
            ingredientMap.put(Ingredient.SUGAR_SYRUP, ingredientMap.get(Ingredient.SUGAR_SYRUP) - MachineConstants.Tea.SUGAR_SYRUP);
            ingredientMap.put(Ingredient.TEA_LEAVES_SYRUP, ingredientMap.get(Ingredient.TEA_LEAVES_SYRUP) - MachineConstants.Tea.TEA_LEAVES_SYRUP);
            System.out.println("Tea is prepared.");
        }

    }
}
