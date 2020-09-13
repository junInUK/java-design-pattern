package com.design.pattern.shapeAndColor;

public class Rectangle implements Shape {

    private Point leftBottom;
    private int longSide;
    private int wideSide;

    public Rectangle(Point leftBottom, int longSide, int wideSide) {
        this.leftBottom = leftBottom;
        this.longSide = longSide;
        this.wideSide = wideSide;
    }

    public Rectangle() {
    }

    @Override
    public void draw() {
        System.out.println("Draw a Rectangle. leftBottom Point:"
                + this.leftBottom.toString()
                + " long side:" + this.longSide
                + " wide side:" + this.wideSide);
    }
}
