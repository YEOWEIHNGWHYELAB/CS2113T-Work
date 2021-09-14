package com.whyelab;

public class Shape {
    protected int areaOfShape;

    public Shape() {
        this.areaOfShape = this.area();
    }

    public int area() {
        return areaOfShape;
    }
}
