package com.upnest.decorator;

/**
 * Классы должя быть открыты для расширения,
 * но закрыты для изменения.
 *
 * ---------------------
 * Паттерн Декоратор динамически наделяет объект новыми возможностями
 * и является гибкой альтернативой субклассированию в области расширения
 * функциональности.
 * ---------------------
 *
 *
 * 1. Наследование - одна из форм раширения, но оно не всегда
 * обеспечивает гибкость архитектуры.
 * 2. Следует предусматреть возможнсть расширения поведения
 * без изменения существующего кода.
 * 3. Композиция и делегирование часто используются для
 * динамического добавления нового поведения.
 * 4. Паттерн Декоратор предоставляет альтернативу в области
 * расширения поведения.
 * 5. Типы декораторов соответствуют типам декорируемых компонентов
 * (соответствие достигается посредоством наследонваия или
 * реализации интерфейса).
 * 6. Декораторы изменяют поведение компонентов, юобавляя новую
 * функциональность до и (или) после) или даже вместо) вызовов
 * методов компонентов.
 * 7. Компонент может декорироваться любым количеством декораторов.
 * 8. Декораторы обычтно прозрачны для клиентов компонента
 * если клиентский код  не зависит от конкретного типа компонента.
 */

public class DecoratorSimulator {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        Beverage beverage2 = new DarkRoast();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription() + " $" + beverage2.cost());

        Beverage beverage3 = new HouseBlend();
        beverage3 = new Soy(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Whip(beverage3);

        System.out.println(beverage3.getDescription() + " $" + beverage3.cost());

    }

}
