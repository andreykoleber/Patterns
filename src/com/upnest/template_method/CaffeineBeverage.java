package com.upnest.template_method;

/**
 * Паттерн шаблонный метод задает
 * "Скелет" алгоритма в методе,
 * оставляя определение реализации
 * некоторых шагов субклассам. Субклассы
 * могут переопределять некоторые части
 * алгоритма без изменения его структуры.
 * ------------------------------------------
 * Шаблонный метод определяет
 * основные шаги алгоритма и позволяет
 * субклассам предоставить реализацию
 * одного или нескольких шагов.
 */

public abstract class CaffeineBeverage {

    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        if (customerWantsCondiments()) {
            addCondiments();
        }
    }

    abstract void brew();

    abstract void addCondiments();

    void boilWater() {
        System.out.println("Boiling water");
    }

    void pourInCup() {
        System.out.println("Pouring into cup");
    }

    /**
     * Метод с почти пустой реализацией по умолчанию:
     * просто возвращает true, и не делает ничего более.
     *
     * Перехватчик: субкласс может переопределять этот метод,
     * но не обязан этого делать.
     * @return true
     */
    boolean customerWantsCondiments() {
        return true;
    }
}
