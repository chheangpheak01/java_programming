package classNObject.Lombok;
import lombok.*;

@Setter
@Getter
class StoredUsers{
    String name;
    Integer id;
    Character gender;
}
public class MyUser{
    public static void main(String[] args) {
        StoredUsers user1 = new StoredUsers();
        user1.setName("Dara");
        System.out.println(user1.getName());
    }
}
