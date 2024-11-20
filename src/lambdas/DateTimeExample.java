package lambdas;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;

public class DateTimeExample {

    public static void main(String[] args) {

        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();
        LocalDateTime localDateTime = LocalDateTime.now();
        LocalDateTime localDateTimeZoneId = LocalDateTime.now(ZoneId.of("GMT-6"));

        System.out.println("Date: " + date);
        System.out.println("Time: " + time);
        System.out.println("LocalDate: " + localDateTime);
        System.out.println("LocalDateZoneId: " + localDateTimeZoneId);
    }
}
