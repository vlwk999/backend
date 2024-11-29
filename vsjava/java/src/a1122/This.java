package a1122;

public class This {
    public static void main(String[] args) {
        Person person = new Person("Alice");
        person.display();   
    }
}

class Person{
    String name;

    public Person(String name) {             
        this.name = name;
    }
    void display(){
        System.out.println("Name: "+this.name);
    }


}
// class를 두개 사용할 수 있나 public을 두번 사용 할 수는 없음!