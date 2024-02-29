package design.pattern.structural.decorator;

public class BufferEncryptionStream extends StreamDecorator{
    BufferEncryptionStream(IStream stream) {
        super(stream);
    }

    @Override
    public void write(String data) {
        System.out.println("buffering...........");
        System.out.println("encryption.......");
        super.write(data);
    }
}
