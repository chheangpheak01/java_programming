package controlFlowSt;
import java.util.Scanner;

public class SwitchCase1 {
    /**
     * ======== Welcome to my Mart ============
     * 1. List all Products
     * 2. Add new Products
     * 3. Search Products by code
     * 4. Delete Product
     * =======================================
     * [+] Insert any option:
     */
    public static void main(String[] args) {
        System.out.print("""
                ========= Welcome to my Mart =========
                1. List all Products
                2. Add new Product
                3. Search Products
                4. Delete Product
                """);
        while (true){
            System.out.print("[+] Insert any option: ");
            int a = new Scanner(System.in).nextInt();
            switch (a){
                case 1-> System.out.println("List all products");
                case 2-> System.out.println("Add new Product");
                case 3-> System.out.println("Search Products");
                case 4-> System.out.println("Delete Products");
                default -> System.exit(0);
            }
            System.out.println("Press any key to continue..");
            new Scanner(System.in).nextLine();
        }
    }
}
