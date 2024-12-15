package a1206.movie;

import java.util.ArrayList;

public class Seats {

    public static final int MAX_ROW = 5; //최대행의 수
    public static final int MAX_COL = 5; //최대열의 수
    private String[][] map = new String[MAX_ROW][MAX_COL]; //좌석의 예매 현황

    // 예약 정보로 초기화
    public Seats(ArrayList<Reservation> reservations) throws Exception {
        for (int i = 0; i < MAX_ROW; i++) {
            for (int j = 0; j < MAX_COL; j++) {
                map[i][j] = "o"; // 초기 좌석 상태 설정(좌석 예매 가능) - 전좌석에 'o'입력
            }
        }
        for (int i = 0; i < reservations.size(); i++) {
            Reservation r = reservations.get(i);
            String seatName = r.getSeatName();
            mark(seatName); // 예매 좌석임을 표기
        }
    }

    // 좌석 예약 상태 갱신 ("x"로 마킹)
    public void mark(String seatName) throws Exception {
        char[] temp = seatName.toCharArray(); // 좌석명을 문자 배열로 변환
        int row = temp[0] - 'A'; // 행 인덱스를 계산
        int col = temp[2] - '1'; // 열 인덱스를 계산
        if ("x".equals(map[row][col])) { // 예매된 좌석인 경우
            throw new Exception("이미 예매된 좌석입니다.");
        }
        map[row][col] = "x"; // 예매되었음을 표기
    }

    // 좌석 예약 취소
    public void cancelReservation(String seatName) throws Exception {
        char[] temp = seatName.toCharArray(); // 좌석명을 문자 배열로 변환
        int row = temp[0] - 'A'; // 행 인덱스를 계산
        int col = temp[2] - '1'; // 열 인덱스를 계산
        if ("o".equals(map[row][col])) { // 좌석이 이미 취소된 상태일 경우
            throw new Exception("해당 좌석은 예약되지 않았습니다.");
        }
        map[row][col] = "o"; // 좌석 예약 취소됨을 표기
    }

    // 좌석 현황 출력
    public void show() {
        System.out.println("--------------------");
        System.out.println(" S C R E E N");
        System.out.println("--------------------");
        for (int i = 0; i < MAX_ROW; i++) {
            System.out.printf("%c ", 'A' + i);
            for (int j = 0; j < MAX_COL; j++) {
                System.out.printf(" %s", map[i][j]); // 특정 좌석 예매 현황 출력
            }
            System.out.println();
        }
        System.out.println("   1 2 3 4 5 6 7 8 9");
    }
    public void updateSeatStatus(Reservation reservation) throws Exception {
        String seatName = reservation.getSeatName();
        if (reservation.isCancelled()) {
            cancelReservation(seatName); // 예약이 취소되었으면 "o"로 표시
        } else {
            mark(seatName); // 예약되었으면 "x"로 표시
        }
    }
}

