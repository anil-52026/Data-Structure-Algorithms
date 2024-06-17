package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

    public class BasicOfArrayList {
        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            // Syntax of ArrayList
            // ArrayList<Integer>list = new ArrayList<>();

            // code
            ArrayList<Integer> list = new ArrayList<>(10);   // Arraylist me range 0 to list.size()-1
            list.add(67);
            list.add(234);
            list.add(654);
            list.add(43);
            list.add(654);
            list.add(8765);
            list.add(0,56);
            // list.add(2,50); // at index 2 , i am inserting 50 in a Arraylist remaining all shift one position
            // System.out.println(list.size()); // It gives size of the Arraylist
            System.out.println(list.contains(654)); // It gives true or false
            System.out.println(list);
            //Collections.sort(list);
           // System.out.println(list);
            Collections.sort(list,Collections.reverseOrder());
            System.out.println(list);

        /*
          The set() method of java.util.ArrayList class
          It is used to replace the element at the specified position in this list with the specified element.

            Syntax:

           public E set(int index, E element)
         */
            list.set(0,99);
            System.out.println(list);

            // It removes the element at the specified position
            list.remove(2);
            System.out.println(list);

            //Input
            for (int i=0; i<5; i++){
                list.add(s.nextInt());
            }

            // get item at any index
            for (int i=0; i<5; i++){
                System.out.println(list.get(i));  // instead of list[i], use get function
            }



        }
}
