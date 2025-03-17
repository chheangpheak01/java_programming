package oop.polymorphism;

class Service{
    public int sum(int a, int b){
        return a+b;
    }
    public double sum(double a, double b){
        return a+b;
    }
}
public class Test{
    public static void main(String[] args) {
        System.out.println(new Service().sum(1,2));
        System.out.println(new Service().sum(2,3));
    }
}
