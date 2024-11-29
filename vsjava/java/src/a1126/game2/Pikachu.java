package a1126.game2;
//클래스 : 객체를 정의하는 설계도
public class Pikachu {
    //멤버 :  변수 , 메소드
    private int energy;
    private String type;
    private int level;
    public int getLevel() {
        return level;
    }
    //기본생성자
    public Pikachu(){
        this(100,"전기");
    }
    //메소드 오버로딩 - "메소드 중복 정의"
    public Pikachu(int energy, String type) {
        this(energy,type,1);
        // this.energy = energy;
        // this.type = type;
    }
    //메소드 오버로딩
    public Pikachu(int energy, String type, int level) {
        this.energy = energy;
        this.type = type;
        this.level = level;
    }
    //위의 3개 전체를 생성자 오버로딩이라고 함

    //메소드
    //접근지정자 반환타입 메소드명(매개변수){}
    public String aAttack(){
        return "십만볼트";
    }
    public String bAttack() {
        return "전광석화";
    }
    @Override
    public String toString() {
        return " [energy=" + energy + ", type=" + type + ", level=" + level + ", aAttack()=" + aAttack()
                + ", bAttack()=" + bAttack() + "]";
    }


}
