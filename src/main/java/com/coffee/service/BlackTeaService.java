package com.coffee.service;

import com.coffee.constants.MachineConstants;
import com.coffee.constants.enums.Ingredient;

import java.util.Map;

public class BlackTeaService implements IBeverageService{
    public void prepareBeverage(Map<Ingredient,Integer> ingredientMap) {
        if(ingredientMap.get(Ingredient.HOT_WATER) < MachineConstants.BlackTea.HOT_WATER) {
            System.out.println("Black Tea cannot be prepared because hot water is not available.");
        } else if(ingredientMap.get(Ingredient.GINGER_SYRUP) < MachineConstants.BlackTea.GINGER_SYRUP) {
            System.out.println("Black Tea cannot be prepared because ginger syrup is not available.");
        } else if(ingredientMap.get(Ingredient.TEA_LEAVES_SYRUP) < MachineConstants.BlackTea.TEA_LEAVES_SYRUP) {
            System.out.println("Black Tea cannot be prepared because Tea leaves syrup is not available.");
        } else {
            ingredientMap.put(Ingredient.HOT_WATER, ingredientMap.get(Ingredient.HOT_WATER) - MachineConstants.BlackTea.HOT_WATER);
            ingredientMap.put(Ingredient.GINGER_SYRUP, ingredientMap.get(Ingredient.GINGER_SYRUP) - MachineConstants.BlackTea.GINGER_SYRUP);
            ingredientMap.put(Ingredient.TEA_LEAVES_SYRUP, ingredientMap.get(Ingredient.TEA_LEAVES_SYRUP) - MachineConstants.BlackTea.TEA_LEAVES_SYRUP);
            System.out.println("Black Tea is prepared.");
        }
    }
}
