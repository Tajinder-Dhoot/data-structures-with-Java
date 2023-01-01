import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class QueueWithJavaFramework {

    public static void main(String args[]) {
        // Queue<Integer> q = new LinkedList<>();
        Queue<Integer> q = new ArrayDeque<>();

        q.add(10);
        q.add(-1);
        q.add(5);
        q.add(10);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }

        System.out.println(q.remove());
        System.out.println(q.peek());
    }
}
