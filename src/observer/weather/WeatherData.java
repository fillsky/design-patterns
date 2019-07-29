package observer.weather;

import observer.weather.displays.Display;
import observer.weather.displays.DisplayCurrentWeather;
import observer.weather.displays.Observer;
import observer.weather.displays.Subject;


import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {

    List<Display> displays = new ArrayList<>();
    List<Observer> observers = new ArrayList<>();

    private float temp;
    private float humidity;
    private float presurre;

    public WeatherData(){
        displays.add(new DisplayCurrentWeather());


    }

    public float getTemperature(float temperature) {
        if(Math.abs(this.temp - temperature) > 0.1f){
            this.temp = temperature;
            notifyObservers();
        }
        return temp;
    }

    public float getPressure(float pressure) {
        if(Math.abs(this.presurre - pressure) > 1f){
            this.presurre = pressure;
            notifyObservers();
        }
        return this.presurre;
    }

    public float getHumidity(float humidity) {
        if(Math.abs(this.humidity - humidity) > 1f){
            this.humidity = humidity;
            notifyObservers();
        }
        return this.humidity;
    }

    /*public void readWeatherChanges() {

        float temp = getTemperature();
        float humidity = getHumidity();
        float pressure = getPressure();

        //DisplayCurrentWeather.update(temp, humidity, pressure);
        //displays.get(0).display(temp, humidity, pressure);

    }*/

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {

        observers.forEach(observer -> {
            observer.update(temp, humidity, presurre);

        });

    }
}
