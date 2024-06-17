package Anil;

import java.util.Scanner;

public class codeforce {

    public static boolean isPerfectSquare(int n) {
        // Base case: 0 and 1 are perfect squares
        if (n <= 1) {
            return true;
        }

        // Initialize boundaries for binary search
        long left = 1, right = n;

        while (left <= right) {
            // Calculate middle value
            long mid = left + (right - left) / 2;

            // Calculate square of the middle value
            long square = mid * mid;

            // If the square matches n, n is a perfect
            // square
            if (square == n) {
                return true;
            }
            // If the square is smaller than n, search the
            // right half
            else if (square < n) {
                left = mid + 1;
            }
            // If the square is larger than n, search the
            // left half
            else {
                right = mid - 1;
            }
        }
        return false;
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t-->0){
            int n = s.nextInt();
            int[] arr = new int[n];
            for(int i = 0; i<n; i++){
                arr[i] = s.nextInt();
            }
            int sum = 0;
            for(int i = 0; i<n; i++){
                sum += arr[i];
            }
            if (isPerfectSquare(sum)) {
                System.out.println("YES");
            }
            else
            {
                System.out.println("NO");
            }
        }
    }
}
