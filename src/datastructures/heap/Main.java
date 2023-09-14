package datastructures.heap;

public class Main {

    public static void main(String[] args) {

        Heap myHeap = new Heap();

        myHeap.insert(100);
        myHeap.insert(99);
        myHeap.insert(72);
        myHeap.insert(61);
        myHeap.insert(58);

        System.out.println(myHeap.getHeap());

        System.out.println("\nTesting insert(): ");

        myHeap.insert(85);
        System.out.println(myHeap.getHeap());

        System.out.println("\nTesting remove() and sinkDown(): ");
        myHeap.remove();

        System.out.println(myHeap.getHeap());

    }
}
