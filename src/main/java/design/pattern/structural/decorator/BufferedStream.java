package design.pattern.structural.decorator;

public class BufferedStream extends StreamDecorator{
    BufferedStream(IStream stream) {
        super(stream);
    }

    @Override
    public void write(String data) {
        System.out.println("buffering............");
        super.write(data);
    }
}
