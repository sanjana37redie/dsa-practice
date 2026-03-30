// Problem: Design Min Stack
// Support push, pop, top, and getMin

import java.util.Stack;

class MinStack {

    private Stack<Integer> mainStack;
    private Stack<Integer> minStack;

    public MinStack() {
        mainStack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int value) {

        mainStack.push(value);

        if (minStack.isEmpty() || value <= minStack.peek()) {
            minStack.push(value);
        }
    }

    public void pop() {

        if (mainStack.pop().equals(minStack.peek())) {
            minStack.pop();
        }
    }

    public int top() {
        return mainStack.peek();
    }

    public int getMinimum() {
        return minStack.peek();
    }
}
