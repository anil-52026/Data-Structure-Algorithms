package Heap;
import java.util.*;
public class KLargestElement {

    /* Time Complexity:
        Building the Min Heap:

       a. For each element in the input array arr[], we perform an insertion operation into the min heap.
       b. Each insertion into the min heap takes O(log k) time, where k is the size of the heap.
       c. Since we iterate over all n elements of the array, the total time complexity for this step is O(n * log k).
          Retrieving the k Largest Elements:

       a. After the min heap contains at most k elements, we retrieve (poll) the smallest element k times.
       b. Each retrieval operation (poll) from the min heap takes O(log k) time.
       c. Since we retrieve k elements, the total time complexity for this step is O(k * log k).
         Combining both steps, the total time complexity of the kLargest method is the sum of the time complexities of building the min heap and retrieving the k largest elements:

          Total Time Complexity = O(n * log k) + O(k * log k)

Now, let's analyze this further:

When k is much smaller than n, i.e., k << n, then O(n * log k) dominates the time complexity.
When k approaches n, i.e., k ≈ n, then O(k * log k) becomes significant.
However, in most cases, k is much smaller than n, so the overall time complexity is primarily determined by O(n * log k).
Therefore, the overall time complexity of the kLargest method is O(n * log k).







     */
    public static ArrayList<Integer> kLargest(int arr[], int n, int k)
    {
        // code here
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        ArrayList<Integer> result = new ArrayList<>();
        for(int i = 0; i<n; i++){
            minHeap.add(arr[i]);

            if(minHeap.size() > k){
                minHeap.poll();
            }
        }
        for(int i = 0; i<k; i++){
            result.add(minHeap.poll());
        }

        return result;
    }

    // 1985. Find the Kth Largest Integer in the Array
    public static String kthLargestNumber(String[] nums, int k) {
        int n = nums.length;
        Arrays.sort(nums);
        return nums[n-k];
    }

    public static void main(String[] args) {
        String[] nums = {"3","6","7","10"};
        System.out.println(kthLargestNumber(nums,4));
    }

}

