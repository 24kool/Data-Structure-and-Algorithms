package datastructures.linkedlist;

public class Main {
    public static void main(String[] args) {

        LinkedList myLinkedList = new LinkedList(4);

        myLinkedList.getHead();
        myLinkedList.getTail();
        myLinkedList.getLength();

        System.out.println("\nLinked List:");
        myLinkedList.printList();

        // Testing append()
        myLinkedList.append(2);
        System.out.println("\nLinked List:");
        myLinkedList.printList();
        myLinkedList.getLength();

        //Testing removeLast()
        myLinkedList.removeLast();
        System.out.println("\nLinked List:");
        myLinkedList.printList();
        myLinkedList.getLength();

        //Testing prepend()
        myLinkedList.prepend(6);
        System.out.println("\nLinked List:");
        myLinkedList.printList();
        myLinkedList.getLength();

        //Testing removeFirst()
        myLinkedList.removeFirst();
        System.out.println("\nLinked List:");
        myLinkedList.printList();
        myLinkedList.getLength();

        //Testing removeFirst() when length is 0
        myLinkedList.removeFirst();
        System.out.println("\n Testing removeFirst when the len is 0_ Linked List:");
        myLinkedList.printList();
        myLinkedList.getLength();

        // Testing append()
        myLinkedList.append(2);
        myLinkedList.append(6);
        myLinkedList.append(4);
        System.out.println("\n Testing append()_ Linked List:");
        myLinkedList.printList();
        myLinkedList.getLength();

        // Testing get()
        System.out.println("\n Testing get()_ value: " + myLinkedList.get(2).value + "\n");

        // Testing set()
        myLinkedList.set(1, 4);

        myLinkedList.printList();

        // Testing insert()
        myLinkedList.insert(3, 1004);
        System.out.println("\n Testing insert()_ Linked List:");
        myLinkedList.printList();

        //Testing remove()
        myLinkedList.remove(3);
        System.out.println("\n Testing remove()_ Linked List:");
        myLinkedList.printList();

        //Testing reverse()
        myLinkedList.reverse();
        System.out.println("\n Testing reverse()_ Linked List:");
        myLinkedList.printList();

    }
}
