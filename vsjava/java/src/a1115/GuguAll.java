package a1115;

public class GuguAll {
    public static void main(String[] args) {
        System.out.println();
        //A x B
        //i : 단
        for(int i=1; i <=9; i++){

            for(int j =2; j <= 9; j++){
                System.out.print(i + " * " + j + " = " + i*j );
                System.out.print("   "); //탭공백
            }
            System.out.println(); //한 단 끝 --> 다음줄로
        }
    }
}
