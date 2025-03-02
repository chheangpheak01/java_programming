package collectionFramework;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Map1{
    private static Map<Integer,String> students = new HashMap<>();
    private static boolean addNewStu(String stName){
        int gKeyNumber = new Random().nextInt(10);
        return true;
    }
    private static boolean RemoveStuById(int id){
        String value = students.remove(id);
        if(value!=null){
            return true;
        }
        return false;
    }
    private static boolean updateStuById(int id, String stuName){
        String value = students.put(id,stuName);
        if(value!=null){
            return  true;
        }
        return false;
    }
    private static void home(){
        System.out.println("""
                1. add student name 
                2. search by id
                3. delete student by id
                4. update student by id
                5. exit
                """);
    }
    public static void main(String[] args) {
    }
}
