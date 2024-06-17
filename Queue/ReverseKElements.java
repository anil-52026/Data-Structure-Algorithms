package Queue;
import java.util.Queue;
import java.util.LinkedList;

public class ReverseKElements {
    public static Queue<Integer> reverseKElements(Queue<Integer> input, int k) {
        //Your code goes here
        if( input.size() <k){
            // k = k%input.size();
            return input;
        }
        if(k == 0 || k == 1){
            return input;
        }
        reverseQueue(input, k);
        for(int i = 0; i<input.size() - k; i++){
            input.add(input.remove());
        }
        return input;


    }
    public static void reverseQueue(Queue<Integer> input, int k){
        if(input.size() == 0 || input.size() == 1 || k == 0){
            return;
        }
        int temp = input.remove();
        reverseQueue(input, k-1);
        input.add(temp);
    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        // 9 16 2 11 6 20 20
        q.add(9);
        q.add(16);
        q.add(2);
        q.add(11);
        q.add(6);
        q.add(20);
        q.add(20);
        System.out.println(reverseKElements(q,6));

    }
}
