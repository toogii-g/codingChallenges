package hackerrank;

public class CounterGame {

    public static String counterGame(long n) {
        if (n == 1) return "Richard";
        int turn = 0;
        while (n > 1) {
            if ((n & (n - 1)) == 0) {
                n /= 2;
            } else {
                n -= Long.highestOneBit(n);
            }
            turn++;
        }

        return turn % 2 == 0 ? "Richard" : "Louise";
    }
}
