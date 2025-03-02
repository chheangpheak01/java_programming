package array2;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class assignment {
    static String[][] tables;
    static List<String> bookingHistory = new ArrayList<>();
    public static void setupTable(){
        System.out.println("*".repeat(23) + " Welcome to table set up section " + "*".repeat(23));
        System.out.print("Enter your row number : ");
        int rowNumber = new Scanner(System.in).nextInt();
        System.out.print("Enter your column number : ");
        int columnNumber = new Scanner(System.in).nextInt();
        tables = new String[rowNumber][columnNumber];
        char character = 'A';
        int codeNumber = 1;
        for(int i=0;i<tables.length;i++){
            for(int j=0;j<tables[i].length;j++){
                tables[i][j] = character + "-" + codeNumber + ":AV";
                codeNumber++;
            }
            character++;
        }
        for(int i=0;i<tables.length;i++){
            for(int j=0;j<tables[i].length;j++){
                if(j==0){
                    System.out.print("|");
                }
                System.out.print(tables[i][j] + " |");
            }
            System.out.println();
        }
    }
    public static void startBooking(){
        System.out.println("*".repeat(23) + " Welcome to table start booking section " + "*".repeat(23));
       while(true){
           for(int i=0;i<tables.length;i++){
               for(int j=0;j<tables[i].length;j++){
                   if(j==0){
                       System.out.print("|");
                   }
                   System.out.print(tables[i][j] + " |");
               }
               System.out.println();
           }
           System.out.print("Enter your table code to book any table : ");
           String bookCode = new Scanner(System.in).nextLine();
           bookCode = bookCode.trim();
           boolean isFound = false;
           for(int i=0;i<tables.length;i++){
               for(int j=0;j<tables[i].length;j++){
                   String[] splitCode = tables[i][j].split(":");
                   if(splitCode[0].trim().equalsIgnoreCase(bookCode)){
                       isFound = true;
                       if(splitCode[1].trim().equalsIgnoreCase("BO")){
                           System.out.print("This table has been booked");
                           System.exit(0);
                       }
                       tables[i][j] = splitCode[0] + ":BO";
                       bookingHistory.add(splitCode[0] + " booked at " + new Date());
                       System.out.println("You have booked table successfully");
                   }
               }
           }
           if(!isFound){
               System.out.println("The code you entered is not found");
           }
           if(bookCode.equalsIgnoreCase("exit")){
               return;
           }
       }
    }
    public static void CancelBooked(){
        while(true){
            System.out.println("*".repeat(23) + " Welcome to table booking cancellation section " + "*".repeat(23));
            for(int i=0;i<tables.length;i++){
                for(int j=0;j<tables[i].length;j++){
                    if(j==0){
                        System.out.print("|");
                    }
                    System.out.print(tables[i][j] + " |");
                }
                System.out.println();
            }
            System.out.print("Enter your code table to cancel booked table : ");
            String deleteCode = new Scanner(System.in).nextLine().trim();
            boolean canChange = false;
            for(int i =0;i<tables.length;i++){
                for(int j=0;j<tables[i].length;j++){
                    String[] deleteBooking = tables[i][j].split(":");
                    if(deleteBooking[0].equalsIgnoreCase(deleteCode) && deleteBooking[1].equalsIgnoreCase("BO")){
                        canChange = true;
                        tables[i][j] = deleteBooking[0] + ":AV";
                        bookingHistory.add(deleteBooking[0] + " canceled at " + new Date());
                        System.out.println("Booking canceled successfully");
                    }
                }
            }
            if(!canChange){
                System.out.println("the code you entered is not found");
            }
            if(deleteCode.equalsIgnoreCase("exit")){
                return;
            }
            for(int i=0;i<tables.length;i++){
                for(int j=0;j<tables[i].length;j++){
                    if(j==0){
                        System.out.print("|");
                    }
                    System.out.print(tables[i][j] + " |");
                }
                System.out.println();
            }
        }
    }
    public static void viewHistory(){
        System.out.println("*".repeat(23) + " View History " + "*".repeat(23));
        if(bookingHistory.isEmpty()){
            System.out.println("No bookings or cancellations have been mad yet.");
        }else{
            for(String getRecord : bookingHistory){
                System.out.println(getRecord);
            }
        }
    }
    public static void main(String[] args) {
        System.out.println("*".repeat(23));
        System.out.println("""
                1. Setup table
                2. Start booking
                3. Cancel booked table
                4. View History
                5. Exit
                """);
        System.out.println("*".repeat(23));
        int number = 0;
        do{
          try{
              System.out.print("Enter your option : ");
              number = Integer.parseInt(new Scanner(System.in).nextLine());
          }catch(NumberFormatException e){
              System.out.println("Do not type in character, Please type in number 1 to 5 only");
              continue;
          }
          switch(number){
              case 1 -> setupTable();
              case 2 -> startBooking();
              case 3 -> CancelBooked();
              case 4 -> viewHistory();
              default -> System.out.println("Please enter number from 1 to 5 only");
          }
        }while(number!=5);
    }
}
