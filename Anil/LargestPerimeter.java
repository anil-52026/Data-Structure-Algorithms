package Anil;
import java.util.*;
public class LargestPerimeter {
        public static long largestPerimeter(int[] nums){
            int n = nums.length;
            Arrays.sort(nums);
            int sum = 0;
            // find total sum of polygon
            for(int i = 0; i<n; i++){
                sum += nums[i];

            }
            for(int i = n-1; i>=2; i--){
                sum -= nums[i];
                if(nums[i]<sum){
                    sum += nums[i];
                    return sum;
                }
            }
            return -1;
        }

    public static void main(String[] args) {
        int[] nums = {1,12,1,2,5,50,3};
        System.out.println(largestPerimeter(nums));
    }
    }

