package controlFlowSt;
import java.util.Scanner;

public class ForLoop1 {
    public static void main(String[] args) {
        System.out.print("Enter your Name : ");
        String name = new Scanner(System.in).nextLine();
        if(name.equalsIgnoreCase("sok")){
            System.out.println(name + "has been allowed");
        }
    }
}
