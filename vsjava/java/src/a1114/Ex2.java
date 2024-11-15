package a1114;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("정수를 입력");
        int num = scanner.nextInt();

        if(num > 0){
            System.out.println("양수입니다");
        }else if (num < 0){
            System.out.println("음수입니다");
        }else {
            System.out.println("0입니다.");
        }
    }
}
