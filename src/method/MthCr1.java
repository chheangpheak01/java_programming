package method;

public class MthCr1 {
    public static void sum(int a, int b){
        System.out.println("Result : " + (a+b));
    }
    public static void findMax(int a, int b){
        if(a>b){
            System.out.println("Result of Maximum : " + a + " > " + b);
        }else{
            System.out.println("Result of Maximum : " + b + " > " + a);
        }
    }
    public static void main(String[] args) {
        sum(12,3);
        findMax(2,7);
    }
}
