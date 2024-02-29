package design.pattern.structural.adapter;

public class Client {
    public static void main(String[] args) {
        int x1=10,y1=20,w=15,h=30;
        Rectangle rectangle=new RectangleAdapter(x1,y1,w,h);
        rectangle.draw();

    }
}
