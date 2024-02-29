package design.pattern.structural.adapter;

public class RectangleAdapter extends Rectangle{

    LegacyRectangle legacyRectangle;

    RectangleAdapter(int x1, int y1, int w, int h){
        legacyRectangle=new LegacyRectangle(x1,y1,x1+w,y1+h);
    }
    public void draw() {
        legacyRectangle.legacyDraw();
    }
}
