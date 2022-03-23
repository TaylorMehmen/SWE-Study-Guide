package Stack;

import java.util.EmptyStackException;

public class Stack<T> {
    private StackNode<T> top;

    private static class StackNode<T> {
        private T value;
        private StackNode<T> next;

        StackNode(T value) {
            this.value = value;
        }
    }

    public void push(T data) {
        StackNode<T> cur = new StackNode<>(data);
        cur.next = top;
        top = cur;
    }

    public T peek() {
        if (top == null) {
            throw new EmptyStackException();
        }
        return top.value;
    }

    public T pop() {
        if (top == null) {
            throw new EmptyStackException();
        }
        T popped = top.value;
        top = top.next;
        return popped;
    }

    public void clear() {
        top = null;
    }


    public Boolean isEmpty() {
        return top == null;
    }

}
