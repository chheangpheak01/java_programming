package method;

public class MethodCreation2 {
    public static void sumArray(int[] arrayName){
        int sum = 0;
        for(int getNumber : arrayName){
            sum+=getNumber;
        }
        System.out.println("Result : " + sum);
    }
    public static void main(String[] args){
        int[] arrayName = {1,2,3,4,5};
        sumArray(arrayName);
    }
}
