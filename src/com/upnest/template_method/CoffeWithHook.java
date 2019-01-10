package com.upnest.template_method;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/***
 * Чтобы использовать метод перехватчик, мы переопределяем его в субклассе.
 * В данном случае перехватчик управляет выполнением классом CaffeineBeverage
 * определенной части алгоритма, а именно добавками к напитку.
 */
public class CoffeWithHook extends CaffeineBeverage {

    @Override
    void brew() {
        System.out.println("Dripping Coffee through filter");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding Sugar and Milk");
    }

    @Override
    boolean customerWantsCondiments() {
        String answer = getUserInput();
        if (answer.toLowerCase().startsWith("y")) {
            return true;
        } else {
            return false;
        }
    }

    private String getUserInput() {
        String answer = null;
        System.out.println("Would you like milk and sugar with your coffee (y/n)?");
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try {
            answer = in.readLine();
        } catch (IOException ioe) {
            System.err.println("IO error trying to read you answer");
        }
        if (answer == null) {
            return "no";
        }
        return answer;
    }
}
