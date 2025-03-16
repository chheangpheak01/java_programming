package oop.encapsulation;

class Food{
    private String name;
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
}
public class Test{
    public static void main(String[] args) {
        Food food1 = new Food();
        food1.setName("Mango");
        System.out.println(food1.getName());
    }
}