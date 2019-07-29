package observer.weather.displays;

public interface Observer {

    void update (float temp,
                 float humidity,
                 float pressure);

}
