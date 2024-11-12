package a1112;

import java.util.Scanner;

public class Printf2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("실수를 입력하세요 :");
        float num = scan.nextFloat();
        System.out.printf("%.2f",num);
    }
}
