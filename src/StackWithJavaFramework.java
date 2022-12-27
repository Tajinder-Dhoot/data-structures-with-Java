import java.util.Stack;

public class StackWithJavaFramework {

    public static void main(String args[]) {
        Stack<Integer> stack = new Stack<>();
        stack.push(2);
        stack.push(56);
        stack.push(-5);
        stack.push(13);

        while (!stack.isEmpty()) {
            System.out.println(stack.peek());
            stack.pop();
        }
    }

}
