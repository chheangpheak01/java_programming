package collectionFramework;
import java.util.ArrayList;
import java.util.Scanner;

public class List1{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> productName = new ArrayList<>();
        System.out.print("Enter the amount of products : ");
        int numberOfProduct = scanner.nextInt();
        scanner.nextLine();
        for(int i = 0; i<numberOfProduct;i++){
            System.out.print("+ Insert the product's name of rank : " + (i+1) + " : ");
            String getProName = scanner.nextLine();
            productName.add(getProName);
        }
        System.out.println("*".repeat(15) + " Display all product's name " + "*".repeat(15));
        productName.forEach(e -> System.out.println("-> " + e));
        System.out.print("+ Insert any product's name to delete : ");
        String deletedName = scanner.nextLine();
        int getIndex = productName.indexOf(deletedName);
        if(getIndex>=0){
            productName.remove(getIndex);
            System.out.println("The name of product " + deletedName + " has been deleted successfully");
            System.out.println("*".repeat(15) + " Display all product's name after deleted some product's names " + "*".repeat(15));
            productName.forEach(System.out::println);
        }else{
            System.out.println("The name of product [" + deletedName + "] is not found");
        }
        System.out.print("+ Insert any product's name to update : ");
        String oldName = scanner.nextLine();
        int getOldIndexN = productName.indexOf(oldName);
        if(getOldIndexN>=0){
            System.out.print("+ Insert new name to update : ");
            String newName = scanner.nextLine();
            productName.set(getOldIndexN,newName);
            System.out.println("The name of product " + newName + " has been updated successfully");
            System.out.println("*".repeat(15) + " Display all product's name after updated some product's names " + "*".repeat(15));
            productName.forEach(System.out::println);
        }else{
            System.out.println("The name of product [" + oldName + "] is not found");
        }

    }
}
