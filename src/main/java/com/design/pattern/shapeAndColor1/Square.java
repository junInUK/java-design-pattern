package com.design.pattern.shapeAndColor1;

public class Square extends Shape{
    private double side;

    public Square(double side) {
        this.side = side;
    }

    public Square() {
    }

    @Override
    public double getArea() {
        return this.side * this.side;
    }

    @Override
    public double getPerimeter() {
        return 4*this.side;
    }
}
