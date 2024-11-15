package a1113;


public class Q3 {
    public static void main(String[] args) {
        int sum = 0;

        for(int i = 1; i <=100; i++){
            //System.out.print(i+" ");
            sum += i; //sum = sum + i;
            // System.out.println("1부터 100 합계 :" + sum); 
            // 위처럼 사용시 100까지 합계 과정이 다 나옴
        
        }
        System.out.println("1부터 100 합계 :" + sum);

    }
}