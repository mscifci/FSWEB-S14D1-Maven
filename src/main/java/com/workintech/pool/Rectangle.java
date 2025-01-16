package com.workintech.pool;

public class Rectangle {
    private double width;
    private double length;

    public Rectangle(double width, double length) {
        this.setWidth(width);
        this.setLength(length);
    }

    public double getWidth() {
        return this.width;
    }

    public void setWidth(double width) {
        this.width = Math.max(width, 0.0);
    }

    public double getLength() {
        return this.length;
    }

    public void setLength(double length) {
        this.length = Math.max(length, 0.0);
    }

    public double getArea() {
        return this.width * this.length;
    }
}
