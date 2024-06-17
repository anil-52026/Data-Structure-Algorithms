package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class ReverseQueue {
    public static void reverseQueue(Queue<Integer>input){
        // only one element or no element present in queue
        if(input.size() == 0 || input.size() == 1){
            return;
        }
        int temp = input.remove();
        reverseQueue(input);
        input.add(temp);
    }

    public static void main(String[] args) {
        Queue<Integer> input = new LinkedList<>();
        input.add(10);
        input.add(1);
        input.add(15);
        input.add(8);
        input.add(2);
        reverseQueue(input);
        System.out.println(input);


    }
}
