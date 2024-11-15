package a1114;

import java.util.Scanner;

public class Season {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("월을 입력해 보세요");
        int month = scanner.nextInt();
        String season;

        switch (month) {
            case 3: case 4: case 5:
                season = "봄";
                break;
            case 6: case 7: case 8:
                season = "여름";
                break;
            case 9: case 10: case 11:
                season = "가을";
                break;
            case 12: case 1: case 2:
                season = "겨울";
                break;
            default:
                season = "잘못된 입력입니다. 1~12 사이의 값을 입력해주세요.";
        }
        
        // 결과 출력
        System.out.println("입력한 월에 해당하는 계절은: " + season);
        
        scanner.close();

        
}
}
