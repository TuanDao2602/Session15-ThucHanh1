package BAI2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayExample arrayExample =new ArrayExample();
        Integer[] arr = arrayExample.createRandom();
        Scanner scanner =new Scanner(System.in);
        System.out.println("vui lòng nhập chỉ số của một phần tử bất kì");
        int x =scanner.nextInt();
        try {
            System.out.println("Gía trị của phần tử có chỉ số "+x+"là"+arr[x]);

        }catch (Exception e){
            System.out.println("chỉ số vượt quá giới hạn của mảng");
        }
    }
}
