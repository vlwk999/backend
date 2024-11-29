package a1129.AccommodationReserve;

import java.util.ArrayList;
import java.util.Scanner;

//숙소를 관리
public class AccManager {
    private ArrayList<Accomodation> accomodations; //숙소집합
    private ArrayList<Accomodation> bookedAccomodations; //예약한숙소
    
    public AccManager() {
        accomodations = new ArrayList<>(); //초기숙소를 저장할 리스트
        bookedAccomodations = new ArrayList<>();
        //초기숙소 추가
        accomodations.add(new Accomodation("호텔A", "서울", 100.0));
        accomodations.add(new Accomodation("호텔B", "부산", 80.0));
        accomodations.add(new Accomodation("호텔C", "제주", 120.0));

    }

    public void disAvailAccomodations() {
        System.out.println("예약가능 숙소보기");
        for(Accomodation accomodation : accomodations) {
            if(accomodation.isAvailable()){
                System.out.println(accomodation);
            }

        }
    }

    public boolean bookedAccomodations(String name) {
        for(Accomodation accomodation : accomodations) {
            if(accomodation.getName().equalsIgnoreCase(name) && accomodation.isAvailable()){
                accomodation.book(); //isAvailable 에 false를 넣는 메소드
                bookedAccomodations.add(accomodation);  //예약한숙소 arrayList추가
                return true;
            }
        }
        return false;
    }

    public void disBookedAccomodations() {
        System.out.println("예약한 숙소 : ");
        for(Accomodation accomodation : bookedAccomodations) {
            System.out.println(accomodation);
        }
    }

    public void addAccomodation(String newName, String newLocation, Double newprice) {
        accomodations.add(new Accomodation(newName, newLocation, newprice));

    }

    public void deleteAccomodation(String dname) {
        boolean result = false ;
        for(Accomodation accomodation : accomodations) {
            if(accomodation.getName().equalsIgnoreCase(dname)){
                if(accomodation.isAvailable()){
                    accomodations.remove(accomodation);
                    result = true;
                    break;
                }else{ // 숙소가 예약중이면 삭제 불가
                    result = false;
                    break;
                }
            }
        }
        if(result){
            System.out.println("삭제됨!");
        }else{
            System.out.println("삭제 안됨");
        }
    }

    public void updateAccomodation(String uname) {
        int i = 0;
        int index = -1;
        int menu = -1;
        boolean flag = true;
        Scanner sc = new Scanner(System.in);
        Accomodation newA = new Accomodation();
        System.out.println(uname);
        for(Accomodation a : accomodations){ // 리스트를 순회하면 같은 이름이 있는지
            i++;
            if(a.getName().equals(uname)){
                index = i - 1;
                newA = a; //이름이 같으면 객체를 생성해서 해당 객체를 newA에 넣는다.
            }
            System.out.println(a.getName().equals(uname) + " " + a.getName() + " " + uname);
        }
        if(index != -1){ //수정할 호텔이름이 있으면
            System.out.println("어떤거 수정할꺼??ㅇㅅㅇ \n 1. 숙박업소 이름? \t 2. 지역? \t 3. 가격? \n >>");
            menu = sc.nextInt();
            sc.nextLine();
            while(flag){
                switch (menu) {
                    case 1:
                        System.out.println("수정할 이름");
                        newA.setName(sc.nextLine()); //위치가 수정된 객체
                        accomodations.set(index,newA); //리스트에 수정
                        flag = false;
                        break;
                    case 2:
                        System.out.println("수정할 위치");
                        newA.setLocation(sc.nextLine()); //위치가 수정된 객체
                        accomodations.set(index,newA); //리스트에 수정
                        flag = false;
                        break;
                    case 3:
                        System.out.println("수정할 가격");
                        newA.setPricePerNight(sc.nextInt()); //위치가 수정된 객체
                        accomodations.set(index,newA); //리스트에 수정
                        flag = false;
                        break;
                    default:
                        System.out.println("1~3번 중에 입력하세요");
                        break;
                }
            }
        }else {
            System.out.println("찾는 숙소가 없어서 업데이트가 안됨");
        }
    }

    public void showAccomodation(String sname) {
        for(Accomodation a : accomodations){
            if(a.getName().equalsIgnoreCase(sname)){
                System.out.println(a.toString());
            }
        }
    }
    

}