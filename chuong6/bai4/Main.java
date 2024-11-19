package chuong6.bai4;

public class Main {
    public static void main(String[] args) {
        MovablePoint point = new MovablePoint(0, 0, 2, 2);
        System.out.println(point);
        point.moveUp();
        point.moveRight();
        System.out.println(point);

        MovableCircle circle = new MovableCircle(0, 0, 1, 1, 5);
        System.out.println(circle);
        circle.moveUp();
        circle.moveRight();
        System.out.println(circle);
    }
}
