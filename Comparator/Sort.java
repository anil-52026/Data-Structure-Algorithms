package Comparator;
import java.util.*;

public class Sort {
    public static void main(String[] args) {
        ArrayList<Emp> emps = new ArrayList<>();
        emps.add(new Emp("Anil","7903706863",12));
        emps.add(new Emp("Mohan","9934847339",11));
        emps.add(new Emp("Anurag","7050379962",45));
        System.out.println("Before Sorting:" + emps);
        Collections.sort(emps);
        System.out.println("After Sorting:" + emps);
    }
}
