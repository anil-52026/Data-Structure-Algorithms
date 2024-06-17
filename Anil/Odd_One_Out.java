package Anil;
import java.util.*;

    public class Odd_One_Out {
        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            int t = s.nextInt();
            while (t-->0){
                int a = s.nextInt();
                int b = s.nextInt();
                int c = s.nextInt();
                if(a == b){
                    System.out.println(c);
                }
                else if(b == c){
                    System.out.println(a);;
                }
                else{
                    System.out.println(b);
                }
            }
        }
}
