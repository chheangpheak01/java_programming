package array1;
import java.util.*;

public class SortArray{
    public static void main(String[] args){
        int[] numbers = {-1,-2,-3,3,2,1};
        System.out.println("Before sorted : " + Arrays.toString(numbers));
        Arrays.sort(numbers);
        System.out.println("After sorted : " + Arrays.toString(numbers));
        List<Integer> integerList = new ArrayList<>();
        Arrays.stream(numbers).forEach(
                e -> {
                    integerList.add(e);
                }
        );
        System.out.println("Before Reversing : " + integerList);
        Collections.reverse(integerList);
        System.out.println("After Reversing : " + integerList);
    }
}
