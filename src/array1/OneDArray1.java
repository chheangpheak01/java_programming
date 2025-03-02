package array1;
import java.util.Arrays;

public class OneDArray1 {
    public static void main(String[] args) {
        String[] emptyArray = new String[4];
        emptyArray[0] = "CAMBODIA";
        emptyArray[1] = "THAILAND";
        emptyArray[2] = "MYANMAR";
        emptyArray[3] = "LAOS";
        System.out.println(Arrays.toString(emptyArray));
        System.out.print("Length of Array : " + emptyArray.length);
        for(int i = 0;i<emptyArray.length;i++){
            System.out.print(" " + emptyArray[i] + " ");
        }
    }
}
