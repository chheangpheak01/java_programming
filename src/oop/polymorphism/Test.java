package oop.polymorphism;

// compile time polymorphism or overloading

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
        new Service().sum(2,3);
        new Service().sum(1.0,9.0);
    }
}
