package oop.inheritance;

class MyParent{
    protected String name;
    protected Integer age;
    //
    public MyParent(){}
    public MyParent(String name){
        this.name = name;
    }
    public void run(){
        System.out.println(name + " is running");
    }
}
class MySon extends MyParent{
    public MySon(String name){
        super(name);
        super.age = 23;
    }
}
public class SuperUsing{
    public static void main(String[] args) {
        MyParent son = new MySon("Jam");
        son.run();
        System.out.println(son.age);
    }
}
