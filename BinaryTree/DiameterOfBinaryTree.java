package BinaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class DiameterOfBinaryTree {
    public static BinaryTreeNode<Integer> takeInputLevelWise() {
        Scanner s = new Scanner(System.in);
        Queue<BinaryTreeNode<Integer>> pendingNodes = new LinkedList<>();
        System.out.println("Enter root data");
        int rootData = s.nextInt();
        if (rootData == -1) {
            return null;
        }
        BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);
        pendingNodes.add(root);

        while (!pendingNodes.isEmpty()) {
            BinaryTreeNode<Integer> front;
            front = pendingNodes.remove();

            System.out.println("Enter left child of " + front.data);
            int leftChild = s.nextInt();
            if (leftChild != -1) {
                BinaryTreeNode<Integer> child = new BinaryTreeNode<Integer>(leftChild);
                pendingNodes.add(child);
                front.left = child;
            }

            System.out.println("Enter right child of " + front.data);
            int rightChild = s.nextInt();
            if (rightChild != -1) {
                BinaryTreeNode<Integer> child = new BinaryTreeNode<Integer>(rightChild);
                pendingNodes.add(child);
                front.right = child;
            }
        }
        return root;
    }

    // Diameter of Binary Tree
    public static int diameter(BinaryTreeNode<Integer> root){
        // Base case
        if(root == null){
            return 0;
        }
        int option1 = height(root.left)+height(root.right);
        int option2 = diameter(root.left);
        int option3 = diameter(root.right);
        return Math.max(option1,Math.max(option2,option3));
    }
    public static int height(BinaryTreeNode<Integer> root){
        if(root == null){
            return 0;
        }
        int left = height(root.left);
        int right = height(root.right);
        return 1+Math.max(left,right);
    }


    // optimised Solution for Diameter of binary tree
    public static Pair<Integer,Integer> heightDiameter(BinaryTreeNode<Integer> root){
        if(root == null){
            // height = 0 and diameter = 0
            Pair<Integer,Integer> output = new Pair<>();
            output.first = 0;
            output.second = 0;
            return output;
        }
        Pair<Integer,Integer> lo = heightDiameter(root.left);
        Pair<Integer,Integer> ro = heightDiameter(root.right);
        int height = 1+Math.max(lo.first,ro.first);
        int option1 = lo.first+ro.first;
        int option2 = lo.second;
        int option3 = ro.second;
        int diameter = Math.max(option1,Math.max(option2,option3));
        Pair<Integer,Integer> output = new Pair<>();
        output.first = height;
        output.second = diameter;
        return output;
    }

    // Root to Node Path
    // I/P: 1,2,3,4,5,6,7  int data = 5

    public static ArrayList<Integer> getRootToNodePath(BinaryTreeNode<Integer> root ,int data){
        // Base Case
        if(root == null){
            return null;
        }
        if(root.data == data){
            ArrayList<Integer> output = new ArrayList<>();
            output.add(root.data);
            return output;
        }
        // Recursive call on left side
        ArrayList<Integer> leftOutput = getRootToNodePath(root.left,data);
        if(leftOutput != null){
            leftOutput.add(root.data);
            return leftOutput;
        }
        // Recursive call on right side
        ArrayList<Integer> rightOutput = getRootToNodePath(root.right,data);
        if(rightOutput != null){
            rightOutput.add(root.data);
            return rightOutput;
        }
        else{
            return null;
        }
    }

    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = takeInputLevelWise();
        //System.out.println(diameter(root));

        //System.out.println("Height : " + heightDiameter(root).first);
        //System.out.println("diameter : " + heightDiameter(root).second);

        ArrayList<Integer> ans = getRootToNodePath(root,5);
        System.out.println(ans);
    }


}
