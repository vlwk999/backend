package a1127.Game2;

public class Main {
    public static void main(String[] args) {
        
        Hero[] heros = new Hero[3]; //부모 객체를 배열로 선언
        heros[0] = new Warrior("전사"); //부모 객체 배열에 자식 객체를 업캐스팅
        heros[1] = new Archer("궁수");
        heros[2] = new Wizard("마법");

        for(int i=0; i < heros.length; i++){
            heros[i].attack();

            // if(heros[i] instanceof Warrior) {
            //     Warrior temp = (Warrior) heros[i];
            //     temp.groundCutting();
            // }else if(heros[i] instanceof Archer){
            //     Archer temp = (Archer) heros[i];
            //     temp.fireArrow();
            // }else if(heros[i] instanceof Wizard){
            //     Wizard temp = (Wizard) heros[i];
            //     temp.freezing();
            // }else{
            //     System.out.println("잘못됬습니다.");
            // }

            //자바 17이상 .. 부모에 상속 받은후 부모와 자식 타입이 상호작용해 다양하게 사용 가능 =  다형성 ? 다향성?
            if(heros[i] instanceof Warrior w1) {
                w1.groundCutting();
            }else if(heros[i] instanceof Archer a1){
                a1.fireArrow();
            }else if(heros[i] instanceof Wizard f1){
                f1.freezing();
            }else{
                System.out.println("잘못됬습니다.");
            }
        }
    }
}
