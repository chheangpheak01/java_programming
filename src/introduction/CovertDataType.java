package introduction;

public class CovertDataType {
    public static void main(String[] args) {
        // promotion
        int avg = 2;
        double newAgv = avg;
        System.out.println(avg + " : " + newAgv);
        // casting
        double price = 55.5;
        int newPrice = (int) price;
        System.out.println(price + " : " + newPrice);
        // auto-boxing
        int primitive = 100;
        Integer newWrapper = primitive;
        System.out.println(primitive + " : " + newWrapper);
        // unboxing
        Double doubleOfWrapper = 45.5;
        double primitiveDouble = doubleOfWrapper;
        System.out.println(doubleOfWrapper + " : " + primitiveDouble);
    }
}
