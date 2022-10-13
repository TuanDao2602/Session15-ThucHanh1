package bai3;

import java.util.Scanner;

public class CalculationExample {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("hãy nhập số x: ");
        int x = scanner.nextInt();
        System.out.println("hãy nhâp số y: ");
        int y =scanner.nextInt();
        CalculationExample calc = new CalculationExample();
        calc.calculate(x,y);
    }
    private void calculate(int x,int y){
        try{
            int a = x+y;
            int b =x-y;
            int c=x*y;
            int d =x/y;
            System.out.println("tổng là"+a);
            System.out.println("hiệu là "+b);
            System.out.println("tích là "+c);
            System.out.println("thương là :"+d);
        }catch (Exception ex){
            System.out.println("xảy ra ngoại lệ" + ex.getMessage());
        }
    }
}
