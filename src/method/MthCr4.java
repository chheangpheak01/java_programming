package method;

public class MthCr4 {
    public static void useVararg(int ...a){
        int sum = 0;
        for(int getNumber : a){
            sum += getNumber;
        }
        System.out.println("Result : " + sum);
    }
    public static void main(String[] args){
        useVararg(1,2,3,4,5);
    }
}
