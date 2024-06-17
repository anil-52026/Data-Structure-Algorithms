package Tree;

public class FindNoOfNodes {
    public static int NumberOfNodes(TreeNode<Integer> root){
        if(root == null){
            return 0;
        }
        int count = 0;
        for(int i = 0; i<root.children.size(); i++){
            //count = count + NumberOfNodes(root.children.get(i));
            count = count + NumberOfNodes(root.children.get(i));

        }
        return count+1;
    }

    public static int maxDepth(TreeNode<Integer> root){
        if(root == null){
            return 0;
        }

        int maxdepth = 0;
        for(int i = 0; i<root.children.size(); i++){
            int temp =  maxDepth(root.children.get(i));
            maxdepth = Math.max(temp,maxdepth);
//            if(temp > maxdepth){
//                maxdepth = temp;
//            }
        }
        return maxdepth + 1;
    }

    public static void main(String[] args) {
        TreeNode<Integer> root = new TreeNode<>(10);
        TreeNode<Integer> node1 = new TreeNode<>(20);
        TreeNode<Integer> node2 = new TreeNode<>(30);
        TreeNode<Integer> node3 = new TreeNode<>(40);
        TreeNode<Integer> node4 = new TreeNode<>(50);
        TreeNode<Integer> node5 = new TreeNode<>(60);
        root.children.add(node1);
        root.children.add(node2);
        root.children.add(node3);
        node1.children.add(node4);
        node1.children.add(node5);
       //System.out.println(NumberOfNodes(root));
        System.out.println(maxDepth(root));

    }
}
