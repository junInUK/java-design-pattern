package com.design.pattern.shapeAndColor;

public class Square implements Shape{

    private Point leftBottom;
    private int sidelength;

    public Square(Point leftBottom, int sidelength) {
        this.leftBottom = leftBottom;
        this.sidelength = sidelength;
    }

    public Square() {
    }

    @Override
    public void draw() {
        System.out.println("Draw a Square. " +
                " left bottom point: " + this.leftBottom.toString() +
                " side length: " + this.sidelength);
    }
}
