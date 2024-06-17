package BinaryTree;

public class ConstructStringFromBT {
    //String ans = "";
    public  void preOrder(TreeNode root,String ans){
        // Base case
        if(root == null){
            return;
        }
        ans += root.val;
        // if only one node
        if(root.left == null && root.right == null){
            return;
        }
        ans += "(";
        preOrder(root.left,ans);
        ans += ")";

        if(root.right != null){
            ans += "(";
            preOrder(root.right,ans);
            ans += ")";
        }
    }
    public  String tree2str(TreeNode root){
        String ans = "";
        preOrder(root,"");
        return ans;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(4);
        root.left.left = new TreeNode(3);
    }
}
