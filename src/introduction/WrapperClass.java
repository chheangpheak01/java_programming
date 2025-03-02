package introduction;

public class WrapperClass {

    public static void main(String[] args) {

        Short age = 12;
        Character gender = 'F';
        Double price = 3.9;
        Float ff = 1.24f;
        Byte _byte = 2;

        Double result = age.doubleValue();
        System.out.println(result);
        float new_byte = _byte.floatValue();
        System.out.println(new_byte);

    }
}
