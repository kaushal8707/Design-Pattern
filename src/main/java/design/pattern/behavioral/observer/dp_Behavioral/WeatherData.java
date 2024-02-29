package multi.threading.app.demo.observer.dp_Behavioral;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject{

    private int temperature;
    private int pressure;

    List<Observer> observers=new ArrayList<>();
    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
        notifyObservers();
    }
    public int getPressure() {
        return pressure;
    }

    public void setPressure(int pressure) {
        this.pressure = pressure;
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);
        observers.remove(i);
    }

    @Override
    public void notifyObservers() {
        for(Observer objerver : observers){
            objerver.update(temperature,pressure);
        }
    }
}
