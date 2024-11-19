package chuong5.bai2;

public class Cylinder {
    private Circle base;  // Composition: Cylinder "has a" Circle
    private double height;

    public Cylinder() {
        this.base = new Circle();  // Create a default Circle object
        this.height = 1.0;
    }

    public Cylinder(double radius, String color, double height) {
        this.base = new Circle(radius, color);  // Initialize Circle with specified radius and color
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getRadius() {
        return base.getRadius();
    }

    public void setRadius(double radius) {
        base.setRadius(radius);
    }

    public String getColor() {
        return base.getColor();
    }

    public void setColor(String color) {
        base.setColor(color);
    }

    public double getVolume() {
        return base.getArea() * height;
    }
}
