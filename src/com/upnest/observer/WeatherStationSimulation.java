package com.upnest.observer;

/***
 * Если два объекта могут взаимодействовать, не обладая практические никакой информации друг о
 * друге, такие объекты называют слабосвязанными.
 * В архитектере паттерна наблюдатель между объеткаи и наблюдателями
 * существует слабая связь. Потому что:
 * 1. Единственное что знает субъект о наблюдателе, - то что тот реалзует некоторый интерфейс.
 * 2. Новые наблюдатели могут добавляться в любой момент.
 * 3. Субъекты и наблюдатели могут повторно использоваться независимо друг от друга.
 * 4. Изменение в субъекте и наблюдателе не влияют на другую сторону.
 *
 * Принцип проектирования
 * Стремитесь к слабой связанности взаимодействующих объектов.
 * На базе слабосвязанных архитекрут строятся гибкие ОО-системы,
 * которые хорошо адаптируются к изменениям благодаря минимальным зависимостям между объектами.
 *
 * Паттерн наблюдатель - определяет отношение "один ко многим"
 * между объектами таким образом, что при изменении состояния
 * одного объекта происходит автоматическое оповещение и обновление
 * всех зависимых объектов.
 */

public class WeatherStationSimulation {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentConditions = new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.2f);
        weatherData.setMeasurements(78, 90, 29.2f);
    }
}
