package Anil;
import java.lang.Math.*;
public class problem {
    public static void main(String[] args) {
        String s = "ab#c";
        int n = s.length();
        //int m = t.length();
        int count1 = 0;
        String M = "";

        for(int i = 0; i<n; i++){
            if(s.charAt(i) == '#'){
                count1--;
                if(count1<0){
                    count1 = 0;
                }
            }
            else{
                count1++;
            }
        }
    }
}
