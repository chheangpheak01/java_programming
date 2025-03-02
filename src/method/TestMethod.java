package method;
import java.util.Arrays;

public class TestMethod {
    public static int sum(int a,int b){
        return a+b;
    }
    public static int sum(int... numbers){
        int sum = 0;
        for(int get : numbers){
            sum+=get;
        }
        return sum;
    }
    private static String[] splitWord(String data,String delimiter){
        return data.split(delimiter);
    }
    public static void main(String[] args) {
        int resultOfSum = sum(1,2);
        int resultOfSum1 = sum(1,2,3,4,5);
        System.out.println("Result 1 : " + resultOfSum);
        System.out.println("Result 2 : " + resultOfSum1);
        String[] afterSplit = splitWord("Hello,Word",",");
        System.out.println("Result of split : " + Arrays.toString(afterSplit));
        System.out.println(afterSplit[0]);
        System.out.println(afterSplit[1]);
    }
}
