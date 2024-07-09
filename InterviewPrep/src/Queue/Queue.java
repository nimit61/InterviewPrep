package Queue;

public class Queue {

    private int front;
    private int rear;

    private int[] elements;
    private int maxSize;

    public Queue New(int maxSize) {
        this.maxSize = maxSize + 1; //array is 1 cell larger than requested
        this.elements = new int[maxSize];
        this.front = 0;
        this.rear = -1;
        return this;
    }

    //Add at the rear
    public void enqueue(final int element) {

    }

    //Take from the front
    public int dequeue() {

    }

    public boolean isFull() {

    }

    public boolean isEmpty() {

    }

    public int size() {

    }
}
