package a1120.class1;

public class StudentEx {
    public static void main(String[] args) {
        Student st1 = new Student(); 
        st1.name = "한승우";
        st1.age = 31;
        st1.studentId = "19941224";
    
        Student st2 = new Student();
        st2.name = "남우현";
        st2.age = 354;
        st2.studentId = "19910208";

        System.out.println("st1을 소개합니다.");
        //s1의 필드값 읽기
        System.out.println("이름: " +st1.name);
        System.out.println("나이: " +st1.age);
        System.out.println("학번: " +st1.studentId);

        //s2의 필드값 읽기
        System.out.println("이름: " +st2.name);
        System.out.println("나이: " +st2.age);
        System.out.println("학번: " +st2.studentId);
        }
    }
