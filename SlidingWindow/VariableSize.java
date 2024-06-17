package SlidingWindow;
import java.util.*;
public class VariableSize {

    // Brutforce Approach:
    // Function for finding maximum and value pair
//    public static int lenOfLongSubarr (int A[], int N, int K) {
//        //Complete the function
//        int length = 0;
//        for(int i = 0; i<N; i++){
//            int sum = 0;
//            for(int j = i; j<N; j++){
//                sum += A[j];
//                if(sum == K){
//                    length = Math.max(length,j-i+1);
//                }
//            }
//        }
//        return length;
//    }

    // optimal Approach: Sliding window
    public static int lenOfLongSubarr(int[] A , int N, int K){
        int i = 0;
        int j = 0;
        int sum = 0;
        int length = 0;
        while(j<N){
            // calculationss part
            sum += A[j];

            if(sum < K){
                j++;
            }
            else if(sum == K){
                length = Math.max(length, j-i+1);
                j++;
            }
            else if(sum > K){
                // reduce the window size to reduce i
                sum -= A[i];
                i++;
                j++;
            }
        }
        return length;
    }

    public static void main(String[] args) {
        //int[] A = {4,1,1,1,2,3,5};
        // it will not run for negative numbers
        int[] A = {4,1,1,-2,1,5};
        int N = A.length;
        int K = 5;
        System.out.println(lenOfLongSubarr(A,N,K));
    }
    
}
