package multi.threading.app.demo.command;

public class LightOffCommand implements Command{
    Light ligth;
    LightOffCommand(Light light){
        this.ligth=light;
    }
    @Override
    public void execute() {
        ligth.oFF();
    }
}
