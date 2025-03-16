package classNObject.Constructor;
import java.util.UUID;

public class Animal{
    private Integer id;
    private String uuid,name,color;
    private Character gender;
    public Animal(Integer id,String uuid,String name,String color,Character gender){
        this.id = id;
        this.uuid = uuid;
        this.name = name;
        this.color = color;
        this.gender = gender;
    }
    public Animal(){
        System.out.println("You're calling the constructor with no parameter");
    }
    public void setID(Integer id){
        this.id = id;
    }
    public Integer getID(){
        return this.id;
    }
    public void setUUID(String uuid){
        this.uuid = uuid;
    }
    public String getUUID(){
        return this.uuid;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void setColor(String color){
        this.color = color;
    }
    public String getColor(){
        return this.color;
    }
    public void setColor(Character gender){
        this.gender = gender;
    }
    public Character getGender(){
        return this.gender;
    }
    @Override
    public String toString() {
        return "Animal{" +
                "id=" + id +
                ", uuid='" + uuid + '\'' +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", gender=" + gender +
                '}';
    }
    public static void main(String[] args){
        Animal animal = new Animal();
        Animal animal1 = new Animal(1,UUID.randomUUID().toString(),"Ah ki","Blue",'M');
        System.out.println("Result of animal -> " + animal);
        System.out.println("Result of animal1 -> " + animal1);
        System.out.println("*".repeat(20) + " After using Setter and Getter " + "*".repeat(20));
        animal1.setColor("Black and white");
        System.out.println(animal1);
        System.out.println(animal1.getColor());
    }
}
