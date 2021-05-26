package com.coffee.service;

import com.coffee.constants.MachineConstants;
import com.coffee.constants.enums.Ingredient;

import java.util.Map;

public class GreenTeaService implements IBeverageService{
    public void prepareBeverage(Map<Ingredient,Integer> ingredientMap) {
        if(ingredientMap.get(Ingredient.HOT_WATER) < MachineConstants.GreenTea.HOT_WATER) {
            System.out.println("Green Tea cannot be prepared because hot water is not available.");
        } else if(ingredientMap.get(Ingredient.GINGER_SYRUP) < MachineConstants.GreenTea.GINGER_SYRUP) {
            System.out.println("Green Tea cannot be prepared because ginger syrup is not available.");
        } else if(ingredientMap.get(Ingredient.TEA_LEAVES_SYRUP) < MachineConstants.GreenTea.TEA_LEAVES_SYRUP) {
            System.out.println("Green Tea cannot be prepared because tea leaves syrup is not available.");
        } else if(ingredientMap.get(Ingredient.SUGAR_SYRUP) < MachineConstants.GreenTea.SUGAR_SYRUP) {
            System.out.println("Green Tea cannot be prepared because sugar syrup is not available.");
        } else {
            ingredientMap.put(Ingredient.HOT_WATER, ingredientMap.get(Ingredient.HOT_WATER) - MachineConstants.GreenTea.HOT_WATER);
            ingredientMap.put(Ingredient.GINGER_SYRUP, ingredientMap.get(Ingredient.GINGER_SYRUP) - MachineConstants.GreenTea.GINGER_SYRUP);
            ingredientMap.put(Ingredient.TEA_LEAVES_SYRUP, ingredientMap.get(Ingredient.TEA_LEAVES_SYRUP) - MachineConstants.GreenTea.TEA_LEAVES_SYRUP);
            ingredientMap.put(Ingredient.SUGAR_SYRUP, ingredientMap.get(Ingredient.SUGAR_SYRUP) - MachineConstants.GreenTea.SUGAR_SYRUP);
            System.out.println("Green Tea is prepared.");
        }
    }
}
