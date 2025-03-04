package method;

public class MthCr6 {
    public static void useVarargs(String name,int ...a){
        int sum = 0 ;
        for(int get : a){
            sum+=get;
        }
        System.out.println("Result : " + sum + " > " + name);
    }
    public static void main(String[] args){
        useVarargs("cambodian",1,2,3);
    }
}
