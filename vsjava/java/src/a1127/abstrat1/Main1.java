package a1127.abstrat1;
//추상 클래스 정의
abstract class Animal{
    //공통속성
    String name;

    public Animal(String name) {
        this.name = name;
    }
    //일반 메서드
    public void sleep(){
        System.out.println(name + "이(가) 잠을 잡니다.");
    }
    //추상 메서드(자식 클래스에서 구현 필요)
    public abstract void sound();
}
//구체적인 자식 클래스
class Dog extends Animal{

    public Dog(String name){
        super(name);
    }

    @Override
    public void sound() {
        System.out.println(name + "이(가) 멍멍 짖습니다.");
        
    }
}
class Cat extends Animal{
    public Cat(String name){
        super(name);
    }

    @Override
    public void sound() {
       System.out.println(name + "이(가) 야옹소리를 냅니다.");      
    }
}


public class Main1 {
    public static void main(String[] args) {
        //Animal animal = new Animal(); 추상클래스는 객체 생성 불가능
        Animal cat = new Cat("고양이");
        Animal dog = new Dog("강아지");
        dog.sleep();
        dog.sound();

        cat.sleep();
        cat.sound();
    }
}

