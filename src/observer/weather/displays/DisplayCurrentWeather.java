package observer.weather.displays;

import java.time.LocalDateTime;

public class DisplayCurrentWeather implements Display, Observer{

    private float temp, humidity, pressure;

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }

    @Override
    public void display() {
        System.out.println(new StringBuilder()
                .append("Data: ").append(LocalDateTime.now())
                .append("\nTemp: ").append(temp)
                .append("\nWilgotność: ").append(humidity)
                .append("\nCiśnienie: ").append(pressure)
        );
    }
}
