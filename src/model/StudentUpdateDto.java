package model;
import java.sql.Date;

public record StudentUpdateDto(
        String name,
        Integer age,
        String gender,
        String year,
        String semester,
        String email,
        String phone_number,
        Date enrollment_date,
        String current_city,
        String hometown,
        String department,
        Integer linux,
        Integer java,
        Integer python,
        Integer javascript,
        Integer reactjs,
        Character grade,
        Float score,
        Double average
){}
