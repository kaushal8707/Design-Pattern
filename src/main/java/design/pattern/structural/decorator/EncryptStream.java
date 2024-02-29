package design.pattern.structural.decorator;

public class EncryptStream extends StreamDecorator{
    EncryptStream(IStream stream) {
        super(stream);
    }

    @Override
    public void write(String data) {
        System.out.println("encryption............");
        super.write(data);
    }
}
