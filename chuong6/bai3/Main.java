package chuong6.bai3;
public class Main {
    public static void main(String[] args) {
        MovablePoint mv = new MovablePoint(5, 6, 7, 8);
        System.out.println(mv);
        mv.moveUp();
        System.out.println(mv);
    }
}
