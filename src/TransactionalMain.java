import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class TransactionalMain {

    public static void main(String[] args) {


      //  String userId;
        //double amount;
        //String type ;//CREDIT or DEBIT
        List<Transactional> transactionals = new ArrayList<>();

        transactionals.add(new Transactional("abc1",35,"CREDIT"));
        transactionals.add(new Transactional("sum",90,"DEBIT"));
        transactionals.add(new Transactional("kunal",20,"CREDIT"));
        transactionals.add(new Transactional("rahul",60,"DEBIT"));
        transactionals.add(new Transactional("omkar",80,"CREDIT"));
        transactionals.add(new Transactional("suresh",75,"CREDIT"));

        ////    Return top 3 users by total CREDIT amount.
        Stream<Transactional> limit = transactionals.stream().
                sorted(Comparator.comparing(Transactional::getAmount).reversed())
                .filter(transactional -> transactional.getType().equals("CREDIT"))
                .limit(3);

        limit.forEach(System.out::println);
    }
}
