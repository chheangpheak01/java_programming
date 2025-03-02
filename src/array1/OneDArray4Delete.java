package array1;
import java.util.Arrays;
import java.util.Scanner;

public class OneDArray4Delete {
    public static void main(String[] args) {
        Integer[] numbers = {1,2,3,4,5};
        System.out.println(Arrays.toString(numbers));
        System.out.print("Enter any numbers to delete : ");
        int number = new Scanner(System.in).nextInt();
        for(int i=0;i<numbers.length;i++){
            if(numbers[i] == number){
                numbers[i] = null;
            }
        }
        for(Integer num : numbers){
            if(num!=null){
                System.out.print(" " + num);
            }
        }
    }
}
