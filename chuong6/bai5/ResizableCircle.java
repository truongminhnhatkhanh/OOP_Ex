package chuong6.bai5;

public class ResizableCircle extends Circle implements Resizable {
    public ResizableCircle(double radius) {
        super(radius);
    }

    @Override
    public String toString() {
        return "Resizable" + super.toString()
                + ']';
    }

    public void resize(int percent) {
        radius *= percent/100.0;
    }
}
