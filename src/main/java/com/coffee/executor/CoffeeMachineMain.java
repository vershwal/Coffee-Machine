package com.coffee.executor;

import com.coffee.models.domain.CoffeeMachine;

public class CoffeeMachineMain {

    public static void main(String[] args) {
        CoffeeMachine coffeeMachine = CoffeeMachine.getInstance();
        CoffeeMachineTest coffeeMachineTest = new CoffeeMachineTest();
        coffeeMachine.start();
        coffeeMachineTest.testCoffeeMachine(coffeeMachine);

    }
}
