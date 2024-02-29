package multi.threading.app.demo.observer.dp_Behavioral;

public class Client {
    public static void main(String[] args) {
        WeatherData weatherData=new WeatherData();

        CurrentConditionDisplay currentConditionDisplay=new CurrentConditionDisplay(weatherData);
        ForecastDisplay forecastDisplay=new ForecastDisplay(weatherData);

        weatherData.setTemperature(100);
    }
}
