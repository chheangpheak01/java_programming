package array1;
import java.util.Arrays;
import java.util.Scanner;

public class OneDArray3Update {
    public static void main(String[] args) {
        System.out.print("Enter the length of array : ");
        int number = new Scanner(System.in).nextInt();
        String[] name = new String[number];
        for(int i=0;i<number;i++){
            System.out.print("Enter your name of index " + i + " : ");
            name[i] = new Scanner(System.in).nextLine();
        }
        System.out.println(Arrays.toString(name));
        System.out.print("Enter your old name to update : ");
        String oldName = new Scanner(System.in).nextLine();
        for(int j=0;j<number;j++){
            if(name[j].equals(oldName)){
                System.out.print("Enter your new name to update : ");
                String newName = new Scanner(System.in).nextLine();
                name[j] = newName;
            }
        }
        System.out.println("Here is the result");
        for(String getName : name){
            System.out.println(getName);
        }
    }
}
