package collectionFramework;
import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class Map{
    public static void main(String[] args) {
        java.util.Map<Integer,String> ProName = new HashMap<>();
        ProName.put(1,"Pineapple");
        ProName.put(2,"Apple");
        ProName.put(3,"Banana");
        ProName.put(null,null);
        ProName.remove(null);
        ProName.remove(1,"Pineapple");
        System.out.println(ProName);
        String getElementByUsingKey = ProName.get(2);
        System.out.println("result -> " + getElementByUsingKey);
        Set<Integer> key = ProName.keySet();
        System.out.println("All keys : " + key);
        Collection<String> value = ProName.values();
        System.out.println("All value : " + value);
        System.out.println("*".repeat(30));
        for(java.util.Map.Entry<Integer,String> object:ProName.entrySet()){
            System.out.println("Key -> " + object.getKey());
            System.out.println("Value -> " + object.getValue());
        }
    }
}
