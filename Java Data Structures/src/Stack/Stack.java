package Stack;

public class Stack {
    int[] stack = new int[5];
    int top = 0;
    public void push(int data) {
        stack[top] = data;
        top ++;
    }

    public int pop() {
        top--;
        return stack[top];
    }

    public int pick() {
        return stack[top-1];
    }

    public void show() {
        for(int n: stack) {
            System.out.println(n);
        }
    }
}
