package design.pattern.creational.abstractfactory;

public class AbstractFactoryPatternDemo {
    public static void main(String[] args) {

        //get shape factory
        AbstractFactory shapeFactory=FactoryProducer.getFactory(false);
        //get an object of Shape Rectangle
        Shape shape1=shapeFactory.getShape("RECTANGLE");
        //call draw method of Shape Rectangle
        shape1.draw();
    }
}
