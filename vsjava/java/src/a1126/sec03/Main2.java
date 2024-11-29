package a1126.sec03;

class Parent {
    int x = 10;
    void show(){
        System.out.println("Parent show()");
    }
}
class Child extends Parent {
    int x = 20;
    void display(){
        System.out.println("X in child: " + x);//자식 클래스의 X
        System.out.println("X in parent: " + super.x);//부모 클래스의 X
        super.show(); //부모클래스의 show()메소드 호출
    }
}
public class Main2 {
    public static void main(String[] args) {
        Child child = new Child();
        child.display();
    }
}

