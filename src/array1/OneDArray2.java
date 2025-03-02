package array1;
import java.util.Scanner;

public class OneDArray2 {
    public static void main(String[] args) {
        System.out.print("Enter the Number length : ");
        int number = new Scanner(System.in).nextInt();
        String[] name = new String[number];
        for(int i=0;i<number;i++){
            System.out.print("Enter your name of index : " + i + " : ");
            name[i] = new Scanner(System.in).nextLine();
        }
        for(String getName : name){
            System.out.println(getName);
        }
    }
}
