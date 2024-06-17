package Anil;


class LinkedListNode<T> {
	public T data;
	public LinkedListNode<T> next;

	public LinkedListNode(T data) {
		this.setData(data);
		this.next = null;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

}

public class palindrome {
    public static boolean isPalindrome_2(LinkedListNode<Integer> head){
        int l = length(head);
        LinkedListNode<Integer> t1 = head;
        int mid= l/2;
        boolean isPalindrome= true;

        for(int i = 0;i<=mid;i++) {
            t1= t1.next;
        }
        LinkedListNode<Integer> t2 = null;
        t2= t1.next;
        t1.next= null;
        while(t2.next!=null) {
            if(t2.data == t1.data) {
                isPalindrome=true;
            }
            else {
                isPalindrome=false;
            }
            t1=t1.next;
            t2=t2.next;
        }
        return isPalindrome;
    }

    public static int length(LinkedListNode<Integer> head){
        int count=0;
        while(head!=null){
            count++;
            head=head.next;
        }
        return count;
    }

    public static void main(String[] args) {
        
    }
}
