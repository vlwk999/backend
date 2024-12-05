package a1205;

import java.util.Arrays;
import java.util.stream.Stream;

public class Stream4 {
    public static void main(String[] args) {
        String[] arr = new String[]{"넷", "둘", "셋", "하나"};
        //배열세서 스트림생성
        Stream<String> stream1 = Arrays.stream(arr);
        System.out.println();
        //배열의 특정 부분만을 이용한 스트림 생성
        stream1.forEach(e ->System.out.println(e + " "));
        Stream<String> stream2 = Arrays.stream(arr, 1, 3);
        stream2.forEach(e ->System.out.println(e + " "));
        //1,3 시작 인덱스와 끝 인덱스 1부터 3전까지
    }
}
