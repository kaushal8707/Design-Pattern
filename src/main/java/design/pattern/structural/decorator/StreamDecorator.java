package design.pattern.structural.decorator;

public class StreamDecorator implements IStream{
    IStream iStream;

    StreamDecorator(IStream stream){
        this.iStream=stream;
    }
    @Override
    public void write(String data) {
        iStream.write(data);
    }
}
