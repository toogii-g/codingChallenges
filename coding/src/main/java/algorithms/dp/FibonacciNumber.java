package algorithms.dp;

class FibonacciNumber {
    public int fib(int n) {
        int first = 0;
        int second = 1;
        for (int i = 0; i < n; i++) {
            int tmp = second;
            second = first + second;
            first = tmp;
        }

        return first;
    }
}