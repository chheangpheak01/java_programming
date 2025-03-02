package introduction;

class UserName{
    public int id;
    public String name;
    public String email;
}
enum StatusCambodia{
    FAILED,
    SUCCESS,
}
public class ReferenceType {
    public static void main(String[] args) {
        StatusCambodia status = StatusCambodia.SUCCESS;
        System.out.println(status);
        UserName user = new UserName();
        user.id = 12;
        user.name= "koko";
        user.email = "sopheak02@gmail.com";
        System.out.println(user.email);
    }
}

