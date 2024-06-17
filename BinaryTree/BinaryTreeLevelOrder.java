package BinaryTree;
import java.util.Queue;
import java.util.LinkedList;
import java.util.List;
import java.util.ArrayList;

public class BinaryTreeLevelOrder {

// Definition for a binary tree node.



    public static List<List<Integer>> levelOrder(TreeNode root) {
            Queue<TreeNode> queue = new LinkedList<>();
            List<List<Integer>> ans = new ArrayList<List<Integer>>();
            if(root == null){
                return ans;
            }
            queue.add(root);
            while(!queue.isEmpty()){
                int size = queue.size();
                // Declare a ArrayList
                List<Integer> temp = new ArrayList<>();
                for(int i = 0; i<size; i++){
                    if(queue.peek().left != null){
                        queue.add(queue.peek().left);

                    }
                    if(queue.peek().right!=null){
                        queue.add(queue.peek().right);
                    }
                    temp.add(queue.remove().val);
                }
                ans.add(temp);
            }
            return ans;
        }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
         root.left = new TreeNode(9);
         root.right = new TreeNode(20);
         root.right.left = new TreeNode(15);
         root.right.right = new TreeNode(7);
        System.out.println(levelOrder(root));

    }

    }
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

