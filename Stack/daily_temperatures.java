// Problem: Daily Temperatures
// Find number of days until a warmer temperature

import java.util.Stack;

class TemperatureAnalyzer {

    public int[] findWarmerDays(int[] temps) {

        int n = temps.length;
        int[] answer = new int[n];

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {

            while (!stack.isEmpty() && temps[i] > temps[stack.peek()]) {

                int prevIndex = stack.pop();
                answer[prevIndex] = i - prevIndex;
            }

            stack.push(i);
        }

        return answer;
    }
}
