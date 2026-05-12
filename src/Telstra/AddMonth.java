package Telstra;

import java.util.HashMap;

public class AddMonth {

    public static void main(String[] args) {
        HashMap<String, Integer> months = new HashMap<>();

        months.put("January",1);
        months.put("February",2);
        months.put("March",3);
        months.put("April",4);

        System.out.println(months);
    }
}
