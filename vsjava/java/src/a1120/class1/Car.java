package a1120.class1;

public class Car {
    //필드선언
    String company;
    String model;
    String color;
    int maxSpeed;
    int speed;

    public Car(){}; //생성자

    // public Car(String company, String model, String color, int maxSpeed, int speed){ 
    //     this.company = company;
    //     this.model = model;
    //     this.color = color;
    //     this.maxSpeed = maxSpeed;
    //     this.speed = speed;
    // };
    //두번째와 같이 혼용해서 쓸 경우 위에 생성자를 꼭 기입 해줘야 한다.

    public Car(String c, String m, String co, int max, int sp){ 
        company = c;
        model = m;
        color = co;
        maxSpeed = max;
        speed = sp;
    };
    //이렇게 작성도 가능함 간소화 할 경우 this제외가능
}
