package a1115;

import java.util.Scanner;

public class baguni {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean run = true;
        int balance = 0;
        
        while(run){
            System.out.println("==================================");
            System.out.println("1. 아이템 추가 | 2. 아이템 삭제 | 3. 카트 확인 | 4. 종료");
            System.out.println("==================================");
            System.out.print("선택 > ");

            int num = Integer.parseInt(scanner.nextLine());

            switch ((num)) {
                case 1:
                    System.out.print("추가할 아이템 >");

                    break;
                case 2:
                    System.out.print("삭제할 아이템 >");

                    break;
                case 3:
                    System.out.print("현재 카트 :");

                    break;
                case 4:
                    run =  false;
                    break;
                default:
                    System.out.println("잘못 입력했습니다.");
                    break;
            }
            System.out.println();
        }
        System.out.println("프로그램을 종료합니다.");
    }
}
