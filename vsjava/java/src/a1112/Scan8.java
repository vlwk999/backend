package a1112;

import java.util.Scanner;

public class Scan8 {
    public static void main(String[] args) {
        // 출력 b a
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.print("a 값 입력: ");
		String a = scanner.next();
				
		System.out.print("b 값 입력: ");
		String b = scanner.next();
        
        System.out.print(b+" "+a);
        
 
    }   
}