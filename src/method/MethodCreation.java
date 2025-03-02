package method;
import java.util.Scanner;

public class MethodCreation {
    public static void printMs(){
        System.out.println(" Welcome to java programming language...😊🚀");
    }
    public static void thumbnail(){
        System.out.println("*".repeat(45));
        printMs();
        System.out.println("*".repeat(45));
        System.out.print("Enter number 1 : ");
        int num1 = new Scanner(System.in).nextInt();
        System.out.print("Enter number 2 : ");
        int num2 = new Scanner(System.in).nextInt();
        System.out.print("Result : " + (num1+num2));
    }
    public static void main(String[] args) {
        thumbnail();
    }
}
