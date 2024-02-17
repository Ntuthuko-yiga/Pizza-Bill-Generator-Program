package com.yiga;

public class Pizza {
    private int price;
    private Boolean veg;
    
    private final int extraCheese = 100;
    private final int extraToppings = 150;
    private final int takeAway = 50;

    private final int basePizzaPrice;

    private boolean isExtraCheeseAdded = false;
    private boolean isExtraToppingsAdded = false;
    private boolean isTakeAwayAdded = false;

    public Pizza(Boolean veg) {
        this.veg = veg;
        if(this.veg) {
            this.price = 300;
        } else {
            this.price = 400;
        }
        basePizzaPrice = this.price;
    }

    public void getPizza () {
        System.out.println(this.price);
    }
    
    public void addExtraCheese() {
        isExtraCheeseAdded = true;
        this.price += extraCheese;
    }
    
    public void addExtraToppings() {
        isExtraToppingsAdded = true;
        this.price += extraToppings;
    }
    
    public void takeAway() {
        isTakeAwayAdded = true;
        this.price += takeAway;
        
        
    }
    
    public void getBill() {
        String Bill = "";
        System.out.println("Pizza : " + basePizzaPrice);
        if(isExtraCheeseAdded) {
            Bill += "Extra cheese added: " + extraCheese + "\n";
        }
        if(isExtraToppingsAdded) {
            Bill += "Extra toppings added: " + extraToppings + "\n" ;
        }
        if(isTakeAwayAdded) {
            Bill += "Take away price is added: " + takeAway + "\n";
        }
        Bill += "Total Bill " +this.price + "\n";
        System.out.println(Bill);
    }
}
