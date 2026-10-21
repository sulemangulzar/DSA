public class DoublyLinkedList {
    Node head = null;

    void insertAtBeginning(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
        }else{
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }
    
    void display() {
    Node temp = head;

    while (temp != null) {
        System.out.print(temp.data + "->");
        temp = temp.next;
    }

    System.out.println("null");
}
}
