package collectionFramework;
import java.util.List;
import java.util.Set;

public class HashSet{
    public static void main(String[] args){
        Set<String> stringSet = new java.util.HashSet<>(List.of("coffee"));
        stringSet.add("Chheang Pheak");
        stringSet.add("Kim tola");
        stringSet.add("Chem Visal");
        stringSet.remove("Chem Visal");
        System.out.println(stringSet);
        boolean tes = stringSet.isEmpty();
        System.out.println(tes);
        boolean tes1 = stringSet.contains("Chheang Pheak");
        System.out.println(tes1);
        stringSet.clear();
        System.out.println(stringSet);
    }
}
