package Codeforce_918;

import java.util.*;

public class Not_Quite_Latin {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t-->0){
            int n = 3;
            char[][] ch = new char[3][3];
            for(int i = 0; i<n; i++){
                    ch[i] = s.next().toCharArray();
            }
            Set<Character> set = new HashSet<>();
            for(int i = 0; i<n; i++) {
                for (int j = 0; j < n; j++) {
                    if (ch[i][j] == '?') {
                        // Now iterate each row and col
                        for (int k = 0; k < n; k++) {
                            set.add(ch[i][k]);
                            set.add(ch[k][j]);
                        }
                        break;
                    }
                }
            }
                String str = "ABC";
                for(int i = 0; i<str.length(); i++){
                    // agar character set me nhi to print kar do
                    if(!set.contains(str.charAt(i))){
                        System.out.println(str.charAt(i));
                    }
                }
        }
    }
}
