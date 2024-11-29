package a1127.upcasting;

public class UpcastingEx {
    public static void main(String[] args) {
        Child childObj = new Child();
        Parent parentObj = new Parent();
        childObj.show();
        parentObj.show();
        Parent parentRef = childObj; // 업캐스팅(묵시형 형변환)
        parentRef.show(); //출력 - 자식객체 메서드
        //parentRef.childspecial();오류 : parent 클래스에서 정의 되지 않은 메서드(사용안됨)

    }
}
class Parent {
    void show(){
        System.out.println("부모클래스 메서드");
    }   
}
class Child extends Parent{

    @Override
    void show() {
        System.out.println("자식클래스 메서드");
    }
    void childspecial(){
        System.out.println("자식특별한 메서드"); 
    }

}
