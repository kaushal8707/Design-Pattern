package multi.threading.app.demo.command;

public class UniversalRemoteControl {

    Command command;
    UniversalRemoteControl(Command command){
        this.command=command;
    }
    public void pressOn(){
        command.execute();
    }

    public void pressOff(){
        command.execute();
    }
}
