package collectionFramework;
import java.util.ArrayList;

public class List{
    public static void main(String[] args) {
        ArrayList<Integer> integerArrayList = new ArrayList<>(java.util.List.of(1,2,3));
        System.out.println("Original elements : " + integerArrayList);
        integerArrayList.add(3,90);
        System.out.println("After added one new element of index 3 -> " + integerArrayList);
        System.out.println("*".repeat(15)+ " Using forEach loop " + "*".repeat(15));
        integerArrayList.forEach(e -> System.out.println("-> " + e));
        System.out.println("After get index 1 -> " + integerArrayList.get(1));
        System.out.println("After get first index  -> " + integerArrayList.getFirst());
        System.out.println("After get last index -> " + integerArrayList.getLast());
        integerArrayList.remove(2);
        System.out.println("After removed index 2 of element  : " + integerArrayList);
        integerArrayList.set(2,100);
        System.out.println("After updated of index 2 : " + integerArrayList);
        integerArrayList.removeFirst();
        integerArrayList.removeLast();
        System.out.println("After remove first and last elements : " + integerArrayList);
    }
}
