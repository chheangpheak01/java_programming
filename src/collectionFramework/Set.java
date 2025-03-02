package collectionFramework;
import java.util.Locale;
import java.util.TreeSet;

public class Set{
    public static void main(String[] args){
        java.util.Set<String> names = new TreeSet<>();
        names.add("Kim");
        names.add("Putin".toLowerCase(Locale.ROOT));
        names.add("Biden");
        names.add("Kari");
        //names.add("Biden");
        System.out.println("*".repeat(15)+" Display all user's names " + "*".repeat(15));
        for(String name : names){
            System.out.println("-> " + name);
            if(name.equals("PUTIN".toLowerCase())){
                System.out.println(name + " existed");
            }
        }
    }
}
