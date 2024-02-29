package design.pattern.creational.singleton.break_prevent;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Reflection_BreakPrevent {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Singleton instance1=Singleton.getInstance();
        Constructor<Singleton> constructor=Singleton.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        Singleton instance2=constructor.newInstance();
        System.out.println(instance1.hashCode()+"==="+instance2.hashCode());
    }
}
