package a1114;

import java.util.Scanner;

public class Month {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("월을 입력해 보세요");
        int dal = scanner.nextInt();
        if(dal >=3 && dal <=5){
            System.out.println("봄입니다.");
        }else if(dal >=6 && dal <=8){
            System.out.println("여름입니다.");
        }else if(dal >=9 && dal <=11){
            System.out.println("가을입니다.");
        }else {
            System.out.println("겨울입니다.");
        }
    }
}