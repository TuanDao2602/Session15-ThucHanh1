package bai1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println("Bộ phân giải phương trình tuyến tính");
        System.out.println("Cho một phương trình là 'a * x + b = 0', vui lòng nhập các hằng số:");
        Scanner scanner = new Scanner(System.in);
        System.out.print("a: ");
        double a = scanner.nextDouble();
        System.out.print("b: ");

        double b = scanner.nextDouble();
        if (a != 0) {
            double solution = -b / a;
            System.out.printf("kết quả là: %f!", solution);
        } else {
            if (b == 0) {
                System.out.print("phương trình có nghiệm x!");
            } else {
                System.out.print("phương trình vô nghiệm");
            }
        }
    }
}