package machineRound;

import java.util.*;

public class ConvertListToSet {


    public static <T>Set<T> convertListToSet(List<T> list){

        return new HashSet<>(list);
    }


    public static void main(String[] args) {

        ArrayList<String> listOfUsers = new ArrayList<>();

        listOfUsers.add("Abhinandan");
        listOfUsers.add("Ankan");
        listOfUsers.add("Rohit");
        listOfUsers.add("Kunal");
        listOfUsers.add("Poonam");
        listOfUsers.add("Rekha");
        listOfUsers.add("Shivam");
        listOfUsers.add("Abhinandan");

        System.out.println("List "+listOfUsers);

//        List<String> list = listOfUsers.stream().sorted(Comparator.reverseOrder()).toList();

        List<String> list = listOfUsers.stream().filter(name->name.length()>=6).toList();

        System.out.println(list);

        Set<String> names =  new HashSet<>(listOfUsers);

        System.out.println("Set of users" + names);

    }
}
