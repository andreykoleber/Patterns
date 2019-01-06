package com.upnest.strategy;

public abstract class Duck {

    //Объявляем две ссылочные переменные
    //c типами интерфейсов поведения.
    //Переменные наследуются всеми субклассами Duck (в том же пакете)
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public Duck() {

    }

    /***
     * Динамичесокое изменение поведения
     * @param flyBehavior
     */
    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
    //---------------------------------------


    public abstract void display();

    //-----------------------------------------
    //Делегированные операции классами поведения
    public void performFly() {
        flyBehavior.fly();
    }
    public void performQuack() {
        quackBehavior.quack();
    }
    //***********************************

    public void swim() {
        System.out.println("All ducks float, even decoys!");
    }
}