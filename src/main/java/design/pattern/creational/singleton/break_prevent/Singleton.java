package design.pattern.creational.singleton.break_prevent;

import java.io.Serializable;

public class Singleton implements Cloneable, Serializable {
    private static Singleton obj;
    private Singleton(){
        //throw new IllegalArgumentException();
    }
    public static Singleton getInstance(){
        if(obj==null)
            obj= new Singleton();
        return obj;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return obj;
    }

    private Object readResolve(){
        return obj;
    }
}
