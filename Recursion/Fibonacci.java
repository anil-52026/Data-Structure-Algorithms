package Recursion;

import java.util.*;

public class Fibonacci {
    public static int fib(int n){
        // base case
        if(n<=1){
            return n;
        }
        return fib(n-1) + fib(n-2);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println(fib(n));
        int sum = 0;
        for(int i = 0; i<n; i++){
            sum += fib(i);
        }
        System.out.println(sum);

    }
}
