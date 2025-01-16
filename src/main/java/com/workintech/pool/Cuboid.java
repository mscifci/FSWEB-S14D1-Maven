package com.workintech.pool;

public class Cuboid extends Rectangle {
    private double height;

    public Cuboid(double width, double length, double height) {
        super(width, length);
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
