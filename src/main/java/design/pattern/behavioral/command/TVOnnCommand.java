package multi.threading.app.demo.command;

public class TVOnnCommand implements Command{
    TV tv;
    TVOnnCommand(TV tv){
        this.tv=tv;
    }
    @Override
    public void execute() {
        tv.turnedOn();
    }
}
