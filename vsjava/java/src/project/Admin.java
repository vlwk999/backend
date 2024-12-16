package project;

import java.util.Scanner;

public class Admin {
    private static final String ADMIN_PASSWORD = "wooyaS2";
    private static int soldTickets = 0;

    public static boolean verifyPassword() {
        Scanner sc = new Scanner(System.in);
        System.out.print("관리자 비밀번호를 입력하세요: ");
        String password = sc.nextLine();
        return password.equals(ADMIN_PASSWORD);
    }
    // 실시간 판매 티켓 수 보기
    public static void viewSoldTickets() {
        System.out.println("현재 판매된 티켓 수: " + soldTickets);
    }
    // 남은좌석 현황보기
    public static void showSeatStatus() {
        Seat.showSeats(); // 좌석 현황 표시
    }

    // 예약 취소
    public static void cancelReservation() {
        Scanner sc = new Scanner(System.in);
        System.out.print("취소할 예매번호를 입력하세요: ");
        String bookingNumber = sc.nextLine();

        // 예매 번호로 해당 예약을 찾음
        ReservationDetails reservation = Reservation.getReservationByBookingNumber(bookingNumber);

        if (reservation != null) {
            String seat = reservation.getSeat();
            Reservation.cancelReservation(seat); // 좌석 예약 취소
            soldTickets--; // 예약 취소 시 티켓 수 감소
            System.out.println("예매번호 " + bookingNumber + "의 예약이 취소되었습니다.");
        } else {
            System.out.println("해당 예매번호는 존재하지 않습니다.");
        }
}


    public static void showAdminMenu() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n--- 관리자 메뉴 ---");
            System.out.println("1. 실시간 판매 티켓 수 보기");
            System.out.println("2. 남은 좌석 현황 보기");
            System.out.println("3. 예매 취소");
            System.out.println("4. 예매 내역 보기");
            System.out.println("5. 종료");
            System.out.print("메뉴를 선택하세요: ");
            int choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    viewSoldTickets();
                    break;
                case 2:
                    showSeatStatus();
                    break;
                case 3:
                    cancelReservation();
                    break;
                case 4:
                    Reservation.viewReservations();
                    break;
                case 5:
                    System.out.println("관리자 메뉴를 종료합니다.");
                    return;
                default:
                    System.out.println("잘못된 선택입니다.");
            }
        }
    }

    public static void incrementSoldTickets() {
        soldTickets++;
    }
}
