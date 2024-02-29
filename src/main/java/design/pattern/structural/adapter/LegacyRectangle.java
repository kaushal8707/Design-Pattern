package design.pattern.structural.adapter;

public class LegacyRectangle {
    private int x1;
    private int y1;
    private int x2;
    private int y2;

    public LegacyRectangle(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public void legacyDraw(){
        System.out.println("drawing a rectangle from Legacy Rectangle class....!!!");
    }
}
