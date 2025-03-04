package collectionFramework;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class Assignment{
    private static Map<Integer,String> studentInfo = new HashMap<>();
    private static void displayCurrentStData(){
        System.out.println("*".repeat(15) + " Display all current student data " + "*".repeat(15));
        for(Map.Entry<Integer,String>entry:studentInfo.entrySet()){
            System.out.println("Name : " + entry.getValue() + " with rank " + entry.getKey() + " is stored");
        }
    }
    private static String addStu(String name){
        int key = new Random().nextInt(100);
        studentInfo.put(key,name);
        return "Student name  : " + name + " added successfully to student info with rank of " + key;
    }
    private static String removeStu(int id){
        String removeData = studentInfo.remove(id);
        if(removeData!=null){
            return "Student name : " + removeData + " has been deleted successfully ";
        }else{
            return "Student with ID " + id + " not found, Deletion failed";
        }
    }
    private static String updateStu(int id, String newName){
        String oldName = studentInfo.put(id,newName);
        if(oldName!=null){
            return "Student name: " + oldName + " has been updated to " + newName + " successfully";
        }else{
            return "Student with ID " + id + " not found. A new entry has been added with name : " + newName;
        }
    }
    private static String searchStu(String searchName){
        if(studentInfo.containsValue(searchName)){
            return "Student name : " + searchName + " is found";
        }else{
            return "Student name : " + searchName + " is not found";
        }
    }
    private static void Home(){
        int number = 0;
        do{
            System.out.println("*".repeat(23));
            System.out.println("""
                1. Add student name
                2. Search by ID
                3. Delete student by ID
                4. Update student by ID
                5. Exit
                """);
            System.out.println("*".repeat(23));
            try{
                System.out.print("Enter your option : ");
                number = Integer.parseInt(new Scanner(System.in).nextLine());
            }catch(NumberFormatException e){
                System.out.println("Do not type in character, Please type in number 1 to 5 only");
                continue;
            }
            switch(number){
                case 1 -> {
                    System.out.println("*".repeat(15) + " Add new student to record " + "*".repeat(15));
                    System.out.print("Enter student name to add to student info : ");
                    String addName = new Scanner(System.in).nextLine();
                    System.out.println(addStu(addName));
                    displayCurrentStData();

                }
                case 2 -> {
                    System.out.println("*".repeat(15) + " search student name from student info" + "*".repeat(15));
                    System.out.print("Enter student name that you wanna search for : ");
                    String searchStuName = new Scanner(System.in).nextLine();
                    System.out.println(searchStu(searchStuName));
                    displayCurrentStData();
                }
                case 3 -> {
                    System.out.println("*".repeat(15) + " Delete student name from student info " + "*".repeat(15));
                    System.out.print("Enter ID student to delete : ");
                    int  stuIDRemove = new Scanner(System.in).nextInt();
                    System.out.println(removeStu(stuIDRemove));
                    displayCurrentStData();
                }
                case 4 -> {
                    System.out.println("*".repeat(15) + " Update student name from student info " + "*".repeat(15));
                    System.out.print("Enter ID student to update : ");
                    int  stuIDUpdate = new Scanner(System.in).nextInt();
                    if(stuIDUpdate>=0){
                        System.out.print("Enter new student name to update : ");
                        String updateName = new Scanner(System.in).nextLine();
                        System.out.println(updateStu(stuIDUpdate,updateName));
                        displayCurrentStData();
                    }
                }
                default -> System.out.println("Please enter number from 1 to 5 only");
            }
        }while(number!=5);
    }
    public static void main(String[] args){
        System.out.println("Current of student data : " + studentInfo);
        Home();
    }
}
