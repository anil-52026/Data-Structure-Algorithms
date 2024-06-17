package BinaryTree;
import java.util.*;
public class LevelOrderTraversal {
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        if(root == null){
            return ans;
        }
        q.add(root);
        while(!q.isEmpty()){
            int size = q.size();
            // Declare a ArrayList
            List<Integer> temp = new ArrayList<>();
            for(int i = 0; i<size; i++){
                // Remove the current node
                TreeNode current = q.poll();
                // put it into temporary list
                // because we are putting int into list so .val
                temp.add(current.val);
                if(current.left!=null){
                    q.add(current.left);
                }
                if(current.right!=null){
                    q.add(current.right);
                }
            }
            ans.add(temp);
        }
        return ans;
    }
}
