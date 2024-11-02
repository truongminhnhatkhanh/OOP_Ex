package chuong3;
import java.math.BigInteger;
import java.util.Scanner;

public class TestBigInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BigInteger c = new BigInteger(sc.next());
        BigInteger d = new BigInteger(sc.next());

        BigInteger a = new BigInteger("111111111111111111111111111111111111111111111111111111111111111111111111111111111");
        BigInteger b = new BigInteger("222222222222222222222222222222222222222222222222222222222222222222222222222222222");

        BigInteger sum = a.add(b);
        System.out.println("Tổng: " + sum);

        BigInteger product = a.multiply(b);
        System.out.println("Tích: " + product);

        BigInteger sum1 = c.add(d);
        System.out.println("Tổng: " + sum1);

        BigInteger tich1 = c.multiply(d);
        System.out.println("Tích: " + tich1);


    }
}
