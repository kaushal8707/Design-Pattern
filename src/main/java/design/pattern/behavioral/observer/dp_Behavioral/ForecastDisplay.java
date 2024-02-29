package multi.threading.app.demo.observer.dp_Behavioral;

public class ForecastDisplay implements Observer{
    private int temperature;
    private int pressure;

    Subject weather;
    ForecastDisplay(Subject weather){
        weather.registerObserver(this);
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public int getPressure() {
        return pressure;
    }

    public void setPressure(int pressure) {
        this.pressure = pressure;
    }
    public void update(int temperature,int pressure){
        this.temperature=temperature;
        this.pressure=pressure;
        updateDisplay();
    }

    private void updateDisplay() {
        System.out.println("updating the display of forecast display.....");
    }
}
