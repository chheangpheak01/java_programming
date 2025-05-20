package repository;
import database.DatabaseConnectionConfig;
import model.StudentInfo;
import model.StudentUpdateDto;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StudentRepository {
    public List<StudentInfo> getAllStudentInfo(){
        String sql = "SELECT * FROM Student";
        try(
                Connection connection = DriverManager.getConnection(
                        DatabaseConnectionConfig.databaseUrl,
                        DatabaseConnectionConfig.databaseUserName,
                        DatabaseConnectionConfig.databasePassword
                );
                Statement statement = connection.createStatement();
                ){
            ResultSet resultSet = statement.executeQuery(sql);
            List<StudentInfo> studentInfoList = new ArrayList<>();
            while (resultSet.next()){
                StudentInfo studentInfo = new StudentInfo();
                studentInfo.setId(resultSet.getInt("id"));
                studentInfo.setName(resultSet.getString("name"));
                studentInfo.setAge(resultSet.getInt("age"));
                studentInfo.setGender(resultSet.getString("gender"));
                studentInfo.setYear(resultSet.getString("year"));
                studentInfo.setSemester(resultSet.getString("semester"));
                studentInfo.setEmail(resultSet.getString("email"));
                studentInfo.setPhone_number(resultSet.getString("phone_number"));
                studentInfo.setEnrollment_date(resultSet.getDate("enrollment_date"));
                studentInfo.setCurrent_city(resultSet.getString("current_city"));
                studentInfo.setHometown(resultSet.getString("hometown"));
                studentInfo.setDepartment(resultSet.getString("department"));
                studentInfo.setLinux(resultSet.getInt("linux"));
                studentInfo.setJava(resultSet.getInt("java"));
                studentInfo.setPython(resultSet.getInt("python"));
                studentInfo.setJavascript(resultSet.getInt("javascript"));
                studentInfo.setReactjs(resultSet.getInt("reactjs"));
                studentInfo.setGrade(resultSet.getString("grade").charAt(0));
                studentInfo.setScore(resultSet.getFloat("score"));
                studentInfo.setAverage(resultSet.getDouble("average"));
                studentInfoList.add(studentInfo);
            }
            return studentInfoList;
        }catch (Exception e){
            System.out.println("Error during trying to Get all Student information 🤦‍♂️🥹 " + e.getMessage());
        }
        return null;
    }

    public int addStudentInfo(StudentInfo studentInfo){
        String sql = """
                INSERT INTO Student(id,name,age,gender,year,semester,email,phone_number,enrollment_date,current_city,hometown,department,linux,java,python,javascript,reactjs,grade,score,average)
                VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)
                """;
        try(
                Connection connection = DriverManager.getConnection(
                        DatabaseConnectionConfig.databaseUrl,
                        DatabaseConnectionConfig.databaseUserName,
                        DatabaseConnectionConfig.databasePassword
                );
                PreparedStatement preparedStatement = connection.prepareStatement(sql);
                ){
            preparedStatement.setInt(1,studentInfo.getId());
            preparedStatement.setString(2,studentInfo.getName());
            preparedStatement.setInt(3,studentInfo.getAge());
            preparedStatement.setString(4,studentInfo.getGender());
            preparedStatement.setString(5,studentInfo.getYear());
            preparedStatement.setString(6,studentInfo.getSemester());
            preparedStatement.setString(7,studentInfo.getEmail());
            preparedStatement.setString(8,studentInfo.getPhone_number());
            preparedStatement.setDate(9,studentInfo.getEnrollment_date());
            preparedStatement.setString(10,studentInfo.getCurrent_city());
            preparedStatement.setString(11,studentInfo.getHometown());
            preparedStatement.setString(12,studentInfo.getDepartment());
            preparedStatement.setInt(13,studentInfo.getLinux());
            preparedStatement.setInt(14,studentInfo.getJava());
            preparedStatement.setInt(15,studentInfo.getPython());
            preparedStatement.setInt(16,studentInfo.getJavascript());
            preparedStatement.setInt(17,studentInfo.getReactjs());
            preparedStatement.setString(18,studentInfo.getGrade().toString());
            preparedStatement.setFloat(19,studentInfo.getScore());
            preparedStatement.setDouble(20,studentInfo.getAverage());

            int rowEffected = preparedStatement.executeUpdate();
            if(rowEffected > 0){
                System.out.println("Student information Added successfully 😊🚀");
            }else{
                System.out.println("Failed to Add student information 🤦‍♂️🥹");
            }
        }catch (Exception e){
            System.out.println("Error during trying to Add student information 🤦‍♂️🥹" + e.getMessage());
        }
        return 0;
    }

    public int updateStudentInfo(int id, StudentUpdateDto studentUpdateDto){
        String sql = """
                UPDATE Student 
                SET name = ?,age = ?,gender = ?,year = ?,semester = ?,email = ?,phone_number = ?,enrollment_date = ?,current_city = ?,hometown = ?,department = ?,linux = ?,java = ?,python = ?,javascript = ?,reactjs = ?,grade = ?,score = ?,average = ? WHERE id = ?
                """;
        try(
                Connection connection = DriverManager.getConnection(
                        DatabaseConnectionConfig.databaseUrl,
                        DatabaseConnectionConfig.databaseUserName,
                        DatabaseConnectionConfig.databasePassword
                );
                PreparedStatement preparedStatement = connection.prepareStatement(sql);
                ){
            preparedStatement.setString(1,studentUpdateDto.name());
            preparedStatement.setInt(2,studentUpdateDto.age());
            preparedStatement.setString(3,studentUpdateDto.gender());
            preparedStatement.setString(4,studentUpdateDto.year());
            preparedStatement.setString(5,studentUpdateDto.semester());
            preparedStatement.setString(6,studentUpdateDto.email());
            preparedStatement.setString(7,studentUpdateDto.phone_number());
            preparedStatement.setDate(8,studentUpdateDto.enrollment_date());
            preparedStatement.setString(9, studentUpdateDto.current_city());
            preparedStatement.setString(10,studentUpdateDto.hometown());
            preparedStatement.setString(11,studentUpdateDto.department());
            preparedStatement.setInt(12,studentUpdateDto.linux());
            preparedStatement.setInt(13,studentUpdateDto.java());
            preparedStatement.setInt(14,studentUpdateDto.python());
            preparedStatement.setInt(15,studentUpdateDto.javascript());
            preparedStatement.setInt(16,studentUpdateDto.reactjs());
            preparedStatement.setString(17,studentUpdateDto.grade().toString());
            preparedStatement.setFloat(18,studentUpdateDto.score());
            preparedStatement.setDouble(19,studentUpdateDto.average());
            preparedStatement.setInt(20,id);

            int rowEffected = preparedStatement.executeUpdate();
            if(rowEffected > 0){
                System.out.println("Student Information updated successfully 😊🚀");
            }else{
                System.out.println("Failed to update Student Information 🤦‍♂️🥹");
            }
        }catch (Exception e){
            System.out.println("Error during trying to Update Student Information 🤦‍♂️🥹" + e.getMessage());
        }
        return 0;
    }

    public int deleteStudentInfo(int id){
        String sql = """
                DELETE FROM Student WHERE id = ?
                """;
        try(
                Connection connection = DriverManager.getConnection(
                        DatabaseConnectionConfig.databaseUrl,
                        DatabaseConnectionConfig.databaseUserName,
                        DatabaseConnectionConfig.databasePassword
                );
                PreparedStatement preparedStatement = connection.prepareStatement(sql);
                ){
            preparedStatement.setInt(1,id);
            int rowEffected = preparedStatement.executeUpdate();
            if(rowEffected > 0){
                System.out.println("Student information Deleted successfully 😊🚀");
            }else{
                System.out.println("Failed to Delete Student information 🤦‍♂️🥹");
            }
        }catch (Exception e){
            System.out.println("Error during trying to Delete Student Information 🤦‍♂️🥹" + e.getMessage());
        }
        return 0;
    }

    public char findStudentGrade(int linux, int java, int python, int javascript, int reactjs){
        int total = linux + java + python + javascript + reactjs;
        double avg = total / 5.0;
        char stuGrade;
        if(avg >= 90){
            stuGrade = 'A';
        }else if(avg >= 80){
            stuGrade = 'B';
        }else if(avg >= 70){
            stuGrade = 'C';
        }else if(avg >= 60){
            stuGrade = 'D';
        }else if(avg >= 50){
            stuGrade = 'E';
        }else{
            stuGrade = 'F';
        }
        return stuGrade;
    }

    public float findStudentScore(int[] stuScores){
        float total = 0;
        for(int score : stuScores){
            total += score;
        }
        return total;
    }

    public double findStudentAverage(int[] studentScores){
        double total = 0;
        for(int score : studentScores){
            total += score;
        }
        return total / studentScores.length;
    }

    public List<StudentInfo> searchStudentInfoByGrade(char grade){
        String sql = "SELECT * FROM Student WHERE grade = ?";
        try(
                Connection connection = DriverManager.getConnection(
                        DatabaseConnectionConfig.databaseUrl,
                        DatabaseConnectionConfig.databaseUserName,
                        DatabaseConnectionConfig.databasePassword
                );
                PreparedStatement preparedStatement = connection.prepareStatement(sql);
                ){
            preparedStatement.setString(1,String.valueOf(grade));
            ResultSet resultSet = preparedStatement.executeQuery();
            List<StudentInfo> studentInfoList = new ArrayList<>();
            while (resultSet.next()){
                StudentInfo studentInfo = new StudentInfo();
                studentInfo.setId(resultSet.getInt("id"));
                studentInfo.setName(resultSet.getString("name"));
                studentInfo.setAge(resultSet.getInt("age"));
                studentInfo.setGender(resultSet.getString("gender"));
                studentInfo.setYear(resultSet.getString("year"));
                studentInfo.setSemester(resultSet.getString("semester"));
                studentInfo.setEmail(resultSet.getString("email"));
                studentInfo.setPhone_number(resultSet.getString("phone_number"));
                studentInfo.setEnrollment_date(resultSet.getDate("enrollment_date"));
                studentInfo.setCurrent_city(resultSet.getString("current_city"));
                studentInfo.setHometown(resultSet.getString("hometown"));
                studentInfo.setDepartment(resultSet.getString("department"));
                studentInfo.setLinux(resultSet.getInt("linux"));
                studentInfo.setJava(resultSet.getInt("java"));
                studentInfo.setPython(resultSet.getInt("python"));
                studentInfo.setJavascript(resultSet.getInt("javascript"));
                studentInfo.setReactjs(resultSet.getInt("reactjs"));
                studentInfo.setGrade(resultSet.getString("grade").charAt(0));
                studentInfo.setScore(resultSet.getFloat("score"));
                studentInfo.setAverage(resultSet.getDouble("average"));
                studentInfoList.add(studentInfo);
            }
            return studentInfoList;
        }catch (Exception e){
            System.out.println("Error during trying to Search Student Information by Grade 🤦‍♂️🥹" + e.getMessage());
        }
        return null;
    }

    public List<StudentInfo> listTopPerformingStudents(){
        String sql = "SELECT * FROM Student WHERE average >= 90";
        try(
                Connection connection = DriverManager.getConnection(
                        DatabaseConnectionConfig.databaseUrl,
                        DatabaseConnectionConfig.databaseUserName,
                        DatabaseConnectionConfig.databasePassword
                );
                PreparedStatement preparedStatement = connection.prepareStatement(sql);
                ){
            ResultSet resultSet = preparedStatement.executeQuery();
            List<StudentInfo> topStudents = new ArrayList<>();
            while (resultSet.next()){
                StudentInfo studentInfo = new StudentInfo();
                studentInfo.setId(resultSet.getInt("id"));
                studentInfo.setName(resultSet.getString("name"));
                studentInfo.setAge(resultSet.getInt("age"));
                studentInfo.setGender(resultSet.getString("gender"));
                studentInfo.setYear(resultSet.getString("year"));
                studentInfo.setSemester(resultSet.getString("semester"));
                studentInfo.setEmail(resultSet.getString("email"));
                studentInfo.setPhone_number(resultSet.getString("phone_number"));
                studentInfo.setEnrollment_date(resultSet.getDate("enrollment_date"));
                studentInfo.setCurrent_city(resultSet.getString("current_city"));
                studentInfo.setHometown(resultSet.getString("hometown"));
                studentInfo.setDepartment(resultSet.getString("department"));
                studentInfo.setLinux(resultSet.getInt("linux"));
                studentInfo.setJava(resultSet.getInt("java"));
                studentInfo.setPython(resultSet.getInt("python"));
                studentInfo.setJavascript(resultSet.getInt("javascript"));
                studentInfo.setReactjs(resultSet.getInt("reactjs"));
                studentInfo.setGrade(resultSet.getString("grade").charAt(0));
                studentInfo.setScore(resultSet.getFloat("score"));
                studentInfo.setAverage(resultSet.getDouble("average"));
                topStudents.add(studentInfo);
            }
            return topStudents;
        }catch (Exception e){
            System.out.println("Error during trying to get Top Performing Students List 🤦‍♂️🥹 " + e.getMessage());
        }
        return null;
    }

    public List<StudentInfo> listAllStudentWithAverage(){
        String sql = "SELECT id, name, average FROM Student";
        try(
                Connection connection = DriverManager.getConnection(
                        DatabaseConnectionConfig.databaseUrl,
                        DatabaseConnectionConfig.databaseUserName,
                        DatabaseConnectionConfig.databasePassword
                );
                PreparedStatement preparedStatement = connection.prepareStatement(sql);
                ){
            ResultSet resultSet = preparedStatement.executeQuery();
            List<StudentInfo> studentInfoList = new ArrayList<>();
            while (resultSet.next()){
                StudentInfo studentInfo = new StudentInfo();
                studentInfo.setId(resultSet.getInt("id"));
                studentInfo.setName(resultSet.getString("name"));
                studentInfo.setAverage(resultSet.getDouble("average"));
                studentInfoList.add(studentInfo);
            }
            return studentInfoList;
        }catch (Exception e){
            System.out.println("Error during trying to get all Student's Averages List 🤦‍♂️🥹 " + e.getMessage());
        }
        return null;
    }

    public boolean validatedEmail(String email){
        String emailCheck = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        return email != null && email.matches(emailCheck);
    }

}
