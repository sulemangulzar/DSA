public class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }

    public static void main(String[] args) {
        CircularLinkedList l1 = new CircularLinkedList();
        l1.insertAtBeginning(12);
        l1.insertAtBeginning(13);
        l1.insertAtBeginning(14);
        l1.insertAtBeginning(15);
        l1.insertAtBeginning(16);
        l1.insertAtEnd(400);
        l1.display();
    }

    
}
