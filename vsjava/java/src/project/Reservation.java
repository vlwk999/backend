package project;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Reservation {
    private static final List<String> reservedSeats = new ArrayList<>();
    private static final List<ReservationDetails> reservations = new ArrayList<>();

    // 예약 번호 생성
    public static String generateBookingNumber() {
        Random rand = new Random();
        int randomNum = rand.nextInt(10000);
        return "1224" + String.format("%04d", randomNum);
    }

    // 예매 추가
    public static void addReservation(String memberId, String bookingNumber, String seat) {
        reservedSeats.add(seat);
        reservations.add(new ReservationDetails(memberId, bookingNumber, seat));
    }

    // 예매 내역 보기
    public static void viewReservations() {
        for (ReservationDetails reservation : reservations) {
            System.out.println(reservation);
        }
    }

    // 예약 번호로 예매 내역 찾기
    public static ReservationDetails getReservationByBookingNumber(String bookingNumber) {
        for (ReservationDetails reservation : reservations) {
            if (reservation.getBookingNumber().equals(bookingNumber)) {
                return reservation;
            }
        }
        return null; // 예약 번호가 없으면 null 반환
    }

    // 좌석 예약 여부 확인
    public static boolean isSeatReserved(String seat) {
        return reservedSeats.contains(seat);
    }

    // 좌석 예약
    public static void reserveSeat(String seat) {
        reservedSeats.add(seat);
    }

    // 좌석 예약 취소
    public static void cancelReservation(String seat) {
        if (reservedSeats.contains(seat)) {
            // 예약 취소 시 예약된 좌석을 "O"로 변경
            reservedSeats.remove(seat);
            reservations.removeIf(reservation -> reservation.getSeat().equals(seat));  // 예매 내역에서 해당 좌석 취소
            System.out.println("좌석 " + seat + "의 예약이 취소되었습니다.");
        } else {
            System.out.println("해당 좌석은 예약되지 않았습니다.");
        }

       
    }
}

class ReservationDetails {
    private String memberId;
    private String bookingNumber;
    private String seat;

    // 생성자
    public ReservationDetails(String memberId, String bookingNumber, String seat) {
        this.memberId = memberId;
        this.bookingNumber = bookingNumber;
        this.seat = seat;
    }

    // Getter 메서드들
    public String getBookingNumber() {
        return bookingNumber;
    }

    public String getMemberId() {
        return memberId;
    }

    public String getSeat() {
        return seat;
    }

    // 예매 내역 출력
    @Override
    public String toString() {
        return "회원번호: " + memberId + ", 예매번호: " + bookingNumber + ", 좌석: " + seat;
    }
}
