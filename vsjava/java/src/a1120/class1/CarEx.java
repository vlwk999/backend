package a1120.class1;

public class CarEx {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.company = "현대";
        c1.model = "아반떼";
        c1.color = "흰색";
        c1.maxSpeed = 200;
        c1. speed = 120;
        //위의 경우로만 작성할경우에는 생성자 필요없음
        //하지만 위의 경우랑 Car c2처럼 혼용에서 작성시  무조건 생성자 필수

        System.out.println("제작회사: "+ c1.company);
        System.out.println("모델명: "+ c1.model);
        System.out.println("색상: "+ c1.color);
        System.out.println("최고속도: "+ c1.maxSpeed);
        System.out.println("현재속도: "+ c1.speed);

        c1.speed = 60;
        System.out.println("수정된 속도: " +c1.speed);
        System.out.println();

        Car c2 = new Car("기아","스포티지","블랙",220,80);
        System.out.println("제작회사: "+ c2.company);
        System.out.println("모델명: "+ c2.model);
        System.out.println("색상: "+ c2.color);
        System.out.println("최고속도: "+ c2.maxSpeed);
        System.out.println("현재속도: "+ c2.speed);


    }
}