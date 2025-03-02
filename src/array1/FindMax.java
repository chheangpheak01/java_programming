package array1;
import java.util.Scanner;

public class FindMax{
    public static void main(String[] args) {
        System.out.print("Enter the length of Array : ");
        int number = new Scanner(System.in).nextInt();
        Integer[] array = new Integer[number];
        for(int i=0;i<array.length;i++){
            System.out.print("Enter your array of index " +  i + " : ");
             array[i] = new Scanner(System.in).nextInt();
        }
        int max = array[0];
        for(Integer element : array){
            if(max<element){
                max = element;
            }
        }
        System.out.print("Max : " + max);
    }
}
