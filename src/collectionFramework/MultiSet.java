package collectionFramework;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MultiSet{
    public static void main(String[] args){
        Set<String> OriginalName = new HashSet<>(
                List.of("Chheang Pheak","Visal","Kim tola")
        );
        Set<String> StoredName = new HashSet<>(
                List.of("Kim tola","Visal")
        );
        boolean test = OriginalName.containsAll(StoredName);
        System.out.println(test);
        System.out.println(StoredName);
        StoredName.addAll(OriginalName);
        System.out.println(StoredName);
        System.out.println(StoredName.size());
    }
}
