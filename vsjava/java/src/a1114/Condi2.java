package a1114;

public class Condi2 {
    public static void main(String[] args) {
        int age = 15;
        String grade = (age > 20) ? "성인" : ( (age >= 13) ? "청소년" : "어린이");
        System.out.println(age + "은" + grade + "입니다.");

    }
}

