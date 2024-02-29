package multi.threading.app.demo.observer.dp_Behavioral;

public interface Subject {
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObservers();
}
