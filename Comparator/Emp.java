package Comparator;
import java.util.*;


    // Comparable : It is a interface and it is used when we need to sort the data according to Single logic.
    public class Emp implements Comparable<Emp>{
        private String name;
        private String phone;
        private int empId;
        public Emp(String name, String phone, int empId){
            this.name = name;
            this.phone = phone;
            this.empId = empId;
        }

        @Override
        public int compareTo(Emp o) {
            return this.empId - o.empId;  // sort in Ascending order
        }

        public String getName(){
            return name;
        }
        public String getPhone(){
            return phone;
        }
        public int getEmpId(){
            return empId;
        }

        @Override
        public String toString() {
            return "Emp{" +
                    "name='" + name + '\'' +
                    ", phone='" + phone + '\'' +
                    ", empId=" + empId +
                    '}';
        }
    }

