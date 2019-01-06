package com.upnest.fabric;

public class ChicagoPizzaStore extends PizzaStore {
    @Override
    Pizza createPizza(String item) {
        if (item.equals("cheese")) {
            return new ChicagoCheesePizza();
        } else if (item.equals("clam")) {
            return new ChicagoClamPizza();
        } else if (item.equals("pepperoni")) {
            return new ChicagoPepperoniPizza();
        }
        return null;
    }
}
