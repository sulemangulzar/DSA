public class QueueUsingLL {
     class Node {
        int data;
        Node next;

        Node(int value) {
            data = value;
            next = null;
        }
    }

    Node front = null;
    Node rear = null;

    // Insert at Rear
    void enqueue(int value) {

        Node newNode = new Node(value);

        if (rear == null) {
            front = newNode;
            rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
    }

    // Remove from Front
    void dequeue() {

        if (front == null) {
            System.out.println("Underflow");
            return;
        }

        System.out.println("Removed: " + front.data);
        front = front.next;

        if (front == null) {
            rear = null;
        }
    }

    // View Front
    void peek() {

        if (front == null) {
            System.out.println("Queue is empty");
        } else {
            System.out.println("Front: " + front.data);
        }
    }

    // Check empty
    boolean isEmpty() {
        return front == null;
    }

    public static void main(String[] args) {

        QueueUsingLL q = new QueueUsingLL();

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        q.peek();
        q.dequeue();
        q.peek();

        System.out.println(q.isEmpty());
    }
}
