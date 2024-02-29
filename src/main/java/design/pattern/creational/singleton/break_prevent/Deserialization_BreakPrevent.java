package design.pattern.creational.singleton.break_prevent;

import java.io.*;

public class Deserialization_BreakPrevent {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Singleton instance1=Singleton.getInstance();
        String path="C://folder/temp.text";
        FileOutputStream fout=new FileOutputStream(path);
        ObjectOutputStream oos=new ObjectOutputStream(fout);
        oos.writeObject(instance1);
        oos.close();
        fout.close();

        FileInputStream fin=new FileInputStream(path);
        ObjectInputStream ois=new ObjectInputStream(fin);
        Singleton instance2= (Singleton) ois.readObject();
        System.out.println(instance1.hashCode()+"==="+instance2.hashCode());

    }
}
