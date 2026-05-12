package streamExamples;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.summingLong;

public class TransactionsMain {

    public static void main(String[] args) {


     List<Transaction> transactions =   Arrays.asList(
                new Transaction(1,400,13),
                new Transaction(2,350,53),
                new Transaction(4,350,21),
                new Transaction(1,1200,29),
                new Transaction(2,350,30),
                new Transaction(2,350,20),
                new Transaction(5,350,5),
                new Transaction(6,1000,7)
        );


       Map<Integer,Long> collect =   transactions.stream()
               .collect(Collectors.groupingBy(
                       Transaction::getId,

                               summingLong(Transaction::getAmount)
               ));

        List<Map.Entry<Integer, Long>> top3 = collect.entrySet().stream()
                .sorted(Map.Entry.<Integer, Long>comparingByValue().reversed())
                .limit(3)
                .toList();

        top3.forEach(System.out::println);

    }
}
