package com.coffee.constants;

public class MachineConstants {

    public static final Integer INITIAL_HOT_WATER_QUANTITY = 500;
    public static final Integer INITIAL_HOT_MILK_QUANTITY = 500;
    public static final Integer INITIAL_GINGER_SYRUP_QUANTITY = 100;
    public static final Integer INITIAL_SUGAR_SYRUP_QUANTITY = 100;
    public static final Integer INITIAL_TEA_LEAVES_SYRUP_QUANTITY = 100;
    public static final Integer INITIAL_COFFEE_POWDER_QUANTITY = 100;
    public static final Integer DEFAULT_TAPS = 5;
    public static final Integer DEFAULT_AVAILABLE_TAPS = 2;

    public static  class Tea {
        public static final Integer HOT_WATER = 200;
        public static final Integer HOT_MILK = 100;
        public static final Integer GINGER_SYRUP = 10;
        public static final Integer SUGAR_SYRUP = 10;
        public static final Integer TEA_LEAVES_SYRUP = 30;
    }

    public static  class Coffee {
        public static final Integer HOT_WATER = 100;
        public static final Integer HOT_MILK = 200;
        public static final Integer SUGAR_SYRUP = 50;
        public static final Integer COFFEE_POWDER = 30;
    }

    public static  class BlackTea {
        public static final Integer HOT_WATER = 300;
        public static final Integer GINGER_SYRUP = 30;
        public static final Integer TEA_LEAVES_SYRUP = 30;
    }

    public static  class GreenTea {
        public static final Integer HOT_WATER = 200;
        public static final Integer GINGER_SYRUP = 30;
        public static final Integer SUGAR_SYRUP = 40;
        public static final Integer TEA_LEAVES_SYRUP = 10;
    }

    public static  class ExceptionMessage {
        public static final String BEVERAGE_NOT_AVAILABLE = " Beverage is currently not available.";
        public static final String WRONG_TAPS_INPUT = "Available tabs cannot be more than machine tabs";
    }

}
