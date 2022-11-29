package observer.after;

public class Test {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        Observers currentConditionDisplay = new CurrentConditionDisplay(weatherData);
        weatherData.measurementsChanged();
    }
}
