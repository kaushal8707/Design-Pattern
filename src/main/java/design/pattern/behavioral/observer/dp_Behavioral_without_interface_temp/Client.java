package multi.threading.app.demo.observer.dp_Behavioral_without_interface_temp;

public class Client {
    public static void main(String[] args) {
        WeatherData weatherData=new WeatherData();
        CurrentConditionDisplay currentConditionDisplay=new CurrentConditionDisplay();
        ForecastDisplay forecastDisplay=new ForecastDisplay();

        weatherData.setCurrentConditionDisplay(currentConditionDisplay);
        weatherData.setForecastDisplay(forecastDisplay);

        weatherData.setTemperature(100);
    }
}
