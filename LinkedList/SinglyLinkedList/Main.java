class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Main {
    public static void main(String[] args) {
        Node node1 = new Node(10);
        Node head = node1;
        Node node2 = new Node(20);
        Node node3 = new Node(30);
        node1.next = node2;
        node2.next = node3;
        System.out.println(head.data);
        System.out.println(head.next.data);
        System.out.println(head.next.next.data);

        Node current = head;
        while (current != null){
            System.out.println(current.data);
            current = current.next;
        }   
    }
}
