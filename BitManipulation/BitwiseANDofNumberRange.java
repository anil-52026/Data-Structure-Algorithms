package BitManipulation;

public class BitwiseANDofNumberRange {
    public static int rangeBitwiseAnd(int left, int right) {
        while(right > left){
            right = (right & (right-1));
        }
        System.out.println(right);
        return right;
    }

    public static void main(String[] args) {
        int left = 6;
        int right = 13;
        System.out.println(rangeBitwiseAnd(left,right));
    }
}
