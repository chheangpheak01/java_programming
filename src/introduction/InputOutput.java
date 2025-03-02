package introduction;
import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) {
        System.out.print("[+] Insert your Name : ");
        String name = new Scanner(System.in).next();
        System.out.print("[+] Insert your Age : ");
        int age = new Scanner(System.in).nextInt();
        System.out.println("=".repeat(20));
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
    }
}
