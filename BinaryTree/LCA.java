package BinaryTree;

public class LCA {
    public static int getLCA(BinaryTreeNode<Integer> root, int a, int b) {

        // Base Case
        if(root == null){
            return -1;
        }
        if(root.data == a || root.data == b){
            return root.data;
        }
        // if(root.left == null && root.right == null){
        // 	return -1;
        // }
        int leftLCA = getLCA(root.left, a, b);
        int rightLCA = getLCA(root.right, a, b);

        //  if(leftLCA == -1 && rightLCA == -1){
        // 	 return -1;
        //  }
        if(leftLCA == -1){
            return rightLCA; // whether rightLCA is null or value
        }
        else if(rightLCA == -1){
            return leftLCA;
        }
        else {
            // both left and right are not null , we found result
            return root.data;
        }
    }
}
