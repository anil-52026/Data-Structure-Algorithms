package PreFixSum;
import java.util.*;

// Jab Number of Subarrays ki baat ho raha ho to map me prefixSum , frequency store karte hai
// jab length of subarrays ki baat ho to map me prefixSum , index store karte hai

public class prefixSum {
    // Given arr[N] , return prefix[i] where
    // prefix[i] = sum(arr[0],arr[1],......, arr[i]) ,for all  i

    // Q1. find prefix sum, when arr is given
    public static int[] prefixSum(int[] arr){
        int[] prefix = new int[arr.length];
        prefix[0] = arr[0];
        for(int i = 1; i<arr.length; i++){
            prefix[i] = prefix[i-1] + arr[i];
        }
        return prefix;
    }

    // Q2. Divide array in 2 subarray with equal sum, if possibe then return true else false
    // optimal Approach:
    public static boolean dividearray(int[] nums){
        int totalSum = 0;
        for(int i = 0; i<nums.length; i++){
            totalSum += nums[i];
        }
        int prefix = 0;
        for(int i = 0; i<nums.length-1; i++){
            prefix += nums[i];
            int ans = totalSum-prefix;
            if(ans == prefix){
                return true;
            }
        }
        return false;
    }

    //Q3. Largest Sum Contiguous subarray

    // Q4. Subarray Sum Equals K
        public static int subarraySum(int[] nums, int k) {
            int n = nums.length;
            Map<Integer,Integer> map = new HashMap<>();
            int prefixSum = 0;
            int count = 0;
            map.put(0,1);
            for(int i = 0; i<n; i++){
                // add current element to prefix Sum:
                prefixSum += nums[i];

                // Calculate x-k:
                if (map.containsKey(prefixSum - k)){
                    count += map.get(prefixSum - k);
                }


                map.put(prefixSum, map.getOrDefault(prefixSum, 0) + 1);

            }
            return count;
        }
    public static void main(String[] args) {
//        int[] arr = {6,4,5,-3,2,8};
//        System.out.println(Arrays.toString(prefixSum(arr)));
        int[] arr = {10,2,-2,-20,10};
        System.out.println(subarraySum(arr,-10));
    }
}
