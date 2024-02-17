package com.yiga;

public class Main {

    public static void main(String[] args) {
//	    Pizza basePizza = new Pizza(false);
//        basePizza.getPizza();
//        basePizza.addExtraCheese();
//        basePizza.takeAway();
//        basePizza.getBill();

        DeluxePizza deluxe = new DeluxePizza(true);
        deluxe.takeAway();
        deluxe.getBill();
    }
}
