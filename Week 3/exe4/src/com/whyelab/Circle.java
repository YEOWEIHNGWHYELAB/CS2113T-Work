package com.whyelab;

public class Circle {
    private int x;
    private int y;
    private double radius;

    public Circle(int x, int y, int radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }
    public Circle() {
        this(0, 0, 0);
    }

    public int getArea() {
        double area = Math.PI * Math.pow(radius, 2);
        return (int)area;
    }
}
