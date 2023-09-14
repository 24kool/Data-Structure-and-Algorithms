package datastructures.hashtable;

public class Main {
    public static void main(String[] args) {

        HashTable myHashTable = new HashTable();

        //Testing set() method
        myHashTable.set("nails", 100);
        myHashTable.set("tile", 50);
        myHashTable.set("lumber", 80);

        myHashTable.set("bolts", 200);
        myHashTable.set("screws", 140);

        myHashTable.printTable();

        //Testing get()
        System.out.println("\n Testing get() : ");
        System.out.println(myHashTable.get("lumber"));

        //Testing key()
        System.out.println("\n print table out : ");
        myHashTable.printTable();
        System.out.println("\n Testing keys() : ");
        System.out.println(myHashTable.keys());
    }
}
