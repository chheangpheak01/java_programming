import model.StudentInfo;
import model.StudentUpdateDto;
import repository.StudentRepository;
import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalTime;
import view.UserInterface;

public class RunMethod {
    public static void main(String[] args) {
//        new StudentRepository().getAllStudentInfo().forEach(System.out::println);
//        StudentInfo studentInfo = new StudentInfo(3,"Tola",23,"Male","third year","second semester","chph@gmail.com","097 1230 2987",Date.valueOf(LocalDate.now()),"Phnom Phehn","Kong Kong","Computer Science",78,56,75,76,79,'A',96.1f,23.8);
//        new StudentRepository().addStudentInfo(studentInfo);
//        int id = 1;
//        StudentUpdateDto studentUpdateDto = new StudentUpdateDto("Heng Mon",22,"Male","First Year","Second Semester","hm@gmail.com","097 876 1243",Date.valueOf(LocalDate.now()),"Phnom Phehn","Koh kong","Network",56,75,65,76,89,'B',56.2f,90.1);
//        new StudentRepository().UpdateStudentInfo(id,studentUpdateDto);
//        int id = 3;
//        new StudentRepository().deleteStudentInfo(id);
          UserInterface.home();
    }
}
