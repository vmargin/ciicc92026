import java.time.*;

public class DateAndTimeLesson {
    public static void main(String[] args) {
        System.out.println(LocalTime.now());
        System.out.println(LocalDate.now());
        System.out.println(LocalDateTime.now());

        LocalDate date1 = LocalDate.of(1998, 1, 22);
        System.out.println(date1);
        LocalDate date2 = LocalDate.of(2026, Month.JULY, 30);
        System.out.println(date2);
        LocalTime time1 = LocalTime.of(3,24);
        LocalTime time2 = LocalTime.of(3,24,2,4);
        System.out.println(time1);

        //date plus or minus - years, months, weeks, days
        System.out.println(date1.plusDays(40));


        
    }   
    
}
