package a1205.streamEx;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main1 {
    public static void main(String[] args) {
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario", "Milan");
        Trader alan = new Trader("Alan", "Cambridge");
        Trader brian = new Trader("Brian", "Cambridge");
        List<Transaction> transactions = Arrays.asList(
            new Transaction(brian, 2011, 300)
            , new Transaction(raoul, 2012, 1000)
            , new Transaction(raoul, 2011, 400)
            , new Transaction(mario, 2012, 700)
            , new Transaction(mario, 2012, 700)        
            , new Transaction(alan, 2012, 950)
        );
        //brian, mario 거래자 //Cambridge 거래자근무하는도시
        //1. 문제: 2011년에 일어난 모든 트랜잭션을 찾아 오름차순으로 정렬하세요.
        practice1(transactions);
        //2. 거래자가 근무하는 모든 도시를 중복없이 나열하시오
        practice2(transactions);
        //3. Cambridge에서 근무하는 모든 거래자를 찾아서 이름순으로 정렬하시오.
        practice3(transactions);
        //4. 밀라노엔 거래자가 있는가?
        practice4(transactions);
        //5. cambridge에 거주하는 거래자의 모든 트랜잭션값을 출력하시오.
        practice5(transactions);
        //6. 모든 거래자의 이름을 알파벳 순으로 정렬해서 봔환하시오.
        practice6(transactions);
        //7. 전체 트랜잭션 중 최댓값은 얼마인가?
        practice7(transactions);
        //8. 전체 트랜잭션 중 최솟값은 얼마인가?
        practice8(transactions);                                        
        }
                                        
        
        //1. 2011년에 일어나 모든 트랜잭션 찾아 오름차순으로 정렬하시오.
        private static void practice1(List<Transaction> transactions) {
            List<Transaction> result = transactions.stream()
            .filter(transaction -> 2011 == transaction.getYear())
            .sorted(Comparator.comparing(Transaction::getValue))
            .collect(Collectors.toList());
            System.out.println(result);
            System.out.println();
            //.sorted(Comparator.comparing(Transaction::getValue).reversed())//내림차순
            //.sorted((tran1, tran2) -> Integer.compare(tran1.getValue(), tran2.getValue()))
        }

        //2. 거래자가 근무하는 모든 도시를 중복없이 나열하시오.
        private static void practice2(List<Transaction> transactions) {
            List<String> result = transactions.stream()
            .map((tran) -> tran.getTrader().getCity())
            .distinct()
            .collect(Collectors.toList());
            System.out.println(result);
            System.out.println();

        }
        //3. Cambrige에서 근무하는 모든 거래자를 찾아서 이름순으로 정렬하시오.
        private static void practice3(List<Transaction> transactions) {
            List<Trader> result = transactions.stream()
            .map(Transaction::getTrader)
            .filter(trader -> ("Cambridge").equals(trader.getCity()))
            .distinct()
            .sorted(Comparator.comparing(Trader::getName))
            .collect(Collectors.toList());

            System.out.println(result);
            System.out.println();
        } 
        //4. 밀라노에 거래자가 있는가?
        private static void practice4(List<Transaction> transactions) {
            boolean result = transactions.stream()
            .anyMatch(tran -> "Milan".equals(tran.getTrader().getCity()));
            System.out.println(result);
            System.out.println();
        } 
        //5. cambridge에 거주하는 거래자의 모든 트랜잭션값을 출력하시오.                       
        private static void practice5(List<Transaction> transactions) {
            List<Transaction> result = transactions.stream()
            .filter(tran ->"Cambridge".equals(tran.getTrader().getCity()))
            .collect(Collectors.toList());
            System.out.println(result);
            System.out.println();
        }
        //6. 모든 거래자의 이름을 알파벳 순으로 정렬해서 봔환하시오.
        private static void practice6(List<Transaction> transactions) {
            String result = transactions.stream()
            .map(Transaction::getTrader)
            .map(Trader::getName)
            .distinct()
            .sorted() //호출 할 때 아무 변수도 전달하지 않으면 기본적으로 전달
            .collect(Collectors.joining(","));
            System.out.println(result); // 최종결과

        } 
        //7. 전체 트랜잭션 중 최댓값은 얼마인가?
        private static void practice7(List<Transaction> transactions) {
            Optional<Transaction> result = transactions.stream()
            .max(Comparator.comparing(Transaction::getValue));
            //Optional null이어도 에러없음
            System.out.println(result.get().getValue()); // 값만 출력될 수 있음
            System.out.println();
        }
        //8. 전체 트랜잭션 중 최솟값은 얼마인가?
        private static void practice8(List<Transaction> transactions) {
            Optional<Transaction> result = transactions.stream()
            .min(Comparator.comparing(Transaction::getValue));
            System.out.println(result.get().getValue());       
        }
}
