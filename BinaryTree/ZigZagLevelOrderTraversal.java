package BinaryTree;
import java.util.*;
public class ZigZagLevelOrderTraversal {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {

        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        if(root == null){
            return ans;
        }
        Deque<TreeNode> q = new LinkedList<>();
        q.add(root);
        boolean reverse = false;
        while(!q.isEmpty()){
            int size = q.size();
            // Declare a CurretnList i.e  ArrayList
            List<Integer> temp = new ArrayList<>();
            for(int i = 0; i<size; i++) {

                // Normal Order means not reverse
                if (!reverse) {
                    // Remove the front node & add it from back
                    TreeNode current = q.pollFirst();

                    temp.add(current.val);
                    if (current.left != null) {
                        q.addLast(current.left);
                    }
                    if (current.right != null) {
                        q.addLast(current.right);
                    }
                } else {
                    // Remove the back & add it on front

                    TreeNode current = q.pollLast();

                    temp.add(current.val);

                    if (current.right != null) {
                        q.addFirst(current.right);
                    }
                    if (current.left != null) {
                        q.addFirst(current.left);
                    }
                }
            }
            reverse = !reverse;
            ans.add(temp);
        }
        return ans;
    }
}
