package com.design.pattern.shapeAndColor1;

public class Factory {
    public static Shape generateShape(String shapeType){
        Shape shape;
        if ("circle".equals(shapeType.toLowerCase())) {
            shape = new Circle(5);
        } else if ("rectangle".equals(shapeType.toLowerCase())) {
            shape = new Rectangle(4.0,3.0);
        } else if ("square".equals(shapeType.toLowerCase())) {
            shape = new Square(4);
        } else {
            shape = null;
        }
        return shape;
    }

    public static void main(String[] args){
        Shape shape = generateShape("Circle");
        System.out.println("Circle Area:" + shape.getArea() + " Circle Perimeter:" + shape.getPerimeter());
//        Point center = new Point(0,0);
//        shape.setCenter(center);
//        shape.setRadius(5);
//        shape.draw();
    }
}

