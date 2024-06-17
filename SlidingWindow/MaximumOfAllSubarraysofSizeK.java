package SlidingWindow;
import java.util.*;
public class MaximumOfAllSubarraysofSizeK {
    //Function to find maximum of each subarray of size k.
    static ArrayList <Integer> max_of_subarrays(int arr[], int n, int k)
    {
        // Your code here
        ArrayList<Integer> result = new ArrayList<>();

        for(int i = 0; i<=n-k; i++){
            int max = Integer.MIN_VALUE;
            for(int j = i; j<i+k; j++){
                if(arr[j] > max){
                    max = arr[j];
                }
            }
            result.add(max);
        }
        return result;
    }
}
