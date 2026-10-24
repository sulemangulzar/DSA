public class Node {
    int data;
    Node next;
    Node prev;

    Node(int data){
        this.data = data;
        this.next = null;
        this.prev = null;
    }

    public static void main(String[] args) {
        DoublyLinkedList l1 = new DoublyLinkedList();
        l1.insertAtBeginning(33);
        l1.display();
        l1.insertAtEnd(344);
        l1.display();
        l1.insertAt(90, 2);
        l1.display();
        l1.deletionDLL(33);
        l1.display();
        l1.deletionDLL(90);
        l1.display();
        l1.insertAtBeginning(363);
        l1.display();
        l1.deletionDLL(363);
        l1.display();

    }
}
