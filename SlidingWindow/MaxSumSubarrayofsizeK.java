package SlidingWindow;
import java.util.*;
public class MaxSumSubarrayofsizeK {
    // Brutforce Approach:
    static long maximumSumSubarray1(int K, ArrayList<Integer> Arr,int N){
        // code here

        long result = Integer.MIN_VALUE;
        for(int i = 0; i<=N-K; i++){
            long sum = 0;
            for(int j = i; j<i+K; j++){
                sum += Arr.get(j);
            }
            result = Math.max(result,sum);
        }
        return result;
    }
    // Optimise Approach: Sliding Window
    static long maximumSumSubarray(int K, ArrayList<Integer> Arr,int N){
        // code here

        long result = Integer.MIN_VALUE;
        long sum = 0;
        int i = 0;
        int j = 0;
        while(j<N){
            sum += Arr.get(j);
            // if window size i.e j-i+1 is less than K
            if(j-i+1 < K){
                j++;
            }
            else if(j-i+1 == K){
                result = Math.max(result,sum);

                sum -= Arr.get(i);
                i++;
                j++;
            }
        }
        return result;
    }
}
