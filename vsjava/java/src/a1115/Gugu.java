package a1115;

import java.util.Scanner;

public class Gugu {
    public static void main(String[] args) {
        //구구단(1~9단)
        //원하는 단을 입력받아 아래와 같이 구구단 수식을 출력한다.
        //입력:3
        //출력
        //3*1=3
        //3*2=6
        //3*3=9
        //3*4=12
        //3*5=15
        //3*6=18
        //3*7=21
        //3*8=24
        //3*9=27

        Scanner scanner = new Scanner(System.in);
        System.out.println("입력: ");
        int input = scanner.nextInt();

        for(int i =1; i<=9; i ++){
            // System.out.println(input + " * " + i + " = " +input * i);
            int result = input * i;
            System.out.println(input + " * "+i+" = "+result);
            // 위 주석처리된 방법과 해서 2가지 방법다 사용가능함!
        }
        scanner.close();
    }
}
