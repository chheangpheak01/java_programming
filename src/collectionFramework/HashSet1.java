package collectionFramework;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class HashSet1{
    private static Set<String> getAllProductName(){
        return new HashSet<>(
                List.of("Banana","Apple"));
    }
    private static Set<String> getAllProductName1(String pName){
        Set<String> pNames = new HashSet<>(
                List.of("drinks","Beverage")
        );
        pNames.add(pName);
        return pNames;
    }
    public static void main(String[] args){
        System.out.println(getAllProductName());
        System.out.print("Enter any product name : ");
        String newProName = new Scanner(System.in).nextLine();
        System.out.println(getAllProductName1(newProName));
    }
}
