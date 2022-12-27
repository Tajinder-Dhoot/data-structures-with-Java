public class StackWithLinkedList {

    public static Node head;

    public static boolean isStackEmpty() {
        return head == null;
    }

    public static void push(int data) {
        Node newNode = new Node(data);
        if (isStackEmpty()) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public static int pop() {
        if (isStackEmpty()) {
            return -1;
        }
        Node top = head;
        head = top.next;
        top.next = null;

        return top.data;
    }

    public static int peek() {
        if (isStackEmpty()) {
            return -1;
        }

        return head.data;
    }

    public static void printStack() {
        while (!isStackEmpty()) {
            System.out.println(peek());
            pop();
        }
    }

    public static void main(String[] args) throws Exception {
        push(4);
        push(20);
        push(13);
        push(-1);

        printStack();
        System.out.println(isStackEmpty());
    }
}
