package design.pattern.creational.singleton.break_prevent;

public class Cloneable_BreakPrevent {
    public static void main(String[] args) throws CloneNotSupportedException {
        Singleton instance1=Singleton.getInstance();
        Singleton instance2= (Singleton) instance1.clone();
        System.out.println(instance1.hashCode()+"==="+instance2.hashCode());
    }
}
