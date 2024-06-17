package Anil;

public class Ant {
    public static int returnToBoundaryCount(int[] nums) {
        int n = nums.length;
        int count = 0;
        int steps = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] > 0) {
                steps += nums[i];
            } else {
                steps -= nums[i];
            }
            if (Math.abs(steps) == 0) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums = {2,3,-5};
        System.out.println(returnToBoundaryCount(nums));
    }
}
