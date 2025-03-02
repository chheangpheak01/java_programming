package controlFlowSt;
import java.util.ArrayList;
import java.util.Scanner;

public class SwitchCase2 {
    public static void main(String[] args) {
        ArrayList<String> products = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("""
                ========= Welcome to my Mart =========
                1. List all Products
                2. Add new Product
                3. Search Products
                4. Delete Product
                ========= Welcome to my Mart =========
                """);
        while (true) {
            System.out.print("Enter any Option : ");
            int number = scanner.nextInt();
            scanner.nextLine(); //Consume newline
            switch (number) {
                case 1:
                    System.out.println("*".repeat(10) + " List All Products " + "*".repeat(10));
                    for(String pResult : products){
                        System.out.println(pResult);
                    }
                    break;
                case 2: {
                    System.out.println("Add Your New Product : ");
                    while (true) {
                        String product = scanner.nextLine();
                        products.add(product);
                        if (product.equals("")) {
                            System.out.println("You choose to exit...");
                            break;
                        }
                    }
                    break;
                }
                case 3: {
                    System.out.println("Search Your Product : ");
                    String sProduct = scanner.nextLine();
                    if(products.contains(sProduct)){
                        System.out.println("Here is the Result : " + sProduct);
                    }else {
                        System.out.println(sProduct + " not found ");
                    }
                    break;
                }
                case 4: {
                    System.out.println("Enter Product's name to delete : ");
                    String dProduct = scanner.nextLine();
                    if(products.remove(dProduct)){
                        System.out.println(dProduct + " is deleted...");
                    }else{
                        System.out.println(dProduct + " not found");
                    }
                    break;
                }
                default:{
                    System.out.println("Invalid Number, Please Try it again...");
                }
            }
        }
    }
}
