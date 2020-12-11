package lt.sdacademy.algorithmsanddatastructures.datastructures.linkedlist;

/**
 * Represents an element in the linked list.
 */
public class Node {
    /**
     * The value that the node stores.
     */
    int data;

    /**
     * Link to the next element/node from the list.
     */
    Node next;

    /**
     * Constructor to initialize a new node.
     * @param d - the value the the node will store.
     */
    Node(int d) {
        data = d;
        next = null;
    }
}
