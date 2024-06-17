package BinarySearchTree;

public class LCAOfBST {
    public static int getLCA(BinaryTreeNode<Integer> root, int a, int b) {
        // Base Case
        if(root==null) {
            return -1;
        }
        if(root.data == a || root.data == b){
            return root.data;
        }

        // Recursive call
        // both the node lie to the left side
        if(root.data>a && root.data>b){
            return getLCA(root.left, a, b);
        }

        // both the node lie to the right side
        else if(root.data<a && root.data<b){
            return getLCA(root.right, a, b);
        }
        else{
            // one lies to the left and other lies to the right
            return root.data;
        }

    }

}
