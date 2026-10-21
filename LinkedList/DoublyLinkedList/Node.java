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
    }
}
