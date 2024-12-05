package a1204.Ramda;

//함수형 인터페이스라고 부름
interface Calculator{
    int sum(int a, int b);
    //int mul(int a , int b);
    //Calculator 인터페이스의 메서드가 1개 이상이면 람다함수 사용 못함
}
class Mycalculator implements Calculator{

    @Override
    public int sum(int a, int b) {
        return a + b;
    }

}

public class Function3 {
    public static void main(String[] args) {
        Calculator mc = (int a, int b) -> a + b; //각 요소를 합산해라
        int result = mc.sum(3, 4);
        System.out.println(result);
    }
}
