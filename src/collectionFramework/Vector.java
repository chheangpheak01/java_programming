package collectionFramework;
import java.util.List;

public class Vector {
    public static void main(String[] args){
        java.util.Vector<Integer> vector = new java.util.Vector<>(List.of(1,2,3,4,5));
        vector.remove(1);
        vector.removeLast();
        vector.removeFirst();
        vector.set(1,200);
        vector.getFirst();
        vector.getLast();
        vector.forEach(e-> System.out.println("-> " + e));
    }
}
