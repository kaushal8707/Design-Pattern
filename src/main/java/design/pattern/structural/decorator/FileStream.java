package design.pattern.structural.decorator;

public class FileStream implements IStream{
    @Override
    public void write(String data) {
        System.out.println("writing data to the file-----"+data);
    }
}
