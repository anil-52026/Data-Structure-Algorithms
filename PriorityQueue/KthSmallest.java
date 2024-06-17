package PriorityQueue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;

public class KthSmallest {
    public static ArrayList<Integer> kSmallest(int n,int[] input, int k){
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        int i = 0;
        for(; i<k; i++){
            pq.add(input[i]);
        }
        for(; i<n; i++){
            if(input[i] < pq.peek()){
                pq.poll();
                pq.add(input[i]);
            }
        }
        ArrayList<Integer> list = new ArrayList<>();
        while(!pq.isEmpty()){
            list.add(pq.poll());
        }
        Collections.reverse(list);
        return list;


    }

    public static void main(String[] args) {
        int[] input = {2,12,9,16,10,5,3,20,25,11,1,8,6 };
        int n = 13;
        ArrayList<Integer> ans = kSmallest(n,input,4);
        System.out.println(ans);

    }
}
