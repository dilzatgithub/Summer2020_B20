package day33_MethodsAndTime;

import java.time.LocalDate;
import java.time.LocalTime;

public class dates {
    public static void main(String[] args) {
        LocalDate DOB = LocalDate.of(2020,7,24);
        System.out.println(DOB);
        LocalDate rightNow = LocalDate.now();
        System.out.println(rightNow);
        LocalTime Time = LocalTime.now();
        System.out.println(rightNow + " "+ Time);
    }
}
