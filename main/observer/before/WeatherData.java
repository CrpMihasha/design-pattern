package observer.before;

public abstract class WeatherData {
    abstract Float getTemperature();
    abstract Float getHumidity();
    abstract Float getPressure();

    /**
     * 错误的方式：因为温度。湿度。气压的变化都会调用此方法，所以你在此处通知布告板数据变化
     */
    public void measurementsChanged(){
        // 你的代码在这里
        Float temperature = getTemperature();
        Float humidity = getHumidity();
        Float pressure = getPressure();

        // currentConditionDisplay.update(temperature,humidity,pressure);
        // statisticsDisplay.update(temperature,humidity,pressure);
        // forecastDisplay.update(temperature,humidity,pressure);
    }

}
