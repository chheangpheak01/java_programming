package classNObject.model;

public class Employee{
    private Integer id;
    private String uuid,name,position;
    private Double salary;
    public void setEmployee(Integer id, String uuid,String name, String position, Double salary){
        this.id = id;
        this.uuid = uuid;
        this.name = name;
        this.position = position;
        this.salary = salary;
    }
    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", uuid='" + uuid + '\'' +
                ", name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                '}';
    }
}
