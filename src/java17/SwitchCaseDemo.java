package java17;

public class SwitchCaseDemo {

    public static void main(String[] args) {

        String result;

        int num = 15;
        String status = null;
        if (num%2 ==0){
            status = Status.SUCCESS.name();
        } else if (num % 3 == 0 && num % 5 == 0 ) {
            status = Status.FAILED.name();
        }

        switch (status){

            case "SUCCESS":
                result = "Done";
                break;
            case "FAILED":
                result = "Error";
                break;
            default:
                result = "Unknown";
        }

        System.out.println(result);


        /**
         *
         * java 17 way
         *
         */

        String message = switch (status) {
            case "SUCCESS" -> "Done";
            case "FAILED" -> "Error";
            default -> "Unknown";
        };


        System.out.println(message);
    }
}
