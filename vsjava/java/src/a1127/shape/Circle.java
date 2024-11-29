package a1127.shape;

public class Circle extends Shape {

    double radius; //반지름 변수

    public Circle(){
        this(0);
    }

    public Circle (double radius){
        this.radius = radius;
    }


    @Override
    double area() {
        return Math.PI *radius * radius;
    }

    @Override
    double round() {
        // 2 x (원주율) x (반지름)
        return Math.PI * radius ;
    }
    
     @Override
    public String toString() {
        return "Circle [radius=" + radius + "]";
    }
}
