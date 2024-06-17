package Tree;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Scanner;

public class TakeInputLevelWise {
    public static TreeNode<Integer> takeInputLevelWise() {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter root data");
        int rootData = s.nextInt();
        Queue<TreeNode<Integer>> pendingNodes = new LinkedList<>();
        TreeNode<Integer> root = new TreeNode<Integer>(rootData);
        pendingNodes.add(root);
        while (!pendingNodes.isEmpty()) {

                TreeNode<Integer> frontNode = pendingNodes.remove();
                System.out.println("Enter num of children of " + frontNode.data);
                int numChildren = s.nextInt();
                for (int i = 0; i < numChildren; i++) {
                    System.out.println("Enter " + (i + 1) + "th child of " + frontNode.data);
                    int child = s.nextInt();
                    TreeNode<Integer> childNode = new TreeNode<Integer>(child);
                    frontNode.children.add(childNode);
                    pendingNodes.add(childNode);
                }
//            } catch (QueueEmptyException e) {
//                // Shouldn't come here
//                return null;
//            }
            }

        return root;
    }

    // Depth of node
    // Given a tree, we need to print all nodes at depth k
    public static void printAtK(TreeNode<Integer> root , int k){
        if(k<0){
            return;
        }
        if(k==0){
            System.out.println(root.data);
            return;
        }
        for(int i = 0; i<root.children.size(); i++){
            printAtK(root.children.get(i),k-1);
        }
    }

    // count leaf node
    public static int countLeafNode(TreeNode<Integer> root){
        if(root == null){
            return 0;
        }
        if(root.children.size() == 0){
            return 1;
        }
        int sum = 0;
        for(int i = 0; i<root.children.size(); i++){
            int temp = countLeafNode(root.children.get(i));
            sum = sum + temp;
        }
        return sum ;

    }

    // Next Larger element in tree
    public static TreeNode<Integer> findNextLargerNode(TreeNode<Integer> root, int n){

        // Write your code here
        if(root == null){
            return null;
        }
        TreeNode<Integer> prev = null;
        if(root.data>n){
            prev = root ;
        }
        for(int i = 0; i<root.children.size(); i++){
            TreeNode<Integer> curr = findNextLargerNode(root.children.get(i), n);
            if(curr!=null){
                if(prev == null || curr.data<prev.data){
                    prev = curr;
                }
            }

        }
        return prev;

    }

    public static void main(String[] args) {
//		Scanner s= new Scanner(System.in);
//
//		TreeNode<Integer> root = takeInput(s);
        TreeNode<Integer> root = takeInputLevelWise();
        //print(root);
        //printAtK(root,2);
       // System.out.println(countLeafNode(root));
        System.out.println(findNextLargerNode(root,18).data);
    }
}
