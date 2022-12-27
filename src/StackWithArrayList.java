import java.util.ArrayList;

public class StackWithArrayList {

    static ArrayList<Integer> list = new ArrayList<>();

    public static boolean isStackEmpty() {
        return list.size() == 0;
    }

    public static void push(int data) {
        list.add(data);
    }

    public static int pop() {
        if (isStackEmpty()) {
            return -1;
        }
        int sizeOfList = list.size();
        return list.remove(sizeOfList - 1);
    }

    public static int peek() {
        return list.get(list.size() - 1);
    }

    public static void printStack() {
        while (!isStackEmpty()) {
            System.out.println(peek());
            pop();
        }
    }

    public static void main(String[] args) throws Exception {
        push(0);
        push(45);
        push(12);
        push(60);

        printStack();
    }
}
