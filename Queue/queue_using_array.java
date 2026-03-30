// Problem: Implement Queue using Array

class ArrayQueue {

    private int[] data;
    private int front;
    private int rear;
    private int size;

    public ArrayQueue(int capacity) {
        data = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    public void enqueue(int value) {

        if (size == data.length) return;

        rear = (rear + 1) % data.length;
        data[rear] = value;
        size++;
    }

    public int dequeue() {

        if (size == 0) return -1;

        int result = data[front];
        front = (front + 1) % data.length;
        size--;

        return result;
    }

    public int peek() {
        return (size == 0) ? -1 : data[front];
    }
}
