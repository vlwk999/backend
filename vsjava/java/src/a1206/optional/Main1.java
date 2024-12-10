package a1206.optional;

import java.util.Optional;

public class Main1 {
    public static void main(String[] args) {
        UserRepository userRepository = new UserRepository();

        //존재하는 ID로 검색
        Optional<User> userOptional1 = userRepository.findById(2L); //Long으로 선언해서 L을 붙임
        userOptional1.ifPresentOrElse(
            user -> System.out.println("찾는 사용자 : " + user),
            () -> System.out.println("찾는 사용자가 없습니다.")
        ); // -> 출력값 : 찾는 사용자 : User{id=2, name='Bob'} 이렇게 나옴
        System.out.println();
        Optional<User> userOptional2 = userRepository.findById(99L); //Long으로 선언해서 L을 붙임
        userOptional2.ifPresentOrElse(
            user -> System.out.println("찾는 사용자 : " + user),
            () -> System.out.println("찾는 사용자가 없습니다.")
        ); // -> 출력값 : 찾는 사용자 : User{id=2, name='Bob'} 이렇게 나옴
        System.out.println();
        // 기본값 제공
        User defaultUser = userOptional2.orElse(new User(0L, "Default User"));
        System.out.println("기본 사용자: " + defaultUser);
        // 출력: 기본 사용자: User{id=0, name='Default User'}


    }
}
// findById 메서드
// 아이디로 사용자가 리스트를 검색하고, 결과를 Optional<User>로 반환한다.
// Optional.empty()는 사용자가 없을 때 반환됨.
// Optional 처리방식
// ifPRresentOrElse : 값이 있으면 처리, 없으면 대체 동작 수행
// orElse: 값이 없으면 기본값을 반환
// orElseThrow : 값이 없으면 예외로 던질 수 도 있음