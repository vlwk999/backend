package a1205;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Set2 {
    //중복된 값이 있는 리스트
    public static void main(String[] args) {
        List<String> items =  new ArrayList<>();

        //중복된 값이 있는 리스트
        items.add("apple");
        items.add("banana");
        items.add("kiwi");
        items.add("apple");
        items.add("melon");

        //HashSet을 사용하여 중복 제거
        Set<String> uniqueItems = new HashSet<>(items);
        //결과 출력
        System.out.println("중복 제거 후 리스트: " + uniqueItems);
    }
}
