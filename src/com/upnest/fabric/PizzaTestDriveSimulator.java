package com.upnest.fabric;

/**
 * Все фабричные паттерны инкапсулируют операции создания объектов.
 * Паттерн Фабричный Метод позволяет субклассам решить, какой объект
 * следует создать.
 *
 * В нашем примере createPizza() фабричный метод, производящий продукт.
 * Фабрики производят продукты; у класса PizzaStore Продуктом является Pizza.
 *
 * ----------------------------------------------
 * Паттерн Фабричный метод определяет интерфейс создания
 * объекта, но позволяет субклассам выбрать класс создаваемого
 * экземпляра. Таким образом, Фабричный Метод делегирует
 * операцию создания экземпляра субклассам.
 * -----------------------------------------------
 *
 * Принцип инверсии зависимостей
 * Принцип проектирования
 * Код должен зависеть от абстракций, а не от конкретных классов.
 *
 *
 *                  PizzaStore это высокоуровневый компонент.
 *                      |
 *                      |
 *           ---------Pizza----------  это абстракция
 *           |                      |
 *           |                      |
 *           ChicagoPizza        New-YorkPizza это низкоуровневый компонент
 *
 * Фабричный метод не единственный но один из самых мощных   приеов, обеспечивающих соблюдения принципа
 * инферсии зависимостей.
 */

public class PizzaTestDriveSimulator {

    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + pizza.getName());

        pizza = chicagoStore.orderPizza("cheese");
        System.out.println("Joel ordered a " + pizza.getName());
    }
}