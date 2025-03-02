package operator;

public class UnaryOperators {
    public static void main(String[] args) {
        int a = 2;
        System.out.println(a++);
        System.out.println(a);
        System.out.println(a--);
        System.out.println(a);
        a++;
        System.out.println(a--);
        System.out.println(a);
        System.out.println("#".repeat(20));
        int b = 3;
        System.out.println(++b);
        ++b;
        System.out.println(b++);
        System.out.println(b);
    }
}
