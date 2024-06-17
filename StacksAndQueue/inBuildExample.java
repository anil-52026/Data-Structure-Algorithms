package StacksAndQueue;
import java.util.*;


public class inBuildExample {
    public static void main(String[] args) {
//        Stack<Integer> stack = new Stack<>();
//        stack.push(34);
//        stack.push(45);
//        stack.push(2);
//        stack.push(9);
//        stack.push(18);
//
//        // pop() returns int
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());

        Queue<Integer> q = new LinkedList<>();
        q.add(3);
        q.add(6);
        q.add(5);
        q.add(19);
        q.add(1);

        // just get the item not remove the item
        System.out.println(q.peek());
        System.out.println(q.remove());

        // Deque: insert and remove from both the sides
           /* Some Important points
            1. null is not allowed
            2.it is not thread safe either
            3.it has no capacity restriction
            4. it is faster than linkedList & stack
            */
        Deque<Integer> deque = new ArrayDeque<>();
         deque.add(89);
         deque.addLast(78);
         deque.removeFirst();
         //etc etc



    }
}
