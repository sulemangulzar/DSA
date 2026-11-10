public class QueueUsingArray {
    int[] arr = {1,2,3,4};

    int front = 0;
    int rear = -1;
    
    void enqueue(int value) {
    if (rear == arr.length - 1) {
        System.out.println("Queue Overflow");
    } else {
        rear++;
        arr[rear] = value;
    }
}

    void dequeue() {
    if (front > rear) {
        System.out.println("Queue Underflow");
    } else {
        System.out.println("Removed: " + arr[front]);
        front++;
    }
}

    void peek(){
        if (front > rear){
            System.out.println("Queue is Empty");
        }
        else{
            System.err.println("Peek: " + arr[front]);
        }
    }

    boolean isEmpty() {
    return front > rear;
    }

    boolean isFull() {
    return rear == arr.length - 1;
    }


    public static void main(String[] args) {
        QueueUsingArray q = new QueueUsingArray();

        q.enqueue(12);
        q.enqueue(13);
        q.enqueue(14);

        q.dequeue();
        q.isEmpty();
        q.isFull();

    }


}
