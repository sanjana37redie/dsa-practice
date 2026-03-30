// Problem: Factorial using Recursion

class FactorialCalculator {

    public int calculate(int n) {

        if (n <= 1) {
            return 1;
        }

        return n * calculate(n - 1);
    }
}
