package collectionFramework;
import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class Map{
    public static void main(String[] args) {
        java.util.Map<Integer,String> fNames = new HashMap<>();
        fNames.put(1,"Apple");
        //fNames.put(1,"Kari");
        fNames.put(2,"Pineapple");
        fNames.put(3,"Mango");
        fNames.put(null,null);
        Set<Integer> keys = fNames.keySet();
        System.out.println("All keys : " + keys);
        Collection<String> values = (fNames.values());
        System.out.println("ALl fruit names : " + values );
        System.out.println(fNames);
        for(java.util.Map.Entry<Integer,String> obj: fNames.entrySet()){
            System.out.println("Key : " + obj.getKey());
            System.out.println("Value : " + obj.getValue());
        }
        System.out.println("*".repeat(23));
        fNames.remove(4,null);
        for(java.util.Map.Entry<Integer,String> obj: fNames.entrySet()){
            System.out.println("Key : " + obj.getKey());
            System.out.println("Value : " + obj.getValue());
        }
    }
}
