package Heap;
import java.util.*;

class Pair{
    int diff;
    int val;
    public Pair(int diff,int val){
        this.diff = diff;
        this.val = val;
    }
}
public class KClosestNumber {
    public static List<Integer> findClosestElements(int[] arr, int k, int x) {
        int n = arr.length;
        PriorityQueue<Pair> maxHeap = new PriorityQueue<>(new Comparator<Pair>(){
            public int compare(Pair p1, Pair p2){
                if(p2.diff == p1.diff){
                    return p2.val-p1.val;
                }
                return p2.diff - p1.diff;
            }
        });
        for(int i = 0; i<n; i++){
            maxHeap.offer(new Pair(Math.abs(arr[i]-x),arr[i]));

            if(maxHeap.size() > k){
                maxHeap.poll();
            }
        }
        List<Integer> result = new ArrayList<>();
        while(!maxHeap.isEmpty()){
            result.add(maxHeap.poll().val);
        }
        Collections.sort(result);
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {5,6,7,8,9};
        int k = 3;
        int x = 7;
        System.out.println(findClosestElements(nums,k,x));
    }

}
