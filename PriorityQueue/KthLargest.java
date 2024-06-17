package PriorityQueue;

import java.util.PriorityQueue;

public class KthLargest {

    public static void printKLargest(int[] arr, int k){
        PriorityQueue<Integer>pq = new PriorityQueue<>();
        int i = 0;
        for(;i<k; i++){
            pq.add(arr[i]);
        }
        for(; i<arr.length; i++){
            int min = pq.element();
            if(min<arr[i]){
                pq.remove();
                pq.add(arr[i]);
            }
        }
        while (!pq.isEmpty()){
            System.out.println(pq.remove());
        }
    }
    public static void main(String[] args) {
       int[] arr = {2,15,8,9,12,13,20};
       int k = 3;
       printKLargest(arr,k);
        //System.out.println(arr);
        //System.out.println(printKLargest(arr,k))
    }
}
