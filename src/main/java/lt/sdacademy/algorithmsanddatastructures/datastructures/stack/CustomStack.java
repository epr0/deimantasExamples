package lt.sdacademy.algorithmsanddatastructures.datastructures.stack;

public class CustomStack {
    private int[] arr;
    private int top;
    private int size;

    public CustomStack(int s) {
        arr = new int[s];
        size = s;
        top = 0;
    }

    public void push(int value) {
        if (isFull()) {
            System.out.println("Stack Overflow.");
        } else {
            System.out.println("Inserting value " + value);
            arr[top] = value;
            top++;
        }
    }

    public void pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow.");
        }
        int valueToReturn = arr[top-1];
        System.out.println("Removing value " + valueToReturn);
        top--;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack Underflow.");
            return 0;
        } else {
            return arr[top-1];
        }
    }

    public boolean isEmpty() {
        return top == 0;
    }

    private boolean isFull() {
        return top == size;
    }
}
