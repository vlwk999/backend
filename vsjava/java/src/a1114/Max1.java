package a1114;

import java.util.Scanner;

public class Max1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("첫번째 숫자를 입력");
        int num1 = scanner.nextInt();
        System.out.println("두번째 숫자를 입력");
        int num2 = scanner.nextInt();
        System.out.println("세번째 숫자를 입력");
        int num3 = scanner.nextInt();

        int max = num1;
        
        if(num2 > max){
            max = num2;
        }
        if(num3 > max){
            max = num3;
        }
        
        System.out.println("가장 큰 숫자는" + max + "입니다.");
    }
}
