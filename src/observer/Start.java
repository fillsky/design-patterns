package observer;

import observer.weather.WeatherData;
import observer.weather.displays.DisplayCurrentWeather;

public class Start {

    public static void main(String[] args) {

        DisplayCurrentWeather displayCurrentWeather = new DisplayCurrentWeather();
        WeatherData weatherData = new WeatherData();
        weatherData.addObserver(displayCurrentWeather);
        weatherData.getTemperature(14.3f);
        weatherData.getPressure(1000f);
        weatherData.getHumidity(34f);

        weatherData.getTemperature(15.5f);
        weatherData.getTemperature(25.0f);
        weatherData.getTemperature(17.5f);
        weatherData.getTemperature(21.2f);

        weatherData.removeObserver(displayCurrentWeather);

    }
}
