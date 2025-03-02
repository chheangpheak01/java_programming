package controlFlowSt;
import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        System.out.print("Enter Your Option : ");
        int op = new Scanner(System.in).nextInt();
        switch (op){
            case 1 : {
                System.out.println("This is option 1");
                break;
            }
            case  2 : {
                System.out.println("This is option 2");
                break;
            }
            case 3 : {
                System.out.println("This is option 3");
                break;
            }
            default:{
                System.out.println("No option, please Try again...");
            }
        }
    }
}
