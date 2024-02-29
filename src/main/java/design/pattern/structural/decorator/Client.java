package design.pattern.structural.decorator;

public class Client {
    public static void main(String[] args) {


        IStream stream=new FileStream();
        stream=new BufferEncryptionStream(stream);
        stream.write("kkkkkkkkkkk");
    }
}
