package array1;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.UUID;

public class TestSystem1 {
    static String[] studentName;
    static int[] studentAge;
    static Scanner scanner = new Scanner(System.in);
    static String uuid = UUID.randomUUID().toString();
    static int number;

    public static void createMembers(){
        try{
            System.out.print("Enter the amount of members : ");
            number = scanner.nextInt();
            scanner.nextLine();
            studentName = new String[number];
            studentAge = new int[number];
            for(int i=0;i<number;i++){
                while(true){
                    System.out.print("Enter the name of member : [" +(i+1) + "] : ");
                    String name = scanner.nextLine().trim();
                    if(name.isEmpty()){
                        System.out.println("Name can not be empty, please enter the name");
                    }else if(name.matches("\\d+")){
                        System.out.println("Please enter valid name, not just the number");
                    }else{
                        studentName[i] = name;
                        break;
                    }
                }
                    while(true){
                        try{
                            System.out.print("Enter the age of member : [" +(i+1) + "] : ");
                            studentAge[i] = scanner.nextInt();
                            scanner.nextLine();
                            break;
                        }catch(InputMismatchException e){
                            System.out.println("Please enter valid number");
                            scanner.nextLine();
                        }
                    }
            }
        }catch(InputMismatchException e){
            System.out.println("Invalid input, please enter valid number");
        }
    }
    public static void listAllMember(){
        System.out.println("List All member Name");
                for(int i=0;i<number;i++){
                    if(studentName[i] !=null){
                        System.out.println("💘 member "+  (i+ 1) + " : Name = " + studentName[i] + "; Age = " + studentAge[i]);
                }
        }
    }
    public static void UI(){
        System.out.println("*".repeat(40));
        System.out.print("""
                 Welcome To Management Member System
                         1.Creation Member
                         2.List All Member
                         3.Search Member
                         4.Update Member
                         5.Delete Member
                         6.Exit
                """);
        System.out.println("*".repeat(40));
        int number = 0;
        do{
            try{
                System.out.print("Enter your option : ");
                number = Integer.parseInt(scanner.nextLine().trim());
            }catch(NumberFormatException e){
                System.out.println("Please enter valid number from 1 to 6 only");
                continue;
            }
            switch(number){
                case 1 -> createMembers();
                case 2 -> listAllMember();
            }
        }while(number!=6);
    }
    public static void main(String[] args) {
       UI();
    }
}
