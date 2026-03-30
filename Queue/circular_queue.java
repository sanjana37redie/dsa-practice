// Problem: Circular Queue Implementation

class CircularQueue {

    private int[] arr;
    private int front;
    private int rear;
    private int count;

    public CircularQueue(int capacity) {
        arr = new int[capacity];
        front = 0;
        rear = -1;
        count = 0;
    }

    public void add(int value) {

        if (count == arr.length) return;

        rear = (rear + 1) % arr.length;
        arr[rear] = value;
        count++;
    }

    public int remove() {

        if (count == 0) return -1;

        int result = arr[front];
        front = (front + 1) % arr.length;
        count--;

        return result;
    }

    public int getFront() {
        return (count == 0) ? -1 : arr[front];
    }
}
