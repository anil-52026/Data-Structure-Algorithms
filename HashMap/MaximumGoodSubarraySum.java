package HashMap;
import java.util.*;
public class MaximumGoodSubarraySum {

        public static long maximumSubarraySum(int[] nums, int k) {
            Map<Integer, Long> prefixSumMap = new HashMap<>();

            long sum = 0;
            long maxSum = Long.MIN_VALUE;

            for (int i = 0; i < nums.length; i++) {
                sum += nums[i];

                if (prefixSumMap.containsKey(nums[i] - k)) {
                    maxSum = Math.max(maxSum, sum- prefixSumMap.get(nums[i] - k));
                }
                if (prefixSumMap.containsKey(nums[i] + k)) {
                    maxSum = Math.max(maxSum, sum- prefixSumMap.get(nums[i] + k));
                }

                if (!prefixSumMap.containsKey(nums[i]) || prefixSumMap.get(nums[i])>(long)(sum- nums[i])) {
                    prefixSumMap.put(nums[i], (long)(sum- nums[i]));
                }
            }
            return maxSum== Long.MIN_VALUE? 0 : maxSum;
        }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6};
        int k = 1;
        System.out.println(maximumSubarraySum(nums,k));
    }
}

