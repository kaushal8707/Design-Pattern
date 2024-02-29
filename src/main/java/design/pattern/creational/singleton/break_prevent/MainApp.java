package design.pattern.creational.singleton.break_prevent;

public class MainApp {
    public static void main(String[] args) {
        Singleton instance1=Singleton.getInstance();
        Singleton instance2=Singleton.getInstance();
        System.out.println(instance1.hashCode()+"==="+instance2.hashCode());
    }
}
