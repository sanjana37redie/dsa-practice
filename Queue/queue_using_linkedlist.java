// Problem: Implement Queue using Linked List

class LinkedListQueue {

    class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }
    }

    private Node front;
    private Node rear;

    public void enqueue(int value) {

        Node newNode = new Node(value);

        if (rear == null) {
            front = rear = newNode;
            return;
        }

        rear.next = newNode;
        rear = newNode;
    }

    public int dequeue() {

        if (front == null) return -1;

        int result = front.val;
        front = front.next;

        if (front == null) {
            rear = null;
        }

        return result;
    }

    public int peek() {
        return (front == null) ? -1 : front.val;
    }
}
