package a1127.shape;

public abstract class Shape {

    Point point;
    //Point 타입에 point 라는 필드를 만들고
    //Point는 좌표를 나타내는 객체로, 도형의 우피를 나타내기 위해 사용될 예정
    // x,y 좌표를 포함 하는 클래스

    //넓이와 둘레를 구하는 메소드 원형을 정의하시오
    //추상메소드
    //: {}블록없이 메소드 원형만 정의하고,
    //자식클래스에서 반드시 오버라이딩 해야만 사용할 수 있는 메소드;
    //형식 : abstract 반환 타입 메소드명(매개변수)

   
    abstract double area(); //넓이
    abstract double round(); //

    public Point getPoint() {
        return point;
    }
    public void setPoint(Point point) {
        this.point = point;
    }
}
