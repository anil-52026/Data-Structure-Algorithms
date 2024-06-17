package Stack;
import java.util.*;
public class ReverseStack {
    public static void reverseStack(Stack<Integer> stack){
        // using iteration
//        Stack<Integer> ans = new Stack<>();
//        while(!stack.isEmpty()){
//            ans.push(stack.pop());
//            System.out.print(ans.peek()+" ");
//        }

        // using Recursion
        if(stack.isEmpty()){
            return;
        }
        System.out.print(stack.peek()+" ");
        stack.pop();
        reverseStack(stack);
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(2);
        s.push(1);
        s.push(3);
        reverseStack(s);
    }

}
