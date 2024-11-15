package a1114;

import java.util.Scanner;

public class Season2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("월을 입력해 보세요");
        int month = scanner.nextInt();
        String season = switch (month) {
            case 3, 4, 5 -> "봄";
            case 6, 7, 8 -> "여름";
            case 9, 10, 11 -> "가을";
            case 12, 1, 2 -> "겨울";
            default -> "잘못된 입력입니다. 1~12 사이의 값을 입력해주세요.";
        };
        System.out.println("입력한 월에 해당하는 계절은: "+season);

        scanner.close();
        
    }
}

