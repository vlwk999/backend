package a1118;

public class Replace1 {
    public static void main(String[] args) {
        String oldstr ="자바 문자열은 불변입니다. 자바 문자열은 string입니다.";
        String newstr =oldstr.replace("자바", "JAva");

        System.out.println(oldstr);
        System.out.println(newstr);
    }
}
