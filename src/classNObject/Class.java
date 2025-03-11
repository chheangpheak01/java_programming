package classNObject;

class ClassCreated{
    private int sum;
    public int sum(int ...numbers){
        for(int number : numbers){
            sum += number;
        }
        return sum;
    }
}
public class Class{
    public static void main(String[] args) {
        ClassCreated math = new ClassCreated();
        int resultNum = math.sum(1,2,3,4,5);
        System.out.println("Result of sum -> " + resultNum);
    }
}
