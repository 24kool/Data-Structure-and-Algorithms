package datastructures.queue;

public class Main {
    public static void main(String[] args) {

    Queue myQueue = new Queue(7);

    myQueue.getFirst();
    myQueue.getLast();
    myQueue.getLength();

    myQueue.printQueue();

    //Testing Enqueue
    myQueue.enqueue(3);
    myQueue.enqueue(2);
    System.out.println("\nTesting Enqueue: ");
    myQueue.printQueue();

    //Testing Dequeue
    myQueue.dequeue();
    System.out.println("\nTesting Enqueue: ");
    myQueue.printQueue();
    }
}
