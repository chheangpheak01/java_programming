package controlFlowSt;
import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {
        System.out.print("Enter Number : ");
        int num = new Scanner(System.in).nextInt();
        for (int i = 0; i < num; i++){
            try {
                Thread.sleep(500);
                System.out.println("Welcome to Java " + (i+1));
            }catch (Exception ignore){

            }
        }
    }
}
