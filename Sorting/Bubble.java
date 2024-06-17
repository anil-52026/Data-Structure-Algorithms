package Sorting;

import java.util.Arrays;

public class Bubble {
    public static void sort(int[] arr){
        int n = arr.length;
        for(int i = 0; i<n; i++){
            for(int j = 1; j<n-i; j++){
                if(arr[j-1]>arr[j]){
                    // swap it
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {20,5,7,11,22,22,10,18,6};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
