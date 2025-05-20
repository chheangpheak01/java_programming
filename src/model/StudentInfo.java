package model;
import java.sql.Date;

public class StudentInfo {
    private Integer id;
    private String name;
    private Integer age;
    private String gender;
    private String year;
    private String semester;
    private String email;
    private String phone_number;
    private Date enrollment_date;
    private String current_city;
    private String hometown;
    private String department;
    private Integer linux;
    private Integer java;
    private Integer python;
    private Integer javascript;
    private Integer reactjs;
    private Character grade;
    private Float score;
    private Double average;

    @Override
    public String toString() {
        return "StudentInfo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", year='" + year + '\'' +
                ", semester='" + semester + '\'' +
                ", email='" + email + '\'' +
                ", phone_number='" + phone_number + '\'' +
                ", enrollment_date=" + enrollment_date +
                ", current_city='" + current_city + '\'' +
                ", hometown='" + hometown + '\'' +
                ", department='" + department + '\'' +
                ", linux=" + linux +
                ", java=" + java +
                ", python=" + python +
                ", javascript=" + javascript +
                ", reactjs=" + reactjs +
                ", grade=" + grade +
                ", score=" + score +
                ", average=" + average +
                '}';
    }

    public StudentInfo(){}
    public StudentInfo(Integer id, String name, Integer age, String gender, String year, String semester, String email, String phone_number, Date enrollment_date, String current_city, String hometown, String department, Integer linux, Integer java, Integer python, Integer javascript, Integer reactjs, Character grade, Float score, Double average) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.year = year;
        this.semester = semester;
        this.email = email;
        this.phone_number = phone_number;
        this.enrollment_date = enrollment_date;
        this.current_city = current_city;
        this.hometown = hometown;
        this.department = department;
        this.linux = linux;
        this.java = java;
        this.python = python;
        this.javascript = javascript;
        this.reactjs = reactjs;
        this.grade = grade;
        this.score = score;
        this.average = average;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public Date getEnrollment_date() {
        return enrollment_date;
    }

    public void setEnrollment_date(Date enrollment_date) {
        this.enrollment_date = enrollment_date;
    }

    public String getCurrent_city() {
        return current_city;
    }

    public void setCurrent_city(String current_city) {
        this.current_city = current_city;
    }

    public String getHometown() {
        return hometown;
    }

    public void setHometown(String hometown) {
        this.hometown = hometown;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Integer getLinux() {
        return linux;
    }

    public void setLinux(Integer linux) {
        this.linux = linux;
    }

    public Integer getJava() {
        return java;
    }

    public void setJava(Integer java) {
        this.java = java;
    }

    public Integer getPython() {
        return python;
    }

    public void setPython(Integer python) {
        this.python = python;
    }

    public Integer getJavascript() {
        return javascript;
    }

    public void setJavascript(Integer javascript) {
        this.javascript = javascript;
    }

    public Integer getReactjs() {
        return reactjs;
    }

    public void setReactjs(Integer reactjs) {
        this.reactjs = reactjs;
    }

    public Character getGrade() {
        return grade;
    }

    public void setGrade(Character grade) {
        this.grade = grade;
    }

    public Float getScore() {
        return score;
    }

    public void setScore(Float score) {
        this.score = score;
    }

    public Double getAverage() {
        return average;
    }

    public void setAverage(Double average) {
        this.average = average;
    }

}
