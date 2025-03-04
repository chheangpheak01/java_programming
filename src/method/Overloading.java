package method;

public class Overloading {
    private static int sum(int a, int b){
        return a+b;
    }
    private static double sum(double a, double b){
        return a+b;
    }
    private static float sum(float a, float b){
        return a+b;
    }
    public static void main(String[] args){
        System.out.println(sum(1,2));
        System.out.println(sum(2.3,4.6));
        System.out.println(sum(1.2f,1.3f));
    }
}
