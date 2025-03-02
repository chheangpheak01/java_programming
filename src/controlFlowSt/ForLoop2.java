package controlFlowSt;

import java.util.Scanner;

public class ForLoop2 {
    public static void main(String[] args) {
        System.out.print("Enter Range of Numbers : ");
        int numbers = new Scanner(System.in).nextInt();
        int oddNumbers = 0;
        int eventNumbers = 0;
        for(int i = 1; i <= numbers; i++){
            if(i%2 == 0){
                eventNumbers++;
            }
            else{
                oddNumbers++;
            }
        }
        System.out.println("Odd : " + oddNumbers + " Event : " + eventNumbers);
    }
}
