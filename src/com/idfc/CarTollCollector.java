package com.idfc;

public class CarTollCollector {


    public static String calculateToll(  String [] arr){
        int currentPositionAtX = 0;
        int currentPositionAtY = 0;
        double totalAmount = 0;

        for (String step:arr){

            if (step.startsWith("F")){
                int stepCount = Integer.parseInt(step.substring(1));
                System.out.println(stepCount);
            }
            if (step.equals("TL") && (currentPositionAtX>=0 && currentPositionAtY>=0 ) ){

                currentPositionAtY = currentPositionAtY+1;
                totalAmount +=1;

            }else if (step.equals("TR")){
                currentPositionAtX = currentPositionAtX+1;
            }
        }

        return null;
    }


    public static void main(String[] args) {

        String [] input = {"F1","TL","F2","TL","F3"};
        calculateToll(input);

    }


}
