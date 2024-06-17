package BinaryTree;
import java.util.*;
public class LevelOrderTraversal_II {
    public List<List<Integer>> levelOrderBottom(TreeNode root){
        List<List<Integer>> result = new ArrayList<>();
        // if root doesn't exist
        if(root == null){
            return result;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int levelsize = q.size();
            // make current list
            List<Integer> temp = new ArrayList<>();
            for(int i = 0; i<levelsize; i++){
                // remove current node
                TreeNode current = q.poll();
                temp.add(current.val);

                if(current.left != null){
                    q.add(current.left);
                }
                if(current.right != null){
                    q.add(current.right);
                }
            }
            result.add(0,temp);
        }
        return result;
    }
}
