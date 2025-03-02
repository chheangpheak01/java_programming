package introduction;
import java.util.Random;
import java.util.Scanner;
import java.util.UUID;

public class InputOutput1{

    public static void main(String[] args){
        int id = new Random().nextInt(999);
        String uuid = UUID.randomUUID().toString();
        System.out.print("[+] Insert Product name: ");
        String productName = new Scanner(System.in).nextLine();
        System.out.print("[+] Insert Product price: ");
        float productPrice = new Scanner(System.in).nextFloat();
        System.out.print("[+] Insert Product Quantity: ");
        int qty = new Scanner(System.in).nextInt();
        System.out.println("=".repeat(50));
        System.out.println("Product name: " + productName);
        System.out.println("Product ID: " + id);
        System.out.println("Product uuid: " + uuid);
        System.out.println("Product price: " + productPrice);
        System.out.println("Product Quantity: " + qty);
    }
}

