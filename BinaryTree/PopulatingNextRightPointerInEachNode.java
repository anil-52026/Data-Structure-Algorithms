package BinaryTree;
import java.util.*;
public class PopulatingNextRightPointerInEachNode {
    public Node connect(Node root) {
        if(root == null){
            return null;
        }
        Node leftMost = root;
        while(leftMost.left != null){
            Node current = leftMost;
            while(current != null){
                current.left.next = current.right;
                if(current.next != null){
                    current.right.next = current.next.left;
                }
                current = current.next;
            }
            // After the while loop level is Over,when level is over you go
            // to the new level, means you start again from leftMost
            leftMost = leftMost.left;
        }
        return root;
    }
}
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {
    }

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
}
