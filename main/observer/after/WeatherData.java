package observer.after;

import java.util.LinkedList;
import java.util.List;

public class WeatherData implements Subject{
    List<Observers> observers = new LinkedList<>();
    @Override
    public void register(Observers observer) {
        if (observers.contains(observer)) {
            return;
        }
        observers.add(observer);
    }

    @Override
    public void remove(Observers observer) {
        if (observers.contains(observer)) {
            int i = observers.indexOf(observer);
            observers.remove(i);
        }
    }

    @Override
    public void notifyObservers(Float temp, Float hudity, Float pressure) {
        observers.forEach(observers1 -> observers1.update(temp, hudity, pressure));
    }

    public void measurementsChanged(){
        // 你的代码在这里
        Float temperature = getTemperature();
        Float humidity = getHumidity();
        Float pressure = getPressure();

        notifyObservers(temperature, humidity, pressure);
    }

    private Float getPressure() {
        return 0.1F;
    }

    private Float getHumidity() {
        return 0.2F;
    }

    private Float getTemperature() {
        return 0.3F;
    }
}
