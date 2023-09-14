package datastructures.graph;

public class Main {

    public static void main(String[] args) {

        Graph myGraph = new Graph();

        myGraph.addVertex("A");
        myGraph.addVertex("B");
        myGraph.addVertex("C");

        //Checking if the addVertex() works good
        System.out.println("\n Testing addVertex()");
        myGraph.printGraph();

        myGraph.addEdge("A", "B");
        myGraph.addEdge("A", "C");
        myGraph.addEdge("B", "C");

        //Checking if the addEdge() works good
        System.out.println("\n Testing addEdge()");
        myGraph.printGraph();

        System.out.println("\n Testing removeEdge()");

        myGraph.removeEdge("A", "B");
        myGraph.printGraph();

        System.out.println("\n myNewGraph: ");
        Graph myNewGraph = new Graph();

        myNewGraph.addVertex("A");
        myNewGraph.addVertex("B");
        myNewGraph.addVertex("C");
        myNewGraph.addVertex("D");

        myNewGraph.addEdge("A", "B");
        myNewGraph.addEdge("A", "C");
        myNewGraph.addEdge("A", "D");
        myNewGraph.addEdge("B", "D");
        myNewGraph.addEdge("C", "D");

        myNewGraph.printGraph();

        System.out.println("\n Testing removeVertex()");
        myNewGraph.removeVertex("D");

        myNewGraph.printGraph();
    }
}
