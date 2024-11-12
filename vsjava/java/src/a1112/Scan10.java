package a1112;

import java.util.Scanner;

public class Scan10 {
    public static void main(String[] args) {
        
        // Scanner 객체를 생성하여 사용자 입력을 받음
        Scanner scan = new Scanner(System.in);
        System.out.println("문자를 입력하세요 :");
        String word = scan.nextLine();
        System.out.println("출력문자열 :" + word);
    }
}

    

// 하나의 단어를 입력받아 그대로 출력해보자.

// 입력

// 한 단어가 입력된다.
// (단, 단어의 길이는 50글자 이하이다.)

// 출력

// 입력받은 단어를 그대로 출력한다.

 

// 입력 예시 

// Informatics

// 출력 예시

// Informatics

// 도움말

// 문자열은 nextLine()함수를 이용한다.

// String word = scan.nextLine();