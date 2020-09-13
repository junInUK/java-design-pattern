package com.design.pattern.shapeAndColor1;

import com.design.pattern.shapeAndColor.Point;

public class Circle extends Shape{

    private final double PI = 3.14159;
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public Circle() {
    }

    @Override
    public double getArea() {
        return this.PI * this.radius * this.radius;
    }

    @Override
    public double getPerimeter() {
        return 2*this.PI * this.radius;
    }
}
