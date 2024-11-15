package a1115;

import java.util.ArrayList;
import java.util.Scanner;

public class homework {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> cart = new ArrayList<>();
        int choice;

        // 반복문으로 프로그램 실행
        while (true) {
            // 메뉴 출력
            System.out.println("==================================");
            System.out.println("1. 아이템 추가 | 2. 아이템 삭제 | 3. 카트 확인 | 4. 종료");
            System.out.println("==================================");
            System.out.print("선택> ");
            choice = scanner.nextInt();
            scanner.nextLine(); // 버퍼 비우기

            switch (choice) {
                case 1:
                    // 아이템 추가
                    System.out.print("추가할 아이템> ");
                    String itemToAdd = scanner.nextLine();
                    cart.add(itemToAdd);
                    System.out.println(itemToAdd + "이(가) 카트에 추가되었습니다.");
                    break;

                case 2:
                    // 아이템 삭제
                    System.out.print("삭제할 아이템> ");
                    String itemToRemove = scanner.nextLine();
                    if (cart.contains(itemToRemove)) {
                        cart.remove(itemToRemove);
                        System.out.println(itemToRemove + "이(가) 카트에서 삭제되었습니다.");
                    } else {
                        System.out.println("해당 아이템은 카트에 없습니다.");
                    }
                    break;

                case 3:
                    // 카트 확인
                    System.out.println("현재 카트: " + cart);
                    break;

                case 4:
                    // 프로그램 종료
                    System.out.println("프로그램을 종료합니다.");
                    scanner.close();
                    return;

                default:
                    // 잘못된 입력
                    System.out.println("잘못된 선택입니다. 다시 선택해주세요.");
                    break;
            }
        }
    }
}
    

