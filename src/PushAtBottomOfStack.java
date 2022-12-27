import java.util.Stack;

public class PushAtBottomOfStack {

    public static void pushAtBottomOfStack(Stack<Integer> s, int data) {
        if (s.empty()) {
            s.push(data);
            return;
        }
        int top = s.pop();
        pushAtBottomOfStack(s, data);
        s.push(top);
    }

    public static void reverse(Stack<Integer> s) {
        if (s.empty()) {
            return;
        }
        int top = s.pop();
        reverse(s);
        pushAtBottomOfStack(s, top);
    }

    public static void main(String args[]) {
        Stack<Integer> stack = new Stack<>();
        stack.push(2);
        stack.push(56);
        stack.push(-5);
        stack.push(13);

        // pushAtBottomOfStack(stack, 47);
        reverse(stack);

        while (!stack.isEmpty()) {
            System.out.println(stack.peek());
            stack.pop();
        }
    }

}
