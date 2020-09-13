package com.design.pattern.shapeAndColor;

public class Circle implements Shape{

    private Point center;
    private int radius;

    public Circle(Point center, int radius) {
        this.center = center;
        this.radius = radius;
    }

    public Circle() {
        this.center = null;
        this.radius = 0;
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        if(this.center == null || this.radius == 0){
            System.out.println("Please set center and radius!");
        }else{
            System.out.println("Draw a Circle. Center:"
                    + this.center.toString()
                    + " Radius:" + this.radius);
        }

    }
}
