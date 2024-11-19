package chuong6.bai2;

public class Main {
    public static void main(String[] args) {
        Circle cr = new Circle(3);
        System.out.println(cr.getArea());
        System.out.println(cr.getPerimeter());
        System.out.println(cr);

        Rectangle rec = new Rectangle(4,7);
        System.out.println(rec.getArea());
        System.out.println(rec.getPerimeter());
    }
}
