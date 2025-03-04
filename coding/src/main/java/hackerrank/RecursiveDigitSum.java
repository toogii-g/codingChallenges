package hackerrank;

import java.math.BigInteger;

public class RecursiveDigitSum {

    public static int superDigit(String n, int k) {
        BigInteger num = sum(n).multiply(BigInteger.valueOf(k));

        while (num.compareTo(BigInteger.TEN) >= 0) {
            num = sum(num.toString());
        }

        return num.intValue();

    }

    public static BigInteger sum(String n) {
        BigInteger num = BigInteger.ZERO;
        for (char c : n.toCharArray()) {
            int digit = c - '0';

            num = num.add(BigInteger.valueOf(digit));
        }

        return num;

    }
}
