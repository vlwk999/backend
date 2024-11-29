package a1129.AccommodationReserve;

import java.util.Scanner;

public class Reservation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AccManager manager = new AccManager(); //숙소관리 객체
        boolean flag = true;
        while (flag) {
            System.out.println("\n 숙소예약 시스템에 오신걸 환영합니다(～￣▽￣)～");
            System.out.println("1. 예약가능한 숙소보기");
            System.out.println("2. 슥소 예약하기");
            System.out.println("3. 예약한 숙소 보기");
            System.out.println("4. 숙소 추가하기");
            System.out.println("5. 숙소 삭제하기");
            System.out.println("6. 숙소 정보 수정하기");
            System.out.println("7. 숙소 내용 보기");
            System.out.println("8. 종료");
            System.out.print("원하는 작업을 선택하세요 > ");
            int choice = sc.nextInt();
            sc.nextLine(); //메모리에 있는 개행문자 삭제

            switch (choice) {
                case 1:
                    System.out.println("예약가능한 숙소");
                    manager.disAvailAccomodations();
                    break;
                case 2:
                    System.out.println("숙소예약하기");
                    System.out.println("예약하려는 숙소의 이름을 입력하세요^_^");
                    String accomodationName = sc .nextLine(); //서울
                    if(manager.bookedAccomodations(accomodationName)){
                        System.out.println("숙소가 성공적으로 예약되었습니다(。^∀^)ノ");
                    }else{
                        System.out.println("숙소가 예약가능하지 않거나 존재하지 않습니다(´。＿。｀)");
                    }
                    break;
                    //예약할 수 있는 숙소가 있으면 예약한 후 true 그렇지 않으면 false
                case 3:
                    System.out.println("예약한 숙소 보기");
                    manager.disBookedAccomodations();
                    break;  
                case 4:
                    System.out.println("추가하려는 숙소이름을 입력 \n 숙소이름 >>");
                    String newName = sc.nextLine();
                    System.out.println("숙소위치 >>");
                    String newLocation = sc.nextLine();
                    System.out.println("일당숙박가격 >>");
                    Double newprice = sc.nextDouble();
                    sc. nextLine(); // 개행문자 초기화
                    System.out.println(newName + "추가하려는 숙소 이름");
                    if(newName.equals("")){ //숙소이름이 입력되어 있지 않으면 재입력 받기
                        System.out.println("추가하려는 숙소이름을 입력 \n 숙소이름 >>");
                        newName = sc.nextLine();
                    }
                    manager.addAccomodation(newName, newLocation, newprice);
                    System.out.println("숙소추가 완료");
                    break;
                case 5:
                    System.out.println("삭제시작");
                    System.out.println("삭제하려는 호텔 이름 적으세요~ : ");
                    String dname = sc.nextLine();
                    if(dname.equals("")){
                        System.out.println("삭제하려는 호텔이름 재입력 \n 이름 >> ");
                        dname = sc.nextLine();
                    }
                    manager.deleteAccomodation(dname);
                    System.out.println("삭제 끝~!");
                    break;
                case 6:
                    System.out.println("수정 시작");
                    System.out.println("수정하려는 호텔 이름 적어봐요~");
                    String uname = sc.nextLine();
                    System.out.println(uname);
                    if(uname.equals("")){
                        System.out.print("추가하려는 숙소의 이름을 입력하세요 \n name >>");
                        newName =sc.nextLine();
                    }
                    manager.updateAccomodation(uname);
                    System.out.println("수정 끝");
                    break;
                case 7: 
                    System.out.println("조회시작 \n 호텔 이름 입력 >>");
                    String sname = sc.nextLine();
                    if(sname.equals("")){
                        System.out.print("조회하려는 숙소의 이름을 입력하세요. \n name>>");
                        newName = sc.nextLine();
                    }
                    manager.showAccomodation(sname);
                    System.out.println("조회 끝");
                    break;
                case 8:
                    System.out.println("종료");
                    flag = false;
                    sc.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("다시입력하세요(´。＿。｀)");
                    break;
            }
        }

    }
}
