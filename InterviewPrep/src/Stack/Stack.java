package Stack;

import jdk.jshell.spi.ExecutionControl;

public class Stack {

    private int maxSize;
    private int[] elements;
    private int top;

    public Stack New(final int maxSize){
        this.maxSize = maxSize;
        this.elements = new int[maxSize];
        this.top = -1;
        return this;
    }

    public int pop() {

        return elements[top--];
    }

    public int peek() {
        if (top == -1) {
            throw new RuntimeException("No elements in the stack");
        }
        return elements[top];
    }

    public void push(int element) {
        if (isFull()) {
            throw new RuntimeException("Stack is full");
        }
        elements[++top] = element;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return (top + 1) == maxSize;
    }
}

