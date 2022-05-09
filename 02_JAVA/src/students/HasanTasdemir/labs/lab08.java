package students.HasanTasdemir.labs;

public class lab08 {

    private static long[] fibonacciCache;

    public static void main(String[] args) {
        int n = 92;
        fibonacciCache = new long[n + 1];

        for(int i = 0; i <= n; ++i) {
            System.out.println(fibonacci(i) + "");
        }

    }

    private static long fibonacci(int n) {
        if (n <= 1) {
            return (long)n;
        } else if (fibonacciCache[n] != 0L) {
            return fibonacciCache[n];
        } else {
            long nthFibonacciNumber = fibonacci(n - 1) + fibonacci(n - 2);
            fibonacciCache[n] = nthFibonacciNumber;
            return nthFibonacciNumber;
        }
    }
}

