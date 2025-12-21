import java.time.format.DateTimeFormatter;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.Instant;
public class DateTime {
    public static void main(String[]args)
    {
        //working with dates and times using java
        //LocalDate ,Localtime,localDateTime,UTC timestamp
        LocalTime time=LocalTime.now();
        System.out.println(time);
        LocalDate date=LocalDate.now();
        System.out.println(date);
        LocalDateTime datetime=LocalDateTime.now();
        System.out.println(datetime);
        Instant instant=Instant.now();
        System.out.println(instant);
        //custom format
        DateTimeFormatter formatter =DateTimeFormatter.ofPattern("MM-dd-yyyy  HH : mm : ss");
        String newdatetime=datetime.format(formatter);
        System.out.println(newdatetime);
        //printing specifc date and time
        LocalDateTime dt1=LocalDateTime.of(2024,12,25,12,00,00);
        System.out.println(dt1);
        LocalDateTime dt2=LocalDateTime.of(2025,12,25,12,00,00);
        System.out.println(dt2);
        if(dt1.isBefore(dt2))
            System.out.print(dt1+" is earlier than "+dt2);
        else if(dt1.isAfter(dt2))
            System.out.print(dt1+" is after "+dt2);
        else if(dt1.isEqual(dt2))
            System.out.print(dt1+" is equal to "+dt2);
    }
}
