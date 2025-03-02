package operator;
import java.util.Scanner;

public class RelationalOperators {
    public static void main(String[] args) {
        System.out.print("Enter Number1 : ");
        int num1 = new Scanner(System.in).nextInt();
        System.out.print("Enter Number2 : ");
        int num2 = new Scanner(System.in).nextInt();
        System.out.println((num1) + "  > " + (num2)  + " = " + (num1>num2));
        System.out.println((num1) + " < " +  (num2)  + " = " + (num1<num2));
        System.out.println((num1) + " <= " + (num2)  + " = " + (num1<=num2));
        System.out.println((num1) + " >= " + (num2)  + " = " + (num1>=num2));
        System.out.println((num1) + " != " + (num2)  + " = " + (num1!=num2));
        System.out.println((num1) + " == " + (num2)  + " = " + (num1==num2));
    }
}
