package com.design.pattern.shapeAndColor;

public class AbstractFactoryPatternDemo {
    public static void main(String[] args){
        //  get the shape factory
        AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");

        //  get the object of circle
        Shape circle = shapeFactory.getShape("CIRCLE");

        circle.draw();

        Shape rectangle = shapeFactory.getShape("RECTANGLE");
        rectangle.draw();

        Shape square = shapeFactory.getShape("SQUARE");
        square.draw();

        //  get the color factory
        AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");

        Color red = colorFactory.getColor("RED");

        red.fill();

        Color green = colorFactory.getColor("GREEN");
        green.fill();

        Color blue = colorFactory.getColor("BLUE");
        blue.fill();
    }
}
