package oop.inheritance;

class Parent{
    protected Integer id;
    protected String name;
    protected Integer age;
    public Parent(){}
    public Parent(Integer id, String name, Integer age){
        this.id = id;
        this.name = name;
        this.age = age;
    }
}
class Son extends Parent{
    public String creditCard;
}
public class Parents{
    public static void main(String[] args) {
        Parent son = new Son();
        son.id = 12;
        son.name = "Kim";
        son.age = 23;
        System.out.println(son.id);
        Son son1 = new Son();
        son1.creditCard = "001";
        System.out.println(son1.creditCard);
    }
}
