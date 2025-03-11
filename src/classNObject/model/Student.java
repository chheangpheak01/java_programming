package classNObject.model;

public class Student{
    private Integer id;
    private String name;
    private String email;
    public void setStuInfo(Integer myID,String myName,String myEmail){
        id = myID;
        name = myName;
        email = myEmail;
    }
    public void getStuInfo(){
        System.out.println("ID -> " + id);
        System.out.println("Name -> " + name);
        System.out.println("Email -> " + email);
    }
}
