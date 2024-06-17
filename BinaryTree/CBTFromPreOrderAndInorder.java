package BinaryTree;

import java.util.HashMap;

public class CBTFromPreOrderAndInorder {

    // using HashMap
    public static TreeNode buildTree(int[] preorder, int[] inorder) {
        HashMap<Integer,Integer> map = new HashMap<>();
        // put all the element of Inorder into map
        for(int i = 0; i<inorder.length; i++){
            map.put(inorder[i],i);
        }
        int[] index = {0};
        return helper(preorder,inorder,0,preorder.length-1,map,index);
    }
    public static TreeNode helper(int[] preorder,int[] inorder,int left,int right,HashMap<Integer,Integer>map,int[] index){
        if(left>right){
            return null;
        }
        int current = preorder[index[0]];
        index[0]++;

        TreeNode root = new TreeNode(current);
        int InOrderIndex = map.get(current);

        if(left == right){
            return root;
        }
        root.left = helper(preorder,inorder,left,InOrderIndex-1,map,index);
        root.right = helper(preorder,inorder,InOrderIndex+1,right,map,index);

        return root;
    }

     // withOut Using HashMap
    public static BinaryTreeNode<Integer> helper(int[] preOrder,int[] inOrder, int InSI, int InEnd, int preSI, int preEnd){
        if(InSI > InEnd || preSI>preEnd){
            return null;
        }
        int rootdata = preOrder[preSI];
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(rootdata);

        // find the root  element index from inOrder array
        int k = 0;
        for(int i = InSI ; i<=InEnd; i++){
            if(rootdata == inOrder[i]){
                k = i;
                break;
            }
        }

        root.left = helper(preOrder, inOrder, InSI, k-1, preSI+1, preSI+(k-InSI));
        root.right = helper(preOrder,inOrder,k+1,InEnd,preSI+(k-InSI)+1,preEnd);

        return root;

    }


    public static BinaryTreeNode<Integer> BuildTree(int[] preOrder, int[] inOrder) {
        //Your code goes here
        return helper(preOrder, inOrder, 0, inOrder.length-1, 0, preOrder.length-1);

    }
}
