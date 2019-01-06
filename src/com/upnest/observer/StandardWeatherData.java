package com.upnest.observer;

import java.util.Observable;

public class StandardWeatherData extends Observable {

    private float temperature;
    private float humidity;
    private float pressure;

    StandardWeatherData() {
    }

    public void measurementsChanged() {
        setChanged(); //Перед вызовом notifyObservers() необходимо вызвать setChanged()
        notifyObservers();
    }

    public float getTemperature() {//Эти методы
        return temperature;
    }

    public float getHumidity() {//будут использоваться
        return humidity;
    }

    public float getPressure() {//наблюдателями для получения состояния обхекта WeatherData
        return pressure;
    }
}
