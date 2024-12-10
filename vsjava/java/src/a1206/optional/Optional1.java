package a1206.optional;

import java.util.Optional;

// Optional은 null처리 위한 도구
// null에 접근 했을때 nullPointException 
public class Optional1 {
    public static void main(String[] args) {
       Optional<String> optional = Optional.of("Hello");
       // 값이 반드시 있어야 함

       Optional<String> optional1 = Optional.ofNullable("hello"); //null값 허용
       // 값이 있으면 출력
       optional1.ifPresent(System.out::println);

       // 값이 없으면 기본값 반환
       String value = optional.orElse("기본값 출력");
       System.out.println(value);

       // 값이 없으면 기본값을 생성
       String generatedValue = optional.orElseGet(() -> "Generated Value");
       System.out.println(generatedValue); // 출력: Hello

       // 값이 없으면 예외 던지기 //이거 스프링에서 완전 단골손님
       String result = optional.orElseThrow(() -> new IllegalArgumentException("No value present"));
       System.out.println(result); // 출력: Hello

    }
}
