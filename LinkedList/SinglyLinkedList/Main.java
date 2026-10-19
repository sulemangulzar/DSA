class SinglyLinkedList{
    private Node head;
    private int size;


    private class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
}

    public void insertAtFirst(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        size++;
    }

    public void display(){
        Node current = head;
        while (current != null){
            System.out.print(current.data + "->");
            current = current.next;
        }  
        System.out.println();
    }
    public void getSize(){
        System.out.println(size);
    }

    
}


public class Main {
    public static void main(String[] args) {
        SinglyLinkedList l1 = new SinglyLinkedList();
        l1.insertAtFirst(12);
        l1.display();
        l1.getSize();    
        l1.insertAtFirst(10);
        l1.display();
        l1.getSize(); 
    }
}
