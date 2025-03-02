package controlFlowSt;
import java.util.Scanner;

public class WhileLoop1 {
    public static void main(String[] args) throws InterruptedException {
        for(int i=0;i<=10;i++){
            System.out.print("*".repeat(i));
            Thread.sleep(500);
        };
        System.out.println();
        for(int i=0;i<6;i++){
            System.out.print("#".repeat(i));
            Thread.sleep(500);
        };
        System.out.print(" YOU ARE WELCOME ");
        for(int i=0;i<6;i++){
            System.out.print("#".repeat(i));
            Thread.sleep(500);
        };
        System.out.println();
        for(int i=0;i<=10;i++){
            System.out.print("*".repeat(i));
            Thread.sleep(500);
        };
        System.out.println();
        while (true) {
            System.out.print("Enter any Option : ");
            int number = new Scanner(System.in).nextInt();
            switch (number){
                case 1->
                    System.out.println("You enter the right answer...");
                case 5 -> {
                    System.out.println("You choose to exit...");
                    System.exit(0);
                }
            }
            System.out.println("Press any key to continue...");
            new Scanner(System.in).nextLine();
        }
    }
}
