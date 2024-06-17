package Anil;

import java.util.ArrayList;
import java.util.Arrays;

public class ques {
    public static int[] helper(int[] arr,int start, int end){
         ArrayList<Integer> ans = new ArrayList<>();
        for(int i = 0; i<arr.length; i++){
            if(arr[i]>start && arr[i]<end){
                ans.add(arr[i]);
            }
        }
        // convert arrayList into array
        int[] a = new int[ans.size()];
        for(int i = 0; i<ans.size(); i++){
            a[i] = ans.get(i);
        }
        return a;
    }

    public static void main(String[] args) {
        int N = 6;
        int[] arr = {29,38,12,48,39,55};
        int start = 30;
        int end = 50;
       // helper(arr,start,end);

        System.out.println(Arrays.toString(helper(arr,start,end)));

    }
}
