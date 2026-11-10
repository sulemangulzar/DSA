public class ImplementUsingStack {

    class Node {
        int data;
        Node next;

        Node(int value) {
            data = value;
            next = null;
        }
    }

    Node top = null;

    void push(int value) {
        Node newNode = new Node(value);
        newNode.next = top;
        top = newNode;
    }

    void pop() {
        if (top == null) {
            System.out.println("Underflow");
        } else {
            System.out.println("Popped: " + top.data);
            top = top.next;
        }
    }

    void peek() {
        if (top == null) {
            System.out.println("Empty");
        } else {
            System.out.println("Top: " + top.data);
        }
    }

    public static void main(String[] args) {
        ImplementUsingStack s = new ImplementUsingStack();

        s.push(10);
        s.push(20);
        s.push(30);

        s.peek();
        s.pop();
        s.peek();
    }
}