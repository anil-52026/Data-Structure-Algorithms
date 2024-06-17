package BinaryTree;

import java.sql.SQLOutput;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class CountNode {

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

    public static int countNode(BinaryTreeNode<Integer>root){
        // Base Case
        if(root == null){
            return 0;
        }
//        int count = 1;
//        count = count + countNode(root.left);
//        count = count + countNode(root.right);
//        return count;
        return countNode(root.left) + countNode(root.right) + 1;
    }

    // Ques 2: Sum of all nodes
    public static int SumOfNodes(BinaryTreeNode<Integer>root){
        // Base Case
        if(root == null){
            return 0;
        }
//        int sum = 0;
//        sum = sum + SumOfNodes(root.left);
//        sum = sum + SumOfNodes(root.right);
//        return  root.data+sum;
         return SumOfNodes(root.left) + SumOfNodes(root.right) + root.data;
    }



    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        BinaryTreeNode<Integer> root = takeInputLevelWise();
         System.out.println(countNode(root));
       // System.out.println(SumOfNodes(root));
    }
}
