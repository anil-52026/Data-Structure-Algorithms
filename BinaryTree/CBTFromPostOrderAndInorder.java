package BinaryTree;

public class CBTFromPostOrderAndInorder {
    // Without Using HashMap
    public static BinaryTreeNode<Integer> helper(int[] postOrder,int postStart, int postEnd, int[] inOrder, int InStart, int InEnd){
        if(postStart>postEnd ||  InStart>InStart){
            return null;
        }
        int rootdata = postOrder[postEnd];
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(rootdata);

        // find the root element form inOrder Array
        int k = 0;
        for(int i =InStart; i<=InEnd; i++){
            if(rootdata == inOrder[i]){
                k = i;
                break;
            }
        }
        root.left = helper(postOrder, postStart, postStart+k-InStart-1, inOrder, InStart, k-1);
        root.right = helper(postOrder, postStart+k-InStart, postEnd-1, inOrder, k+1, InEnd);

        return root;
    }

    public static BinaryTreeNode<Integer> buildTree(int[] postOrder, int[] inOrder) {
        //Your code goes here

        return helper(postOrder, 0, postOrder.length-1, inOrder, 0, inOrder.length-1);

    }
}
