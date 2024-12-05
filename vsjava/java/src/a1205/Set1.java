package a1205;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
//import java.util.*; 위에 처럼 써도 되지만 이렇게 써도 됨 ->대신 속도 차이가 위랑 있음

//자바 컬렉션
// 다수의 데이터를 쉽고 효과적으로 처리
// List 인터페이스
// Map
// Set

public class Set1 {
    public static void main(String[] args) {
        //객체 선언
        Set<String> set = new HashSet<String>();
        //데이터 삽입
        set.add("apple");
        set.add("banana");
        set.add("strawberry");
        set.add("kiwi");
        System.out.println();
        for(String e : set){
            System.out.println(e);
        }
        System.out.println();
        //데이터 삭제
        set.remove("apple");
        set.add("orange"); //set은 중복된 요소를 저장이 안됨
        set.add("orange");
        
        Iterator<String> iterSet = set.iterator();
        while (iterSet. hasNext()){
            System.out.println(iterSet.next()+ " ");
        }
        System.out.println();
        System.out.println(set);

        System.out.println(set.contains("orange"));
        //전체 데이터 삭제
        set.clear();
        System.out.println(set);
        System.out.println(set.isEmpty());

    }
}
