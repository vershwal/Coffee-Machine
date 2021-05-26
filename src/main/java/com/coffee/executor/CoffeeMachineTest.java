package com.coffee.executor;

import com.coffee.constants.enums.Beverage;
import com.coffee.models.domain.CoffeeMachine;
import com.coffee.models.request.BeverageRequest;

import java.util.LinkedList;
import java.util.List;

public class CoffeeMachineTest {
    void testCoffeeMachine(CoffeeMachine coffeeMachine) {

        System.out.println("------------------ Test Case 1 ------------------");
        System.out.println("Testing: N=2 and all ingredients present");
        BeverageRequest beverageRequest1 = new BeverageRequest();
        List<Beverage> beverageList1 = new LinkedList<Beverage>();
        beverageList1.add(Beverage.TEA);
        beverageList1.add(Beverage.COFFEE);
        beverageList1.add(Beverage.TEA);
        beverageRequest1.setBeverage(beverageList1);
        coffeeMachine.prepareBeverages(beverageRequest1);

        coffeeMachine.refill(); //Refilling ingredients

        System.out.println("\n------------------ Test Case 2 ------------------");
        System.out.println("Testing: N=2 and ingredients dry out");
        BeverageRequest beverageRequest2 = new BeverageRequest();
        List<Beverage> beverageList2 = new LinkedList<Beverage>();
        beverageList2.add(Beverage.TEA);
        beverageList2.add(Beverage.COFFEE);
        beverageList2.add(Beverage.BLACK_TEA);
        beverageRequest2.setBeverage(beverageList2);
        coffeeMachine.prepareBeverages(beverageRequest2);

        coffeeMachine.refill();

        System.out.println("\n------------------ Test Case 3 ------------------");
        System.out.println("Testing: N=2 and requesting a beverage which is currently not available");
        BeverageRequest beverageRequest3 = new BeverageRequest();
        List<Beverage> beverageList3 = new LinkedList<Beverage>();
        beverageList3.add(Beverage.BLACK_TEA);
        beverageList3.add(Beverage.HOT_CHOCOLATE);
        beverageRequest3.setBeverage(beverageList3);
        coffeeMachine.prepareBeverages(beverageRequest3);

        coffeeMachine.refill();
        coffeeMachine.changeTotalTapsAvailable(3); //changing number of taps available.

        System.out.println("\n------------------ Test Case 4 ------------------");
        System.out.println("Testing: N=3 changed N and all ingredients present");
        BeverageRequest beverageRequest4 = new BeverageRequest();
        List<Beverage> beverageList4 = new LinkedList<Beverage>();
        beverageList4.add(Beverage.TEA);
        beverageList4.add(Beverage.COFFEE);
        beverageList4.add(Beverage.TEA);
        beverageRequest4.setBeverage(beverageList4);
        coffeeMachine.prepareBeverages(beverageRequest4);

        coffeeMachine.refill();

        System.out.println("\n------------------ Test Case 5 ------------------");
        System.out.println("Testing: N=3 and number of requests are less than available taps");
        BeverageRequest beverageRequest5 = new BeverageRequest();
        List<Beverage> beverageList5 = new LinkedList<Beverage>();
        beverageList5.add(Beverage.GREEN_TEA);
        beverageList5.add(Beverage.BLACK_TEA);
        beverageRequest5.setBeverage(beverageList5);
        coffeeMachine.prepareBeverages(beverageRequest5);

    }
}
