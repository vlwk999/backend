package a1205;

public class Member {
    public static int MALE = 0; // 남자
    public static int FEMALE = 0; // 여자
    //클래스 변수는 클래스명, 변수명 바로 접근 가능
    private String name;
    private int gender;     // 성별
    private int age;        // 나이

    public Member(String name, int gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }
    
    public String getName() {
        return name;
    }

    public int getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }


}
