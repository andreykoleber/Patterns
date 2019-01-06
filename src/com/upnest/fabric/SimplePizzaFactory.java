package com.upnest.fabric;

/**
 * Класс SimplePizzaFactory занимается исключительно
 * созданием пиццы для своих клиентов
 * <p>
 * Таким образом, создание объекта инкапсулируется  в одном
 * классе, и будущие изменения реализации придется вносить только
 * в одном месте.
 */
public class SimplePizzaFactory {
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if (type.equals("cheese")) {
            pizza = new CheesePizza();
        } else if (type.equals("pepperoni")) {
            pizza = new PepperoniPizza();
        } else if (type.equals("clam")) {
            pizza = new ClamPizza();
        } else if (type.equals("veggie")) {
            pizza = new VeggiePizza();
        }
        return pizza;
    }
}


