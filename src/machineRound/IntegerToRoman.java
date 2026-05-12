package machineRound;

public class IntegerToRoman {


    private static final int[] VALUES = {1000,900,500,400,100,90,50,40,10,9,5,4,1};

    private static final String[] ROMAN_LITERALS = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};

    public static String convertToRoman(int number){

        if (number<1 || number>3999){
            throw new IllegalArgumentException("Input must be between 1 and 3999");

        }
        StringBuilder stringBuilder = new StringBuilder();

        for (int i=0;i<VALUES.length;i++){
            while(number>=VALUES[i]){
                stringBuilder.append(ROMAN_LITERALS[i]);
                // V I
                number -= VALUES[i];
                // 7-5 = 2
                // 2-1 = 1

            }
        }
        return stringBuilder.toString();
    }


    public static void main(String[] args) {

        System.out.println(convertToRoman(17));
        System.out.println(convertToRoman(13));
    }
}
