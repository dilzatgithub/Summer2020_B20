package day33_MethodsAndTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class timeFormatting {
    public static void main(String[] args) {
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern(
                "MM/dd/yyyy"
        );
        LocalDate ld = LocalDate.now();
        System.out.println(ld);
        System.out.println(ld.format(dateFormat));

        DateTimeFormatter fm = DateTimeFormatter.ofPattern("MMM/dd/yyyy : hh/mm a EEEE");

        LocalDateTime t1 = LocalDateTime.now();
        System.out.println( t1.format(fm));





    }
}
