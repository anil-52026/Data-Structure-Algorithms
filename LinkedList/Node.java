package LinkedList;

public class Node<T> {
    T data;
    Node<T> next;

    // making a contstructor
    Node(T data) {
        this.data = data;
        next = null;
    }
}
