package Sorting;

import java.util.Arrays;

public class Insertion {
    public static void sort(int[] arr){
        for(int i = 0; i<arr.length; i++){
            for(int j = i; j>0; j--){
                // swap it
                if(arr[j-1]>arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {11,5,2,1,10,12,2,20,3};
        sort(arr);
        System.out.println(Arrays.toString(arr));
        //System.out.println(sort(Arrays.toString(arr)));
    }
}
