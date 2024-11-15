package a1115;

import java.util.Scanner;

public class Star1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("입력 : ");
        int n = scanner.nextInt();

        for(int i = 1; i <=n; i++){
            for(int j = 1; j <=n; j++){
                 System.out.print("*");
            } 
            System.out.println(); // 별을 다섯개찍고 줄 바꿈       
        }
        
    }
}
