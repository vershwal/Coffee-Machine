package com.coffee.service;

import com.coffee.constants.enums.Ingredient;

import java.util.Map;

public interface IBeverageService {

    void prepareBeverage(Map<Ingredient,Integer> ingredientMap);
    
}
