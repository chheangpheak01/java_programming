package array2;
import java.util.Arrays;

public class SplitString {
    public static void main(String[] args) {
        String code = "A-1:AU";
        System.out.println(code);
        String[] splitCode = code.split(":");
        System.out.println(Arrays.toString(splitCode));
    }
}
