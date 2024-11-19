package chuong4.bai1;

public class Cyliner extends Circle {
    private double height;

    public Cyliner(){
        super();
        this.height = 1.0;
    }
    public Cyliner(double radius) {
        super(radius);
    }
    public Cyliner(double radius, double height) {
        super(radius);
        this.height = height;
    }
    public Cyliner(double radius, double height, String color) {
        super(radius,color);
        this.height = height;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public double getVolume() {
        return getArea() * height;
    }
}
