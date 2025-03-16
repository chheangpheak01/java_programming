package oop.inheritance;

class Person{
    Integer id;
    String email,name;
}
class Student extends Person{
}
class  Teacher extends Person{
    Character gender;
}
public class DisplayInfo{
    public static void main(String[] args){
        Student stu1 = new Student();
        stu1.id = 1;
        stu1.email = "sopheak01@gmail.com";
        stu1.name = "Kari";
        Teacher teacher1 = new Teacher();
        teacher1.gender = 'M';
        System.out.println(stu1.email);
        System.out.println(teacher1.gender);
    }
}
