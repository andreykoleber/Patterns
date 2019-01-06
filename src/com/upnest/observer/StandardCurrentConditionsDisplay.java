package com.upnest.observer;

import java.util.Observable;
import java.util.Observer;

public class StandardCurrentConditionsDisplay implements Observer, DisplayElement {

    Observable observable;
    private float temperature;
    private float humidity;

    StandardCurrentConditionsDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + temperature + "F degrees and " + humidity + " % humidity");
    }

    @Override
    public void update(Observable obs, Object arg) {
        if (obs instanceof StandardWeatherData) {
            StandardWeatherData weatherData = (StandardWeatherData) obs;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            display();
        }
    }
}
