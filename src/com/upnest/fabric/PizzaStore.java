package com.upnest.fabric;


public abstract class PizzaStore {

    public Pizza orderPizza(String type) {
        Pizza pizza;
        pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    /**
     * Фабричный метод отвечает за создание объектов и инкапсулирует эту операцию в субклассе.
     * Таким образом клиентский код в суперклассе отделяется от кода создания объекта в субклассе.
     * @param type
     * @return
     */
    abstract Pizza createPizza(String type);
}
