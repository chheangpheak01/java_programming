package oop.polymorphism;
class ParentService{
    public int sum(int a,int b){
        System.out.println("This is sum in parent class");
        return a+b;
    }
}
class ChildService extends ParentService{
    @Override
    public int sum(int a, int b){
        System.out.println("This is sum in child class");
        System.out.println("This is the result " + (a+b));
        return a+b;
    }
}
public class Test1{
    public static void main(String[] args){
        ChildService child1 = new ChildService();

    }
}
