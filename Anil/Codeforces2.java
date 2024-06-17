package Anil;
import java.util.*;
public class Codeforces2 {

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t-->0){
            int n = s.nextInt();
            int[] arr = new int[n];
            for(int i = 0; i<n; i++){
                arr[i] = s.nextInt();
            }
            int sum1 = 0;
            int sum2 = 0;
            for(int i = 0; i<n; i++){
                if(i%2 == 0){
                    sum1 += arr[i];
                }else{
                    sum2 += arr[i];
                }
            }
            if (sum1 == sum2) {
                System.out.println("YES");
            }
            else
            {
                System.out.println("NO");
            }
        }
    }
}
