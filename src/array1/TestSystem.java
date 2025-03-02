package array1;
import java.time.Instant;
import java.util.Date;
import java.util.Scanner;

public class TestSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] product = new  String[100];
        System.out.println("""
                    1. List all products
                    2. Create new product
                    3. Update Product
                    4. Delete Product
                    5. Exit
                    """);
        while(true){
            System.out.print("Enter any option : ");
            int number; // = scanner.nextInt();
            try {
                number = Integer.parseInt(scanner.nextLine().trim());
            }catch (NumberFormatException e){
                System.out.println("Invalid number please, Try again...🥲");
                continue;
            }
            //scanner.nextLine();
            switch(number){
                case 1 -> {
                    System.out.println("*".repeat(10) + " List All Products " + "*".repeat(10));
                    boolean hasPro = false;
                    for(String getPro : product){
                        if(getPro != null){
                            System.out.println("🥷🏾" + getPro);
                            hasPro = true;
                        }
                    }
                    if(!hasPro){
                        System.out.println("No products available to display...🥲");
                    }
                }
                case 2 -> {
                    System.out.println("*".repeat(10) + " Create New Product " + "*".repeat(10));
                    System.out.print("Enter your new product : ");
                    String createPro = scanner.nextLine();
                    boolean cPro = false;
                    for(int i=0;i<product.length;i++){
                        if(product[i] == null){
                            product[i] = createPro;
                            cPro = true;
                            break;
                        }
                    }
                    if(cPro){
                        System.out.println("Product added successfully...😊");
                        System.out.println("Created : " + Date.from(Instant.now()));
                    }else{
                        System.out.println("Unable to add more products...🥲");
                    }
                }
                case 3 -> {
                    System.out.println("*".repeat(10) + " Update Your Product " + "*".repeat(10));
                    System.out.println("*".repeat(5) + " List All Current Products " + "*".repeat(5));
                    boolean hPro = false;
                    for(String getPro : product){
                        if(getPro != null){
                            System.out.println("🥷🏾" + getPro);
                            hPro = true;
                        }
                    }
                    if(!hPro){
                        System.out.println("No products available..🥲");
                    }
                    System.out.print("Enter your old product' name to update : ");
                    String oldPro = scanner.nextLine();
                    boolean oPro = false;
                    for(int i=0;i<product.length;i++){
                        if(product[i] != null && product[i].equals(oldPro)){
                            System.out.print("Enter your new product's name to update : ");
                            product[i] = scanner.nextLine();
                            System.out.println("Product updated successfully...😊");
                            oPro = true;
                            break;
                        }
                    }
                    if(!oPro){
                        System.out.println("Product not found...🥲");
                    }
                }
                case 4 -> {
                    System.out.println("*".repeat(10) + " Delete Your Product " + "*".repeat(10));
                    System.out.println("*".repeat(5) + " List All Current Products " + "*".repeat(5));
                    boolean hPro = false;
                    for(String getPro : product){
                        if(getPro != null){
                            System.out.println("🥷🏾" + getPro);
                            hPro = true;
                        }
                    }
                    if(!hPro){
                        System.out.println("No products available..🥲");
                    }
                    System.out.print("Enter product's name to delete : ");
                    String delPro = scanner.nextLine();
                    boolean dPro = false;
                    for(int i=0;i<product.length;i++){
                        if(product[i] != null && product[i].equals(delPro)){
                            product[i] = null;
                            System.out.println("Product deleted successfully..😊");
                            dPro = true;
                            break;
                        }
                    }
                    if(!dPro){
                        System.out.println("Product not found...🥲");
                    }
                }
                case 5 -> {
                    System.out.println("You choose to exit...🥲");
                    scanner.close();
                    System.exit(0);
                }
                default -> System.out.println("Please enter number from 1 to 5 only...😒");
            }
        }
    }
}
