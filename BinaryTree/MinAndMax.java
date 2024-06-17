package BinaryTree;

class Pair1<T, U> {
    T minimum;
    U maximum;

    public Pair1(T minimum, U maximum) {
        this.minimum = minimum;
        this.maximum = maximum;
    }

}
public class MinAndMax {

        public static Pair1<Integer, Integer> getMinAndMax(BinaryTreeNode<Integer> root) {
            //Your code goes here
            if(root == null){
                return new Pair1<Integer,Integer>(Integer.MAX_VALUE,Integer.MIN_VALUE);
            }
            Pair1<Integer,Integer> leftpair = getMinAndMax(root.left);
            Pair1<Integer,Integer> rightpair = getMinAndMax(root.right);

            int minimum = Math.min(root.data, Math.min(leftpair.minimum, rightpair.minimum));
            int maximum = Math.max(root.data, Math.max(leftpair.maximum, rightpair.maximum));

            return new Pair1<>(minimum,maximum);
        }

    }


