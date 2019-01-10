package com.upnest.template_method;

/**
 * Новый принцип проектирования
 * Голливудский принцип
 * Не вызыайте нас - мы вас сами
 * вызовем.
 */

public class BeverageTestDrive {


    public static void main(String[] args) {
        CoffeWithHook coffeWithHook = new CoffeWithHook();
        System.out.println("\nMaking tea...");
        coffeWithHook.prepareRecipe();
    }
}
