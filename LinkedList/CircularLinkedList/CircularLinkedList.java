public class CircularLinkedList {
    Node head = null;

    void insertAtBeginning(int data) {
    Node newNode = new Node(data);

    if (head == null) {
        head = newNode;
        newNode.next = head;
        return;
    }

    Node temp = head;

    while (temp.next != head) {
        temp = temp.next;
    }

    newNode.next = head;
    temp.next = newNode;
    head = newNode;
    }

    void insertAtEnd(int data){
        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
            newNode.next = head;
        }
        Node temp = head;
        while(temp.next != head){
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.next = head;
    }

    void display(){
        Node temp = head;
        while(temp.next != head){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.print(temp.data);
        System.err.println("");
    }
}
