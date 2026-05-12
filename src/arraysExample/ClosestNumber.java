package arraysExample;

import java.util.ArrayList;
import java.util.List;

public class ClosestNumber {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

//        int number = 36;

        List<Integer> input = new ArrayList<>();

        input.add(73);
        input.add(67);
        input.add(38);
        input.add(33);

        for (int number: input){

            if (number>=38){
                int quotient = number / 5;
                int l = (quotient * 5) + 5;
                if (l-number<3){
                    list.add(l);
                }else if (l-number>=3){
                    list.add(number);
                }
            }else{
                list.add(number);
            }

        }


        System.out.println(list);

    }
}
