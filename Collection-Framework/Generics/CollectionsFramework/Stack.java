package CollectionsFramework;

import java.util.ArrayList;

public class Stack<T> {

    private ArrayList<T> stack;

    public Stack() {
        stack = new ArrayList<>();
    }

    // Push element
    public void push(T item) {
        stack.add(item);
    }

    // Pop element
    public T pop() {

        if (isEmpty()) {
            System.out.println("Stack is Empty.");
            return null;
        }

        return stack.remove(stack.size() - 1);
    }

    // Peek element
    public T peek() {

        if (isEmpty()) {
            return null;
        }

        return stack.get(stack.size() - 1);
    }

    // Check Empty
    public boolean isEmpty() {
        return stack.isEmpty();
    }

    // Display Stack
    public void display() {
        System.out.println(stack);
    }
}