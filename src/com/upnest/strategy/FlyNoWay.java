package com.upnest.strategy;

/***
 * Реализация поведения уток,
 * которые не летают.
 */
public class FlyNoWay implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("I can't fly!");
    }
}
