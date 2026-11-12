
public class AllOps {

    // Node class
    class Node {
        int data;
        Node next;

        Node(int value) {
            data = value;
            next = null;
        }
    }

    Node head = null;

    // 1. Insert at beginning
    void insertFirst(int value) {
        Node newNode = new Node(value);

        newNode.next = head;
        head = newNode;
    }

    // 2. Insert at end
    void insertLast(int value) {
        Node newNode = new Node(value);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
    }

    // 3. Insert at position (1-based)
    void insertAtPosition(int value, int pos) {
        if (pos < 1 || pos > count() + 1) {
            System.out.println("Invalid position");
            return;
        }

        if (pos == 1) {
            insertFirst(value);
            return;
        }

        Node newNode = new Node(value);
        Node temp = head;

        for (int i = 1; i < pos - 1; i++) {
            temp = temp.next;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    // 4. Delete from beginning
    void deleteFirst() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        head = head.next;
    }

    // 5. Delete from end
    void deleteLast() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        if (head.next == null) {
            head = null;
            return;
        }

        Node temp = head;

        while (temp.next.next != null) {
            temp = temp.next;
        }

        temp.next = null;
    }

    // 6. Delete at position (1-based)
    void deleteAtPosition(int pos) {
        if (pos < 1 || pos > count()) {
            System.out.println("Invalid position");
            return;
        }

        if (pos == 1) {
            deleteFirst();
            return;
        }

        Node temp = head;

        for (int i = 1; i < pos - 1; i++) {
            temp = temp.next;
        }

        temp.next = temp.next.next;
    }

    // 7. Display / Traversal
    void display() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

        System.out.println();
    }

    // 8. Search a value
    boolean search(int value) {
        Node temp = head;

        while (temp != null) {
            if (temp.data == value) {
                return true;
            }

            temp = temp.next;
        }

        return false;
    }

    // 9. Count nodes
    int count() {
        int total = 0;
        Node temp = head;

        while (temp != null) {
            total++;
            temp = temp.next;
        }

        return total;
    }

    // 10. Check if empty
    boolean isEmpty() {
        return head == null;
    }

    // Main method
    public static void main(String[] args) {
        AllOps list = new AllOps();

        list.insertFirst(20);
        list.insertFirst(10);
        list.insertLast(40);
        list.insertAtPosition(30, 3);

        list.display();

        System.out.println(list.search(30));
        System.out.println(list.count());

        list.deleteFirst();
        list.display();

        list.deleteLast();
        list.display();

        list.deleteAtPosition(2);
        list.display();

        System.out.println(list.isEmpty());
    }
}
