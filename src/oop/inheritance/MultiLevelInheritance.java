package oop.inheritance;
class A{
    protected Integer id;
}
class B extends A{}
class C extends B{}
public class MultiLevelInheritance{
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
        a.id = 1;
        b.id = 2;
        c.id = 3;
        System.out.println(a.id);
        System.out.println(b.id);
        System.out.println(c.id);
    }
}
