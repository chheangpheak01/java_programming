package oop.polymorphism;

class Animal{
    public void dog(){
        System.out.println("Dog is baking over there");
    }
}
class Cat extends Animal{
    @Override
    public void dog(){
        System.out.println("Dog is running now");
    }
}
public class Run_Time_Overloading{
    public static void main(String[] args) {
        Cat result = new Cat();
        result.dog();
    }
}
