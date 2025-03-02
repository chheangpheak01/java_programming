package introduction;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class DateUsing{
    public static void main(String[] args) {
        Date myDate = Date.from(Instant.now());
        LocalDateTime localDateTime = LocalDateTime.now();
        LocalDate localDate = LocalDate.of(2001,4,3);
        System.out.println("Date : " + myDate);
        System.out.println("LocalDateTime : " + localDateTime);
        System.out.println("LocalDate : " + localDate);
        String pattern = "Welcome".toUpperCase();
        char letter = 'A';
        try{
            for(char i=0;i<'Z';i++){
                System.out.print(letter);
                letter++;
                Thread.sleep(500);
            }
        }catch (Exception exception){
            System.out.println(exception.getMessage());
        }
    }
}

