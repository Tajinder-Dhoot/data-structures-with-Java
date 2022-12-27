public class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }

    public static void main(String[] args) throws Exception {
        Node n1 = new Node(5);
        System.out.println(n1.data);
        System.out.println(n1.next);
    }
}
