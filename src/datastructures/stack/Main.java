package datastructures.stack;

public class Main {

    public static void main(String[] args) {

        Stack myStack = new Stack(4);

        myStack.getTop();
        myStack.getHeight();

        myStack.printStack();

        //Testing push()
        System.out.println("\nTesting push:");
        myStack.push(5);
        myStack.printStack();

        //Testing pop()
        System.out.println("\nTesting pop:");
        myStack.pop();
        myStack.printStack();
    }
}
