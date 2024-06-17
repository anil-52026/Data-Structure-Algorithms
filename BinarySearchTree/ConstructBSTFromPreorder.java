package BinarySearchTree;


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
public class ConstructBSTFromPreorder {
    public static TreeNode bstFromPreorder(int[] preorder) {
        return bstFromPreorder(preorder,Integer.MAX_VALUE,new int[]{0});
    }
    public static TreeNode bstFromPreorder(int[] preorder,int bound,int[] i){
        // Base case
        if(i[0] == preorder.length || preorder[i[0]]>bound){
            return null;
        }
        TreeNode root = new TreeNode(preorder[i[0]++]);
        root.left = bstFromPreorder(preorder,root.val,i);
        root.right = bstFromPreorder(preorder,bound,i);
        return root;
    }

    public static void main(String[] args) {
        int[] preorder = {8,5,1,7,10,12};
        //TreeNode root = bstFromPreorder(preorder);
        System.out.println(bstFromPreorder(preorder));
    }
}

