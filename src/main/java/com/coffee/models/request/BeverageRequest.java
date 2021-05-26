package com.coffee.models.request;

import com.coffee.constants.enums.Beverage;

import java.util.List;

public class BeverageRequest {
    List<Beverage> beverage;

    public List<Beverage> getBeverage() {
        return beverage;
    }

    public void setBeverage(List<Beverage> beverage) {
        this.beverage = beverage;
    }

}
