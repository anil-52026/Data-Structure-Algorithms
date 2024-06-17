package SlidingWindow;

public class ShortestSubarrayWithORAtLeastK {
    public static void add(int[] bits, int n){
        int i = 0;
        while(n>0){
            if((n&1)==1){
                bits[i]++;
            }
            n>>=1;
            i++;
        }
    }
    public static int remove(int[] bits, int n){
        int i = 0;
        while(n>0){
            if((n&1)==1){
                bits[i]--;
            }
            n>>=1;
            i++;
        }
        int decimal = 0;
        i = 0;
        for(; i<32; i++){
            if(bits[i] > 0)
                decimal += Math.pow(2,i);
        }
        return decimal;
    }
    public static int minimumSubarrayLength(int[] nums, int k) {
        int n = nums.length;
        int[] bits = new int[32];
        if(k == 0){
            return 1;
        }
        int length = Integer.MAX_VALUE;



        int i = 0;
        int j = 0; // start and end of the sliding window

        int sum = 0;

        while(j<n){
            sum |= nums[j];
            add(bits,nums[j]);
            while(sum >= k){
                length = Math.min(length,j-i+1);
                sum = remove(bits,nums[i]);
                i++;
            }

            j++;
        }
        if(length == Integer.MAX_VALUE){
            return -1;
        }
        return length;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,32,21};
        System.out.println(minimumSubarrayLength(nums,55));

    }
}
