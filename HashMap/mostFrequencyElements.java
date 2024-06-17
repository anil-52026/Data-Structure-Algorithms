package HashMap;

import java.util.*;

public class mostFrequencyElements {
    /*
    Que]tion: Given an array, find the most frequent element in it. If there are multiple element that appear a
maximum number of times, print any one of them.

Input1:
n = 6
arr[] = {1, 3, 2, 1, 4, 1}
output:
1

Input2:
n = 7

arr[] = {10, 20, 10, 20, 30, 20, 20}
output:
20
     */

    // key : elements of the array
    // value : frequency of the element




    public static int maxFrequencyNumber(int[] arr){
        HashMap<Integer,Integer> h = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(h.containsKey(arr[i])){
                h.put(arr[i],h.get(arr[i])+1);
            }
            else
                h.put(arr[i],1);
        }
        int max=0;
        int maxKey=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)

        {
            if(h.get(arr[i])>max){
                max=h.get(arr[i]);
                maxKey=arr[i];
            }
        }



        return maxKey ;
    }

    public static void main(String[] args) {
        int[] arr = {2,12,2,11,12,2,1,2,2,11,12,2,6};
        System.out.println(maxFrequencyNumber(arr));

    }

}
