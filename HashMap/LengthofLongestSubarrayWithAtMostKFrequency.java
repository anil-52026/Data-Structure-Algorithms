package HashMap;
import java.util.*;
public class LengthofLongestSubarrayWithAtMostKFrequency {
    public static int maxSubarrayLength(int[] nums, int k) {
        // Sliding window Approach or two pointer approach
        int i = 0;
        Map<Integer,Integer> map = new HashMap<>();
        int maxlength = 0;
        for(int j = 0; j<nums.length; j++){
            map.put(nums[j],map.getOrDefault(nums[j] , 0) + 1);

            // if frequency is greater than k then reduce frequency
            while(map.get(nums[j]) > k){
                map.put(nums[i],map.get(nums[i])-1);
                i++;
            }
            maxlength = Math.max(maxlength,j-i+1);
        }

        return maxlength;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,1,2,3,1,2};
        System.out.println(maxSubarrayLength(arr,2));
    }
}
