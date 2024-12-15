package project;
// Main.java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 프로그램 시작 시 안내 메시지 출력
        System.out.println("*한승우 미니콘서트 예매 사이트에 오신 것을 환영합니다!*");

        while (true) {
            // 메뉴 출력
            System.out.println("\n1. 콘서트 예매하기");
            System.out.println("2. 팬클럽회원 여부 조회하기");
            System.out.println("3. 예매내역 확인하기");
            System.out.println("4. 관리자 메뉴");
            System.out.print("원하는 메뉴를 선택하세요 (1~4): ");
            int menuChoice = Integer.parseInt(scanner.nextLine());

            switch (menuChoice) {
                case 1:
                    // 콘서트 예매하기기
                    int concertRound = Concert.selectConcertRound();

                    // 회원 로그인 및 예매
                    System.out.print("회원번호(8자리)를 입력하세요: ");
                    String memberId = scanner.nextLine();

                    // 회원번호 8자리 체크
                    if (memberId.length() != 8) {
                        System.out.println("잘못 입력하였습니다.");
                        return; // 잘못된 입력 시 프로그램 종료
                    }
                    
                    System.out.print("회원 이름을 입력하세요: ");
                    String userName = scanner.nextLine();

                    Member member = new Member(memberId, userName);
                    boolean isFanClubMember = member.isFanClubMember();

                    if (isFanClubMember) {
                        System.out.println("팬클럽 회원입니다.");
                        System.out.println("선예매 기간: 2024.12.10 AM 10:00 ~ 2024.12.14 PM 11:59");
                    } else {
                        System.out.println("일반회원입니다.");
                        System.out.println("일반회원 예매기간: 2024.12.15 AM 10:00 ~ 2024.12.23 PM 11:59");
                        // 일반회원 예매기간 안내 후 메뉴로 돌아가기
                        continue;  // 다음 루프(즉, 메뉴로 돌아가기)
                    }

                    // 좌석 상태 출력 및 예약
                    Seat.showSeats();
                    System.out.print("원하는 좌석을 입력하세요 (예: A1): ");
                    String selectedSeat = scanner.nextLine();

                    boolean reserved = Seat.reserveSeat(selectedSeat);

                    if (reserved) {
                        String bookingNumber = Reservation.generateBookingNumber();
                        Reservation.addReservation(memberId, bookingNumber, selectedSeat);
                        Admin.incrementSoldTickets(); // 예약 완료 시 티켓 수 증가
                        System.out.println("회원번호 "+ memberId +  userName + " 님 예매가 완료되었습니다.");
                        System.out.println("예매번호: " + bookingNumber);
                    }
                    break;

                case 2:
                    // 팬클럽회원 여부 조회
                    System.out.print("회원번호(8자리)를 입력하세요: ");
                    String memberId1 = scanner.nextLine();
                    System.out.print("회원 이름을 입력하세요: ");
                    String userName1 = scanner.nextLine();

                    Member member1 = new Member(memberId1, userName1);
                    boolean isFanClubMember1 = member1.isFanClubMember();

                    if (isFanClubMember1) {
                        System.out.println("팬클럽 회원입니다.");
                        System.out.println("선예매 기간: 2024.12.10 AM 10:00 ~ 2024.12.14 PM 11:59");
                    } else {
                        System.out.println("일반회원입니다.");
                        System.out.println("일반회원 예매기간: 2024.12.15 AM 10:00 ~ 2024.12.23 PM 11:59");
                    }
                    break;

                case 3:
                    // 예매내역 확인하기
                    System.out.print("예매 번호를 입력하세요: ");
                    String bookingNumber = scanner.nextLine();
                    ReservationDetails reservation = Reservation.getReservationByBookingNumber(bookingNumber);
                    if (reservation != null) {
                        System.out.println( " 예매 내역: " + reservation);
                    } else {
                        System.out.println("해당 예매 번호가 존재하지 않습니다.");
                    }
                    break;
                    
                case 4:
                    // 관리자 메뉴 접근
                    System.out.print("\n관리자 메뉴에 접근하려면 비밀번호가 필요합니다. "); // 안내 멘트 후 엔터키 누르기
                    String password = scanner.nextLine();
                    if (Admin.verifyPassword()) {
                        Admin.showAdminMenu();
                    } else {
                        System.out.println("잘못된 비밀번호입니다.");
                    }
                    break;

                default:
                    System.out.println("잘못된 선택입니다. 다시 시도해주세요.");
                    break;
            }
        }
    }
}