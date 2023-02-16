package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private int toppings;
    boolean isExtraCheeseAdded;
    boolean isExtraToppingAdded;
    boolean isBillCreated;
    boolean isTakeAway;


    public Pizza(Boolean isVeg) {
        this.isVeg = isVeg;
        if (isVeg) {
            this.price = 300;
            this.toppings = 70;
        } else {
            this.price = 400;
            this.toppings = 120;
        }
        this.isExtraCheeseAdded = false;
        this.isExtraToppingAdded = false;
        this.isBillCreated = false;
        this.isTakeAway = false;

        this.bill = "Base price of the pizza: " + this.price + "\n";
        // your code goes here
    }

    public int getPrice() {
        return this.price;
    }

    public void addExtraCheese() {
        // your code goes here
        if (!isExtraCheeseAdded) {
            this.price += 80;
            this.isExtraCheeseAdded = true;
        }
    }

    public void addExtraToppings() {
        // your code goes here
        if (!isExtraToppingAdded) {
            this.price += this.toppings;
            isExtraToppingAdded = true;
        }
    }

    public void addTakeaway() {
        // your code goes here
        if (!isTakeAway) {
            this.price += 20;
            isTakeAway = true;
        }
    }

    public String getBill() {
        // your code goes here
        if (!isBillCreated) {
            if (isExtraCheeseAdded) {
                this.bill += "Extra cheese added: 80" + "\n";
            }
            if (isExtraToppingAdded) {
                this.bill += "Extra toppings added: " + this.toppings + "\n";
            }
            if (isTakeAway) {
                this.bill += "Paperbag added: 20" + "\n";
            }
            this.bill += "Total price: " + this.price;
            this.isBillCreated = true;
            return this.bill;
        }
        return "";
    }
}
