package Anil;

public class MaximumSumIncreasingSubs {
    public static int maxSumIS(int arr[], int n)
    {
        //code here.
        int dp[] = new int[n];
        int ans = 0 ;
        for(int i = 0 ; i <n ; i++){
            dp[i] = arr[i];
        }

        for(int i = 0 ; i<n ; i++){
            for(int j = 0 ; j<i ; j++){
                if(arr[j] < arr[i]){
                    dp[i] = Math.max(dp[i] , arr[i] + dp[j]);
                }
            }

            ans = Math.max(ans , dp[i]);
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {1,101,2,3,100};
        System.out.println(maxSumIS(arr,5));
    }
}
