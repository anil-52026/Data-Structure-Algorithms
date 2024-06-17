package Backtracking;
import java.util.*;
public class RatInAMaze {
    public static void solve(int r, int c, int[][] maze,int n, StringBuilder path, ArrayList<String> result){
        // Base case
        if(r<0 || r>=n || c<0 || c>=n || maze[r][c] == 0){
            return;
        }
        if(r == n-1 && c == n-1){
            result.add(path.toString());
            return;
        }
        //mark it visited so that in current rec call i don't visited again
        maze[r][c] = 0;

        path.append('U');
        solve(r-1,c,maze,n,path,result);
        path.deleteCharAt(path.length() - 1);

        path.append('D');
        solve(r+1,c,maze,n,path,result);
        path.deleteCharAt(path.length() - 1);

        path.append('L');
        solve(r,c-1,maze,n,path,result);
        path.deleteCharAt(path.length() - 1);

        path.append('R');
        solve(r,c+1,maze,n,path,result);
        path.deleteCharAt(path.length() - 1);

        // when we backtrack then mark visited as 1
        // so that we can explore other path
        maze[r][c] = 1;
    }
    public static ArrayList<String> findPath(int[][] maze, int n) {
        // Your code here
        ArrayList<String> result = new ArrayList<>();
        StringBuilder path = new StringBuilder();
        solve(0,0,maze,n,path,result);
        return result;
    }
}
