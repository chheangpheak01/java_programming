package operator;
import java.util.Scanner;

public class LogicalOperators {
    public static void main(String[] args) {
        // Logical Operator
        System.out.print("[+] Insert a : ");
        int a = new Scanner(System.in).nextInt();
        System.out.print("[+] Insert b : ");
        int b = new Scanner(System.in).nextInt();
        System.out.println("Using AND Operator: " + ((a>b) && (a<b)));
        System.out.println("Using OR Operator: " + ((a>b) || (a<b)));
    }
}
