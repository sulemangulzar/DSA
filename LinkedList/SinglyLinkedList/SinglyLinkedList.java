public class SinglyLinkedList {

    Node head = null;

    // 1. Insert at beginning
    void insertAtBeginning(int value) {
        Node newNode = new Node(value);

        newNode.next = head;
        head = newNode;
    }

    // 2. Insert at end
    void insertAtEnd(int value) {
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

    // 3. Insert at specific index (0-based)
    void insertAt(int value, int index) {
        if (index < 0) {
            throw new IndexOutOfBoundsException();
        }

        if (index == 0) {
            insertAtBeginning(value);
            return;
        }

        Node temp = head;

        for (int i = 0; i < index - 1; i++) {
            if (temp == null) {
                throw new IndexOutOfBoundsException();
            }
            temp = temp.next;
        }

        if (temp == null) {
            throw new IndexOutOfBoundsException();
        }

        Node newNode = new Node(value);

        newNode.next = temp.next;
        temp.next = newNode;
    }

    // 4. Delete by value (first occurrence)
    void deletionSLL(int value) {
        if (head == null) {
            System.out.println("Linked List is empty");
            return;
        }

        // Delete head
        if (head.data == value) {
            head = head.next;
            return;
        }

        Node temp = head;

        // Find node before the one to delete
        while (temp.next != null &&
               temp.next.data != value) {
            temp = temp.next;
        }

        // Value not found
        if (temp.next == null) {
            System.out.println("Value not found");
            return;
        }

        // Skip the node
        temp.next = temp.next.next;
    }

    // 5. Display
    void display() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    // Node class
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    // Testing
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();

        list.insertAtBeginning(20);
        list.insertAtBeginning(10);
        list.insertAtEnd(40);
        list.insertAt(30, 2);

        list.display();

        list.deletionSLL(20);

        list.display();
    }
}