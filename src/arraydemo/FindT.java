package arraydemo;

import java.math.BigInteger;

public class FindT {

    public static void square(BigInteger n ){
        System.out.println(n);
        BigInteger sw = n.multiply(n);
        BigInteger data =( (sw.subtract( new BigInteger("25")))).divide(n.subtract(new BigInteger("5")));
        BigInteger checks = new BigInteger("10");
        if (data.equals(checks)){
            System.out.println("for n " + n + " whose square is " +sw);
            System.out.println("Number is " + n);
        }

    }


    public static void main(String[] args) {

        BigInteger start = BigInteger.TEN;
        BigInteger end = new BigInteger("9".repeat(1_000_000));
        BigInteger one = BigInteger.ONE;

        for (BigInteger i = start; i.compareTo(end) < 0; i = i.add(one)){
            BigInteger input = new BigInteger(i+"");
            square(input);

        }


    }
}
