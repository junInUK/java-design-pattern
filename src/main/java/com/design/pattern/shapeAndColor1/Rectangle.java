package com.design.pattern.shapeAndColor1;

public class Rectangle extends Shape{

    private double longSide;
    private double wideSide;

    public Rectangle() {
    }

    public Rectangle(double longSide, double wideSide) {
        this.longSide = longSide;
        this.wideSide = wideSide;
    }

    @Override
    public double getArea() {
        return this.longSide * this.wideSide;
    }

    @Override
    public double getPerimeter() {
        return 2*(this.longSide + this.wideSide);
    }
}
