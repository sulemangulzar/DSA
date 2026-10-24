

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
    newNode.prev = temp;
    }

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
    Node nextNode = temp.next;

    newNode.next = nextNode;
    newNode.prev = temp;
    temp.next = newNode;

    if (nextNode != null) {
        nextNode.prev = newNode;
    }
    }
    

    void deletionDLL(int value) {
    if (head == null) {
        System.out.println("Linked List is empty");
        return;
    }

    Node temp = head;

    while (temp != null && temp.data != value) {
        temp = temp.next;
    }

    if (temp == null) {
        System.out.println("Value not found");
        return;
    }

    if (temp.prev == null) {
        head = temp.next;
    } else {
        temp.prev.next = temp.next;
    }

    if (temp.next != null) {
        temp.next.prev = temp.prev;
    }
}
    void display() {
    Node temp = head;

    while (temp != null) {
        System.out.print(temp.data + "<-->");
        temp = temp.next;
    }

    System.out.println("null");
}
}
