package datastructures.binarysearchtree;

public class Main {

    public static void main(String[] args) {

        BinarySearchTree myBST = new BinarySearchTree();

        System.out.println("root = " + myBST.root);

        System.out.println("\n");

        myBST.insert(47);
        myBST.insert(21);
        myBST.insert(76);
        myBST.insert(18);
        myBST.insert(52);
        myBST.insert(82);

        // Testing insert()
        myBST.insert(27);

        System.out.println(myBST.root.left.right.value);

        // Testing contains()
        System.out.println("\nTesting contains()");
        System.out.println(myBST.contains(27));
        System.out.println(myBST.contains(19));

        // Testing recursive contains()
        System.out.println("\nTesting rContains()");
        System.out.println(myBST.rContains(18));

        // Testing recursive inters()
        System.out.println("\nTesting rInsert()");

        System.out.println("\nRoot: " + myBST.root.value);
        System.out.println("\nRoot->Left: " + myBST.root.left.value);
        System.out.println("\nRoot->Right: " + myBST.root.right.value);

        myBST.rInsert(40);
        System.out.println("\nRoot: " + myBST.root.value);
        System.out.println("\nRoot->Left: " + myBST.root.left.value);
        System.out.println("\nRoot->Right: " + myBST.root.right.value);

        // Testing minValue()
        System.out.println("\nTesting minValue()");
        System.out.println(myBST.minValue(myBST.root));

        // Testing deleteNode()
        myBST.deleteNode(21);
        System.out.println("\nRoot: " + myBST.root.value);
        System.out.println("\nRoot->Left: " + myBST.root.left.value);
        System.out.println("\nRoot->Right: " + myBST.root.right.value);
    }
}
