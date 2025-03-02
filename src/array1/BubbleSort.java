package array1;
import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args){
      int[] numbers = {-1,-2,-3,3,2,1};
      for(int i=0;i<numbers.length;i++){
          for(int j=0;j<numbers.length-1;j++){
              int temp;
              if(numbers[j]>numbers[j+1]){
                  temp = numbers[j];
                  numbers[j] = numbers[j+1];
                  numbers[j+1] = temp;
              }
          }
        }
        System.out.println("Number after sorted : " + Arrays.toString(numbers));
    }
}
