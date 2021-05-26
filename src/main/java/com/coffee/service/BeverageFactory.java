package com.coffee.service;

import com.coffee.constants.MachineConstants;
import com.coffee.constants.enums.Beverage;
import com.coffee.exceptions.CoffeeMachineException;

public class BeverageFactory {
    public IBeverageService getBeverageService(Beverage beverage) {
        switch (beverage) {
            case TEA:
                return new TeaService();
            case COFFEE:
                return new CoffeeService();
            case BLACK_TEA:
                return new BlackTeaService();
            case GREEN_TEA:
                return new GreenTeaService();
            default:
                throw new CoffeeMachineException(beverage + MachineConstants.ExceptionMessage.BEVERAGE_NOT_AVAILABLE);
        }
    }
}
