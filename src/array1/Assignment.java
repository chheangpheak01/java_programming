package array1;
import java.time.Instant;
import java.util.Date;
import java.util.Scanner;

public class Assignment {
    public static void main(String[] args) {
        System.out.println("""
                1. List all Product
                2. Create new Product
                3. Update Product
                4. Delete
                5. Exit
                ----------------------------------
                """);
        String[] proudcts = new String[100];
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.print("Enter any Option : ");
            int opt = scanner.nextInt();
            scanner.nextLine();
            switch (opt){
                case 1 -> {
                    System.out.println("#".repeat(10) + " List All Products " + "#".repeat(10));
                    for(String gProduct : proudcts){
                        if(gProduct!=null){
                            System.out.println(gProduct);
                        }
                    }
                }
                case 2 -> {
                    System.out.print("Create your new product : ");
                    String nProduct = scanner.nextLine();
                    for(int i=0;i<proudcts.length;i++){
                        if(proudcts[i]==null){
                            proudcts[i] = nProduct;
                            break;
                        }
                    }
                    System.out.println("You have created your product successfully... " + Date.from(Instant.now()));
                }
                case 3 -> {
                    System.out.print("Find your old product's name to update : ");
                    String oProduct = scanner.nextLine();
                        for(int i=0;i<proudcts.length;i++){
                        if(proudcts[i]!=null && proudcts[i].equals(oProduct)){
                            System.out.print("Insert your new product's name to update : ");
                            String nProduct = scanner.nextLine();
                            proudcts[i]=nProduct;
                        }
                    }
                }
                case 4 ->{
                    System.out.print("Enter your old product's name to delete : ");
                    String dProduct = scanner.nextLine();
                    for(int i=0;i<proudcts.length;i++){
                        if(proudcts[i]!=null && proudcts[i].equals(dProduct)){
                            proudcts[i] = null;
                        }
                    }
                }
                case 5 -> {
                    System.out.println("You have chosen to exit...");
                    System.exit(0);
                }
                default -> {
                    System.out.println("Invalid option! Please enter a number between 1 and 5");
                }
            }
        }
    }
}
