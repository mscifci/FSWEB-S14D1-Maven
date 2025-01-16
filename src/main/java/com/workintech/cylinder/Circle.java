package com.workintech.cylinder;

public class Circle {
    private double radius;

    public Circle(double radius) {
        this.setRadius(radius);
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = Math.max(radius, 0.0);
    }

    public double getArea() {
        return this.radius * this.radius * Math.PI;
    }
}
