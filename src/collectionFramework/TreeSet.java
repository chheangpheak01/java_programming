package collectionFramework;
import java.util.List;
import java.util.Set;

public class TreeSet{
    public static void main(String[] args){
        Set<Integer> numbers = new java.util.TreeSet<>(
                List.of(1,2,3,4,5)
        );
        numbers.remove(2);
        System.out.println(numbers);
        numbers.removeIf(e->e.equals(5));
        System.out.println(numbers);
    }
}
