class Stack{
    static Node top = null;

    static void push(int value){
        Node newNode = new Node(value);
        newNode.next = top;
        top = newNode;
    }
    static void pop() {
        if (top == null) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("Popped: " + top.data);
            top = top.next;
        } 
    }
    static void display() {
        Node temp = top;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
            }
             System.out.println();
        }
        public static void main(String[] args) {
            push(20);
            push(40);
            push(60);

            display();
            pop();
            display();
        }
}
