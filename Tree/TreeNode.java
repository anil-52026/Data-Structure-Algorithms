package Tree;

import java.util.ArrayList;

// T is generic which can store any kind of data like int,string etc
public class TreeNode<T> {
    public T data;
    ArrayList<TreeNode<T>> children;   // By default value of children is null

    // making a constructor
    public TreeNode(T data){
        this.data = data;
        children = new ArrayList<>();
    }
}
