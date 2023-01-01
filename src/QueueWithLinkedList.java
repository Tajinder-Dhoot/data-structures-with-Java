import java.util.LinkedList;
import java.util.Queue;

public class QueueWithLinkedList {
    public static Node head;
    public static Node tail;

    // check if queue is empty
    public static boolean isEmpty() {
        return head == null && tail == null;
    }

    // enqueue
    public void add(int data) {
        Node newNode = new Node(data);

        if (isEmpty()) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        tail = newNode;
    }

    /*
     * dequeue element from front bcz element leaves from front in a queue
     * returns removed element
     */
    public int remove() {
        if (isEmpty()) {
            return -1;
        }
        Node frontNode = head;

        // if queue has only one element
        if (head == tail) {
            tail = null;
        }
        head = head.next;
        frontNode.next = null;

        return frontNode.data;
    }

    public int peek() {
        if (isEmpty()) {
            return -1;
        }

        return head.data;
    }

    public void printQueue() {
        if (!isEmpty()) {
            Node current = head;

            while (current.next != null) {
                System.out.print(current.data + " --> ");
                current = current.next;
            }
            System.out.println(current.data);
        }
    }

    public static void main(String args[]) {
        // Queue<Integer> q = new LinkedList<>();
        QueueWithLinkedList q = new QueueWithLinkedList();
        q.add(10);
        q.add(-1);
        q.add(5);
        q.add(10);
        q.printQueue();
        System.out.println(q.remove());
        q.printQueue();
        System.out.println(q.peek());
    }
}
