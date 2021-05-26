package com.coffee.models.domain;

import com.coffee.constants.MachineConstants;
import com.coffee.constants.enums.Beverage;
import com.coffee.constants.enums.Ingredient;
import com.coffee.exceptions.CoffeeMachineException;
import com.coffee.models.request.BeverageRequest;
import com.coffee.service.BeverageFactory;

import java.util.*;

import static com.coffee.constants.MachineConstants.*;

public class CoffeeMachine {

    private List<Beverage> beveragesAvailable; //List of Beverage currently available
    public Integer totalTaps ;
    private Integer totalTapsAvailable;
    private Map<Ingredient,Integer> ingredientMap; //Map of ingredients to available quantity;

    private static CoffeeMachine coffeeMachineInstance = null;
        private CoffeeMachine() {

    }

    public static CoffeeMachine getInstance(){
        if(coffeeMachineInstance == null){
            coffeeMachineInstance = new CoffeeMachine();
            return coffeeMachineInstance;
        }
        return coffeeMachineInstance;
    }

    public void start() {
        totalTaps = DEFAULT_TAPS;
        totalTapsAvailable = DEFAULT_AVAILABLE_TAPS;
        beveragesAvailable = new LinkedList<Beverage>();
        beveragesAvailable.add(Beverage.TEA);
        beveragesAvailable.add(Beverage.COFFEE);
        beveragesAvailable.add(Beverage.BLACK_TEA);
        beveragesAvailable.add(Beverage.GREEN_TEA);

        ingredientMap = new HashMap<Ingredient, Integer>();
        ingredientMap.put(Ingredient.HOT_WATER,INITIAL_HOT_WATER_QUANTITY);
        ingredientMap.put(Ingredient.HOT_MILK,INITIAL_HOT_MILK_QUANTITY);
        ingredientMap.put(Ingredient.GINGER_SYRUP,INITIAL_GINGER_SYRUP_QUANTITY);
        ingredientMap.put(Ingredient.SUGAR_SYRUP,INITIAL_SUGAR_SYRUP_QUANTITY);
        ingredientMap.put(Ingredient.COFFEE_POWDER,INITIAL_COFFEE_POWDER_QUANTITY);
        ingredientMap.put(Ingredient.TEA_LEAVES_SYRUP,INITIAL_TEA_LEAVES_SYRUP_QUANTITY);

    }

    public void refill() {
        ingredientMap.put(Ingredient.HOT_WATER,INITIAL_HOT_WATER_QUANTITY);
        ingredientMap.put(Ingredient.HOT_MILK,INITIAL_HOT_MILK_QUANTITY);
        ingredientMap.put(Ingredient.GINGER_SYRUP,INITIAL_GINGER_SYRUP_QUANTITY);
        ingredientMap.put(Ingredient.SUGAR_SYRUP,INITIAL_SUGAR_SYRUP_QUANTITY);
        ingredientMap.put(Ingredient.COFFEE_POWDER,INITIAL_COFFEE_POWDER_QUANTITY);
        ingredientMap.put(Ingredient.TEA_LEAVES_SYRUP,INITIAL_TEA_LEAVES_SYRUP_QUANTITY);
    }

    public void changeTotalTapsAvailable(Integer tapsAvailable) {
        if(tapsAvailable > DEFAULT_TAPS) {
            System.out.println(MachineConstants.ExceptionMessage.WRONG_TAPS_INPUT);
        } else
            totalTapsAvailable = tapsAvailable;
    }

    public void prepareBeverages(BeverageRequest beverageRequest) {
        List<Beverage> beverageList = beverageRequest.getBeverage();
        List<List<Beverage>> parallelBeverageRequests = new LinkedList<List<Beverage>>();
        for (int i=0 ; i < beverageList.size(); i += totalTapsAvailable) { //dividing total requests because we can only serve N requests in parallel
            parallelBeverageRequests.add(beverageList.subList(i, Math.min(i + totalTapsAvailable, beverageList.size())));
        }
        for (List<Beverage> parallelBeverageList : parallelBeverageRequests) {
            System.out.println("\nPreparing next " + parallelBeverageList.size() + " beverages....");
            for (Beverage beverage : parallelBeverageList) {
                if (!beveragesAvailable.contains(beverage))
                    System.out.println(beverage + ExceptionMessage.BEVERAGE_NOT_AVAILABLE);
                else {
                    BeverageFactory beverageFactory = new BeverageFactory();
                    beverageFactory.getBeverageService(beverage).prepareBeverage(ingredientMap);
                }
            }
        }
    }
}
