package com.workintech.cylinder;

public class Cylinder extends Circle {
    private double height;

    public Cylinder(double radius, double height) {
        super(radius);
        this.setHeight(height);
    }

    public double getHeight() {
        return this.height;
    }

    public void setHeight(double height) {
        this.height = Math.max(height, 0.0);
    }

    public double getVolume() {
        return this.getArea() * this.height;
    }
}