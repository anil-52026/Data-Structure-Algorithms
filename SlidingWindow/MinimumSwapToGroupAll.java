package SlidingWindow;

import java.util.Arrays;

public class MinimumSwapToGroupAll {

        // Concept : Sliding Window
        // Trick : for any problem involving Circular subarray
        // way-1 : twice the size of array
        // way-2 : take modulo like arr[i%n] == 0

        // Time complexity : O(N)
        // space complexity: O(2*N) ~ O(N)
        public int minSwaps(int[] nums){
            int n = nums.length;
            int[] temp = new int[2*n];

            for(int i = 0; i<2*n; i++){
                temp[i] = nums[i%n];
            }

            int totalOnes = Arrays.stream(nums).sum();

            int i = 0;
            int j = 0;

            int currOnes = 0;
            int maxCount = 0;

            while(j < 2*n){
                if(temp[j] == 1){
                    currOnes++;
                }
                while (j-i+1 > totalOnes){
                    currOnes -= temp[i];
                    i++;
                }
                maxCount = Math.max(maxCount,currOnes);
                j++;
            }
            return totalOnes - maxCount;
        }

        // without extra space + Sliding window
        // T.C = O(N)
        // S.C = O(1)
        public int minSwaps(int[] nums) {
            int n = nums.length;

            int totalOnes = 0; //  window size
            for(int i = 0; i<n; i++){
                if(nums[i] == 1){
                    totalOnes++;
                }
            }

            int i = 0;
            int j = 0;

            int currOnes = 0;
            int maxCount = 0;

            while(j < 2*n){
                if(nums[j%n] == 1){
                    currOnes++;
                }

                while(j-i+1 > totalOnes){
                    currOnes -= nums[i%n];
                    i++;
                }

                maxCount = Math.max(maxCount,currOnes);
                j++;

            }
            return totalOnes - maxCount; // i.e Number of swaps
        }
    }


