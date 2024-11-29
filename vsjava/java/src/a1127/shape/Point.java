package a1127.shape;

public class Point {
    int x;
    int y;

    //기본생성자
    public Point(){

    }
    //매게변수가 있는 생성자
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    @Override
    public String toString() {
        return "Point [x=" + x + ", y=" + y + "]";
    }

}
