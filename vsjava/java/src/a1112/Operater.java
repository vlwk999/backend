package a1112;

public class Operater {
    public static void main(String[] args) {
        // byte a = 10;
        // byte b = 10;
        // byte result = a + b;

        byte result1 = 10 + 20;
        System.out.println("result:" + result1);

        byte V1 = 10;
        byte V2 = 10;
        int result2 = V1 + V2; //int 타입으로 변환후 연산
        System.out.println("reuslt2:" + result2);

        byte V3 = 10;
        int V4 = 100;
        long V5 = 1000L;
        long result3 = V3 + V4 + V5;
        System.out.println("result3:" + result3);

        char V6 = 'A';
        char V7 = 1;
        int result4 = V6 + V7; // int타입으로 변환후 연산 65+1 =66
        System.out.println("result4:" + result4);
        System.out.println("result4:" + (char)result4);
        //66을 아스키 코드로 바꾸면 B

        int V8 = 10;
        int result5 = V8 / 4; //정수 연산의 결과는 정수
        System.out.println("result5:" + result5);

        int V9 =10;
        double result6 = V9 / 4.0; //double 타입으로 변환후 연산
        System.out.println("reuslt6:" +result6);
        int V10 = 1;
        int V11 = 2;
        double result7 = (double)V10 / V11; // double타입으로 변환후 연산
        System.out.println("result7:" +result7);
    }
}
