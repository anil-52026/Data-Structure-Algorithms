package BinaryTree;
import java.util.*;
public class AverageOfLevelsInBT {
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> result = new ArrayList<>();
        if(root == null){
            return result;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()){
            int size = q.size(); // it is levelSize at each level
            double sum = 0;
            for(int i = 0; i<size; i++){
                // Remove the root node
                TreeNode current = q.poll();
                sum += current.val;

                if(current.left != null){
                    q.add(current.left);
                }
                if(current.right != null){
                    q.add(current.right);
                }

            }
            double average = sum/size;
            result.add(average);
        }
        return result;
    }
}
