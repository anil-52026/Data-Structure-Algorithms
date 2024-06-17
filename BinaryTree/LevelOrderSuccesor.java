package BinaryTree;
import java.util.*;


public class LevelOrderSuccesor {
    public static TreeNode findSuccesor(TreeNode root, int key){
        // If Node doesn't exist
        if(root == null){
            return null;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()){
            int size = q.size(); // it is levelSize at each level
            // Remove the root node
            TreeNode current = q.poll();

            if(current.left != null){
                q.add(current.left);
            }
            if(current.right != null){
                q.add(current.right);
            }

            if(current.val == key){
                break;
            }



        }
        return q.peek();
    }
}
