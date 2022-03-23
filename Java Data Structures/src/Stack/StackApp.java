package Stack;

public class StackApp {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack();
        stack.push(15);
        stack.push(8);
        stack.push(10);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
