package a1114;

import java.util.Scanner;

public class Year {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("년도를 입력하세요");
        int year = scanner.nextInt();

        if(year % 4 ==0 && year % 100 != 0 || year % 400 ==0) {
             System.out.println(year+"년은 윤년입니다." );
        }else{
            System.out.println(year+"년은 평년입니다.");
        }
        //중괄호를 빼도 상관없음
    }
}
