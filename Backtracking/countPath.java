package Backtracking;
import java.util.*;

public class countPath {

    // Count all possible path from arr[0][0] to reach destination
//    public static int count(int r, int c){
//        // Base case
//        if(r==1 || c ==1){
//            return 1;
//        }
//        // Recursive call
//        int left = count(r-1,c);
//        int right = count(r,c-1);
//        return left+right;
//    }

    public static int count(int[][] mat,int r, int c){
        // base case
        if(r == mat.length-1 || c == mat.length-1){
            return 1;
        }
        int left = count(mat,r+1,c);
        int right = count(mat,r,c+1);
        return left + right;
    }

    // printing path
    public static void printPath(String p,int r, int c){
        // Base case
        if(r==1 && c==1){
            System.out.println(p);
            return;
        }
        // Recursive call
        if(r>1){
            printPath(p+'D',r-1,c);
        }
        if(c>1){
            printPath(p+'R',r,c-1);
        }

    }

    //  Return in ArrayList
    public static ArrayList<String> print(String p,int r,int c){
        // Base case
        if(r==1 && c==1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> list = new ArrayList<>();
        if(r>1){
            list.addAll(print(p+'D',r-1,c));
        }
        if(c>1){
            list.addAll(print(p+'R',r,c-1));
        }
        return list;
    }

    public static void main(String[] args) {
        int r = 3;
        int c = 3;
        int[][] mat = {
                {1,2,3},
                {3,4,5},
                {6,7,8}

        };
        System.out.println(count(mat,0,0));
        printPath("",r,c);
        ArrayList<String> ans = print("",r,c);
        System.out.println(ans);

    }
}
