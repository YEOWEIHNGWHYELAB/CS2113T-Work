package com.whyelab;

public class Circle extends Shape {
    private int radius;

    public Circle(int radius) {
        super((int)(Math.PI * radius * radius));
        this.radius = radius;
    }

    @Override
    public int area() {
        return (int)(Math.PI * radius * radius);
    }
}
