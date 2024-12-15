package project;

import java.util.Scanner;

public class Concert {

    public static int selectConcertRound() {
        Scanner sc = new Scanner(System.in);

        System.out.println("승우와 함께 하는 콘서트 회차! :");
        System.out.println("1. 2024.12.23 PM 6:00");
        System.out.println("2. 2024.12.24 PM 6:00");
        System.out.print("원하는 회차를 입력해주세요~ (1 or 2): ");
        return Integer.parseInt(sc.nextLine());
    }
}
