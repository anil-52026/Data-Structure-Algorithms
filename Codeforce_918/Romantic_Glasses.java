package Codeforce_918;
import java.util.*;
public class Romantic_Glasses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();
            int ans = 0,x=0;
            Map<Long, Integer> map = new HashMap<>();
            long[] a = new long[(int) n];
            for (int i = 0; i < n; i++){
                a[i] = sc.nextLong();
            }
            map.put(0L, 1);
            long sum = 0;
            for (int i = 0; i < n; i++) {
                if (i % 2 == 0) {
                    sum = sum + a[i];
                } else {
                    sum = sum - a[i];
                }
                if (map.containsKey(sum))
                    ans = 1;
                else
                    map.put(sum, 1);
            }
            System.out.println(ans==1?"YES":"NO");
        }
    }
}


