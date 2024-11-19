package chuong6.bai1;

public class Square extends Rectangle{

    public Square(){
        super();
    }

    public Square(double side) {
        this.setWidth(side);
        this.setLength(side);
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public double getSide(){
        return super.getWidth();
    }

    public void setSide(double side){
        super.setWidth(side);
        super.setLength(side);
    }

    public void setWidth(double side){
        super.setWidth(side);
    }

    public void setLength(double side){
        super.setLength(side);
    }

    public String toString(){
        return "Square[" + super.toString() +"]";
    }
}
