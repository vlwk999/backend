package a1125.hak2;

public class Student {
    //getter, setter, 생성자를 활요한 연습 문제
    //문제 1: 학생 클래스 만들기
    //문제 설명:
    
    //학생의 이름, 학번, 세 과목의 점수를 저장하는 student 클래스를 생성하세요.
    //각 변수에 대한 private 접근 제한자를 사용하여 정보를 보호하고, getter와 setter 메소드를 통해 값을 조회하고 변경하도록 하세요.
    //생성자를 이용하여 학생 정보를 초기화하고, 평균 점수를 계산하는 메소드를 추가하세요.

    private String name;
    private int studentId;
    private int kor, math, eng;

    //생성자 - 초기값을 쉽게 대입하기 위해 만든다.(약간 커스텀 생성자 느낌)
    public Student(String name, int studentId, int kor, int math, int eng) {
        this.name = name;
        this.studentId = studentId;
        this.kor = kor;
        this.math = math;
        this.eng = eng;
    }

    public Student() { //기본생성자 
		//TODO Auto-generated constructor stub
	}

	public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getStudentId() {
        return studentId;
    }
    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }
    public int getKor() {
        return kor;
    }
    public void setKor(int kor) {
        this.kor = kor;
    }
    public int getMath() {
        return math;
    }
    public void setMath(int math) {
        this.math = math;
    }
    public int getEng() {
        return eng;
    }
    public void setEng(int eng) {
        this.eng = eng;
    }
    public double getAverage() {
        // double result = (kor+math+eng)/3.0;
        // return result;
        return (kor+math+eng)/3.0;
    }

    // public String getAverage() {
    //     double result = (kor+math+eng)/3.0;
    //     System.out.println(result);
    // }

}
