package multi.threading.app.demo.command;

public class Client{
    public static void main(String[] args) {
        TV tv=new TV();
        Command command=new TVOnnCommand(tv);
        UniversalRemoteControl remote=new UniversalRemoteControl(command);
        remote.pressOn();
    }
}
