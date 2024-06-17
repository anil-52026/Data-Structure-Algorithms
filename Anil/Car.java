package Anil;

public class Car {
    public int add(int a, int b, int c){
        return a+b+c;
    }
    public double add(int a, int b){
        return a+b;
    }

    public static void main(String[] args) {
        Car ob = new Car();
        System.out.println(ob.add(3,4));
       // System.out.println(ob.add(3,4));
    }
}
