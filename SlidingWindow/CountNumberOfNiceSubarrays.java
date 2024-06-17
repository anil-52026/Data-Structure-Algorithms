package SlidingWindow;
import java.util.*;
public class CountNumberOfNiceSubarrays {
    public static int numberOfSubarrays(int[] nums, int k) {
        int n = nums.length;
        int i = 0;
        int j = 0; // start and end of Sliding window
        int result = 0;
        int temp = 0;
        int count = 0;
        while(j<n){
            if(nums[j] % 2 != 0){
                count++;
                temp = 0;
            }
            while(count == k){
                temp++;
                if(nums[i]%2 != 0){
                    count--;
                }
                i++;
            }
            result += temp;
            j++;
        }


        return result;

    }

    public static void main(String[] args) {
        int[] nums = {1,1,2,1,1};
        int k = 3;
        System.out.println(numberOfSubarrays(nums,k));
    }
}
