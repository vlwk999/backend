package a1115;

import java.util.Scanner;

public class Continue {
    public static void main(String[] args) {
        //5개의 정수를 입력받아
        //입력받은 수 중 양수(+)만 합계를 구하여 출력하시오
        Scanner scanner = new Scanner(System.in);
        int sum = 0; //합계
        for(int i=0; i < 5; i++){
            System.out.printf("정수입력:");
            int n = scanner.nextInt();
            //음수일때만 ,합계에 누적하지않고 넘어가려면?
            if(n < 0){
                continue;
                //남은 실행문을 무시하고, 다음 반복으로 점프
            }
            sum += n;  // sum = sum + n

        }
        System.out.println("양수의 합 : " + sum);
		scanner.close();
    }
}
