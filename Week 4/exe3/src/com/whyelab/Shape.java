package com.whyelab;

public class Shape {
    protected int areaOfShape;

    public Shape(int areaOfShape) {
        this.areaOfShape = areaOfShape;
    }

    public int area() {
        return areaOfShape;
    }
}
