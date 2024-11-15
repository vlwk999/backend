package a1115;

public class OddEvent {
    public static void main(String[] args) {
        // 1~20까지의 정수 중,
        // 홀수의 합계, 짝수의 합계를 각각 구하여 출력하시오.
        // 홀수의 합계 :
        // 짝수의 합계 :

        // <내가 한 방법 - 짝수의합계.ver>
        // int sum = 0;
        // for(int i =2; i <=20; i +=2){
        //     System.out.print(i+" ");
        //     sum += i;
        // }
        // System.out.println("\n합계 : " + sum);

        // <선생님이 한 방법>
        int a = 1; //증가역할변수
        int sum1 =0; //홀수의 합계를 넣을 변수
        int sum2 =0; //홀수의 합계를 넣을 변수
        //a가 20보다 작거나 같은동안 반복
        while (a<=20){
            // 홀수
            if(a % 2 ==1){
                sum1 += a;
            }

            // 짝수
            if(a % 2 == 0){
                sum2 += a;
            }
            a++;
        }
        System.out.println("홀수의 합계 : " + sum1);
        System.out.println("짝수의 합계 : " + sum2);
    }
}
