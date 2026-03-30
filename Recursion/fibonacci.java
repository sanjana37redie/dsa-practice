// Problem: Fibonacci using Recursion

class FibonacciGenerator {

    public int getFibonacci(int n) {

        if (n == 0) return 0;
        if (n == 1) return 1;

        return getFibonacci(n - 1) + getFibonacci(n - 2);
    }
}
