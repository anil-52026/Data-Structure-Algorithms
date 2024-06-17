package POTD;
import java.util.*;
public class RestoretheArrayFromAdjacentPairs {
    public static int[] restoreArray(int[][] adjacentPairs) {
        int n = adjacentPairs.length;
        int m = adjacentPairs[0].length;
        Set<Integer> set = new HashSet<>();
        for(int  i = 0 ;i<n; i++){
            for(int j = 0; j<m; j++){
                set.add(adjacentPairs[i][j]);
            }
        }
        // convert set into array
        int i = 0;
        int[] arr = new int[set.size()];
        for(int temp : set){
            arr[i++] = temp;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[][] arr = {
                      {4,-2},
                      {1,4},
                      {-3,1},
        };
        //System.out.println(restoreArray(Arrays.deepToString(arr)));
        int[] ans = restoreArray(arr);
        System.out.println(Arrays.toString(ans));

    }
}


