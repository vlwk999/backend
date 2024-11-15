package a1115;

import java.util.Scanner;

public class Ex7while {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean run = true;
        int balance = 0;
        int money = 0;
        while(run){
            System.out.println("--------------------------------------");
            System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
            System.out.println("--------------------------------------");
            System.out.print("선택 > ");
            //scanner 입력변수 menuNum
            int menuNum = Integer.parseInt(scanner.nextLine()); // 혹시문자로 인식해도 숫자로 변환

        //switch(menuNum)
        switch ((menuNum)) {
            case 1:
                System.out.print("예금액>");
                // money = Integer.parseInt(scanner.nextLine());
                // balance = balance + money;
                balance += Integer.parseInt(scanner.nextLine()); // 위에 두 줄을 한줄로 표현
                break;
            case 2:
                System.out.print("출금액");
                balance -= Integer.parseInt(scanner.nextLine());
                break;
            case 3:
                System.out.print("잔고>");
                System.out.println(balance);
                break;
            case 4:
                run = false;
                break;
            default:
                System.out.println("잘못 입력했습니다. 다시 입력하세요");
                break;
        }
        System.out.println();
            

        }
        System.out.println("프로그램을 종료합니다.");

    }
}
