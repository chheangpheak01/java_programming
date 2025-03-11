package classNObject.model;
import java.time.Instant;
import java.util.*;

public class Class1{
    public static void main(String[] args){
        System.out.println("*".repeat(30) + " Result of Student " + "*".repeat(30));
        Student stu1 = new Student();
        stu1.setStuInfo(1,"sal","sal01@gmail.com");
        stu1.getStuInfo();
        Student stu2 = new Student();
        stu2.setStuInfo( 2,"Kim","kim09@gamil.com");
        stu2.getStuInfo();
        System.out.println("*".repeat(30) + " Result of Products " + "*".repeat(30));
        Product product1 = new Product();
        product1.setProduct(3,"coca","code_09",2.3,2);
        product1.getProduct();
        System.out.println("*".repeat(30) + " Result of Book " + "*".repeat(30));
        Book book = new Book();
        book.setBookInfo(1, UUID.randomUUID().toString(), "Tom and Jerry","This  is cartoon book", Date.from(Instant.now()), new TreeSet<>(List.of("Jame","Jonh")));
        //book.getBookInfo();
        System.out.println(book);
        System.out.println("*".repeat(30) + " Result of Employee " + "*".repeat(30));
        Employee employee1 = new Employee();
        employee1.setEmployee(4,UUID.randomUUID().toString(),"Kari","President",900.3);
        System.out.println(employee1);
        Employee employee2 = new Employee();
        employee2.setEmployee(5,UUID.randomUUID().toString(),"Sal","Boss",200.0);
        List<Employee> employees = new ArrayList<>();
        employees.add(employee1);
        employees.add(employee2);
        for(Employee em : employees){
            System.out.println(em);
        }
    }
}
