// Problem: Implement Queue using Stacks

import java.util.Stack;

class QueueUsingStacks {

    private Stack<Integer> inputStack;
    private Stack<Integer> outputStack;

    public QueueUsingStacks() {
        inputStack = new Stack<>();
        outputStack = new Stack<>();
    }

    public void enqueue(int value) {
        inputStack.push(value);
    }

    public int dequeue() {

        if (outputStack.isEmpty()) {

            while (!inputStack.isEmpty()) {
                outputStack.push(inputStack.pop());
            }
        }

        return outputStack.pop();
    }

    public int peek() {

        if (outputStack.isEmpty()) {

            while (!inputStack.isEmpty()) {
                outputStack.push(inputStack.pop());
            }
        }

        return outputStack.peek();
    }
}
