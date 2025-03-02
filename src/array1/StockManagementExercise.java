package array1;
import java.time.Instant;
import java.util.Date;
import java.util.Scanner;

public class StockManagementExercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=".repeat(30));
        System.out.println("💰 Welcome to Stock Management 💰");
        System.out.println("=".repeat(30));
        String[] productName = new String[30];
        while (true) {
            System.out.println("""
                    1. List all products
                    2. Create new product
                    3. Update Product
                    4. Delete Product
                    5. Exit
                    """);
            System.out.println("-".repeat(30));
            System.out.print("Insert option: ");
            int option;
            try {
                option = Integer.parseInt(scanner.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("❌ Invalid option! Please enter a number between 1 and 5.");
                continue;
            }
            switch (option) {
                case 1 -> {
                    System.out.println("📋 List of all products:");
                    boolean hasProducts = false;
                    for (String p : productName) {
                        if (p != null) {
                            System.out.println("🔹 " + p);
                            hasProducts = true;
                        }
                    }
                    if (!hasProducts) {
                        System.out.println("🚫 No products available.");
                    }
                }
                case 2 -> {
                    System.out.println("🆕 Create new product");
                    System.out.print("👉 Insert new product name: ");
                    String newProduct = scanner.nextLine();
                    boolean added = false;
                    for(int i = 0; i < productName.length; i++) {
                        if (productName[i] == null) {
                            productName[i] = newProduct;
                            added = true;
                            break;
                        }
                    }
                    if(added){
                        System.out.println("✅ Product added successfully!");
                        System.out.println("🗓️ Created at " + Date.from(Instant.now()));
                    } else {
                        System.out.println("❌ Unable to add more products.");
                    }
                }
                case 3 -> {
                    System.out.println("✏️ Update Product");
                    System.out.println("👉 Current products: ");
                    boolean hasProducts = false;
                    for (String p : productName) {
                        if (p != null) {
                            System.out.println("🔹 " + p);
                            hasProducts = true;
                        }
                    }
                    if (!hasProducts) {
                        System.out.println("🚫 No products available to update.");
                        break;
                    }
                    System.out.print("👉 Enter the product name to update: ");
                    String oldProduct = scanner.nextLine();
                    boolean found = false;
                    for (int i = 0; i < productName.length; i++) {
                        if (productName[i] != null && productName[i].equals(oldProduct)) {
                            System.out.print("✏️ Enter new product name: ");
                            productName[i] = scanner.nextLine();
                            found = true;
                            System.out.println("✅ Product updated successfully!");
                            break;
                        }
                    }
                    if(!found) {
                        System.out.println("❌ Product not found.");
                    }
                }
                case 4 -> {
                    System.out.println("🗑️ Delete Product");
                    System.out.println("👉 Current products: ");
                    boolean hasProducts = false;
                    for (String p : productName) {
                        if (p != null) {
                            System.out.println("🔹 " + p);
                            hasProducts = true;
                        }
                    }
                    if (!hasProducts) {
                        System.out.println("🚫 No products available to delete.");
                        break;
                    }
                    System.out.print("🗑️ Enter product name to delete: ");
                    String deleteProduct = scanner.nextLine();
                    boolean deleted = false;
                    for (int i = 0; i < productName.length; i++) {
                        if (productName[i] != null && productName[i].equals(deleteProduct)) {
                            productName[i] = null;
                            deleted = true;
                            System.out.println("✅ Product deleted successfully!");
                            break;
                        }
                    }
                    if (!deleted) {
                        System.out.println("❌ Product not found.");
                    }
                }
                case 5 -> {
                    System.out.println("👋 Thank you for using Stock Management!");
                    scanner.close();
                    System.exit(0);
                }
                default -> System.out.println("❌ Invalid option! Please select from 1 to 5.");
            }
        }
    }
}
