package observer.after;

import java.util.List;

/**
 * 为了交互对象之间的松耦合而努力
 * 气象站中，WeatherData对象可以当作主题，不同的布告板可以作为气象站的观察者，当气象站数据变化时，可以通知观察者，当然，还应该让观察者选择是否自己拉取数据
 */
public interface Subject {
    void register(Observers observer);
    void remove(Observers observer);
    void notifyObservers(Float temp, Float hudity, Float pressure);
}
