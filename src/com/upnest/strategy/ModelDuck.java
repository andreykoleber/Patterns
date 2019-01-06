package com.upnest.strategy;

/***
 * Утка приманка изначально летать не умеет.
 */
public class ModelDuck extends Duck {

    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm model Duck");
    }
}