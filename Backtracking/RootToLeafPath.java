package Backtracking;
import java.util.*;

class Node
{
    int data;
    Node left;
    Node right;

    Node(int data)
    {
        this.data = data;
        left = null;
        right = null;
    }
}
public class RootToLeafPath {
    public static ArrayList<ArrayList<Integer>> Paths(Node root) {
        // code here
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        findPath(root,new ArrayList<>(),result);
        return result;
    }
    public static void findPath(Node root, ArrayList<Integer> temp, ArrayList<ArrayList<Integer>> result){
        if(root == null){
            return;
        }

        temp.add(root.data);

        if(root.left == null && root.right == null){
            result.add(new ArrayList<>(temp));
        }

        findPath(root.left,temp,result);
        //temp.remove(temp.size()-1);
        findPath(root.right,temp,result);
        temp.remove(temp.size()-1);
    }

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        root.left.right = new Node(60);

        ArrayList<ArrayList<Integer>> ans = Paths(root);
       // System.out.println(Arrays.deepToString());
        System.out.println(ans);
    }
}
