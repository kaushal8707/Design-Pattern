package multi.threading.app.demo.observer.dp_Behavioral_without_interface_temp;

public class WeatherData {
    private int temperature;
    private int pressure;
    CurrentConditionDisplay currentConditionDisplay;
    ForecastDisplay forecastDisplay;

    public void setCurrentConditionDisplay(CurrentConditionDisplay currentConditionDisplay) {
        this.currentConditionDisplay = currentConditionDisplay;
    }

    public void setForecastDisplay(ForecastDisplay forecastDisplay) {
        this.forecastDisplay = forecastDisplay;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
        informChanges();
    }
    public int getPressure() {
        return pressure;
    }

    public void setPressure(int pressure) {
        this.pressure = pressure;
    }
    private void informChanges() {
        currentConditionDisplay.update(temperature,pressure);
        forecastDisplay.update(temperature,pressure);
    }
}
