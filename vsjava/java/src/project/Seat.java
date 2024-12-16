package project;

import java.util.ArrayList;
import java.util.List;

public class Seat {
     private static final List<String> seats = new ArrayList<>();

     static {
        // 초기화: A1~L24 생성
        for (char row = 'A'; row <= 'L'; row++) {
            for (int col = 1; col <= 24; col++) {
                seats.add(row + String.valueOf(col));
            }
        }
    }

    public static void showSeats() {
        System.out.println("---------------------------------------------------");
        System.out.println("                     S T A G E                     ");
        System.out.println("---------------------------------------------------");

        // 열 번호 출력 (1~24)
        System.out.print("     ");
        for (int i = 1; i <= 24; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        // 좌석 상태 출력 (행: A~L, 열: 1~24)
        for (char row = 'A'; row <= 'L'; row++) {
            System.out.print(row + "   ");  // 행 번호 출력 (A~L)
            for (int col = 1; col <= 24; col++) {
                String seat = row + String.valueOf(col);
                System.out.print(Reservation.isSeatReserved(seat) ? "X " : "O ");
            }
            System.out.println();
        }
    }

    public static boolean reserveSeat(String selectedSeat) {
        if (!seats.contains(selectedSeat)) {
            System.out.println("유효하지 않은 좌석입니다.");
            return false;
        }

        if (Reservation.isSeatReserved(selectedSeat)) {
            System.out.println("이미 예매된 좌석입니다.");
            return false;
        } else {
            Reservation.reserveSeat(selectedSeat);
            return true;
        }
    }
    
}
