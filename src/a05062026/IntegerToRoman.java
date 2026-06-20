package a05062026;

public class IntegerToRoman {

    public String convertIntToRoman(int input ){

        int [] numbers = {1000,900,500,400,100,90,50,10,9,5,4,3,2,1};

        String[] romans = {
                "M", "CM", "D", "CD",
                "C", "XC", "L", "XL",
                "X", "IX", "V", "IV", "I"
        };
        StringBuilder stringBuilder = new StringBuilder();
        for (int i=0;i<numbers.length;i++){
            if (input>numbers[i]){
                stringBuilder.append(romans[i]);
                input = input - numbers[i];
            }

        }
        return stringBuilder.toString();

    }

    public static void main(String[] args) {
    IntegerToRoman integerToRoman = new IntegerToRoman();
        System.out.println(integerToRoman.convertIntToRoman(4));

    }
}
