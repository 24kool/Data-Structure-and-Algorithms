package datastructures.doublylinkedlist;

public class Main {

    public static void main(String[] args) {

        DoublyLinkedList myDLL = new DoublyLinkedList(7);

        myDLL.getHead();
        myDLL.getTail();
        myDLL.getLength();

        myDLL.printList();

        myDLL.append(8);
        System.out.println("\nTesting append():");
        myDLL.printList();

        // Testing removeLast()
        System.out.println("\nTesting removeLast():");
        // 2 Items
        System.out.println(myDLL.removeLast().value);
        // 1 Items
        System.out.println(myDLL.removeLast().value);
        // 0 Items
        System.out.println(myDLL.removeLast());

        //Testing prepend()
        System.out.println("\n Testing prepernd():");
        myDLL.append(11);
        myDLL.prepend(90);
        myDLL.printList();

        //Testing removeFirst()
        System.out.println("\n Testing removeFirst() Value:");
        System.out.println(myDLL.removeFirst().value);
        System.out.println("\n Printing current list: ");
        myDLL.printList();

        //Testing get()
        System.out.println("\n Making a new linked list:");
        myDLL.append(8);
        myDLL.append(5);
        myDLL.append(4);
        myDLL.append(11);
        myDLL.append(7);
        myDLL.printList();
        System.out.println("\n Testing get() Value:");
        System.out.println(myDLL.get(4).value);

        //Testing set()
        myDLL.set(3, 5);
        System.out.println("\n Testing set Value:");
        myDLL.printList();

        //Testing insert()
        System.out.println("\n Testing insert Value:");
        System.out.println(myDLL.insert(0,3));
        myDLL.printList();

        //Testing remove()
        myDLL.remove(3);
        System.out.println("\n Testing remove Value:");
        myDLL.printList();

    }
}
