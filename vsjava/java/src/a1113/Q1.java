package a1113;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("첫번째 정수값 입력:");
        // String strX = scanner.nextLine();
        int num1 = scanner.nextInt();
        
        System.out.print("두번쨰 정수값을 입력:");
        // String strY = scanner.nextLine();
        int num2 = scanner.nextInt();

        System.out.println(num1 +" + "+ num2 + "=" + (num1+num2));
        System.out.println(num1 +" - "+ num2 + "=" + (num1-num2));
        System.out.println(num1 +" * "+ num2 + "=" + (num1*num2));
        System.out.println(num1 +" / "+ num2 + "=" + (num1/num2));
        System.out.println(num1 +" % "+ num2 + "=" + (num1%num2));

        // int result = x + y;
        // System.out.println("x + y:" +result);

        // int result1 = x - y;
        // System.out.println("x - y:" +result1);

        // int result2 = x * y;
        // System.out.println("x * y:" +result2);

        // int result3 = x / y;
        // System.out.println("x / y:" +result3);

        // int result4 = x % y;
        // System.out.println("x % y:" +result4);
    }
}
