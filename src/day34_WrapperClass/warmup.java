package day34_WrapperClass;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class warmup {
    public static void main(String[] args) {


        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter s1 = DateTimeFormatter.
                ofPattern("EEEE hh/mm a, MMM/dd/yyyy");
        System.out.println(now.format(s1));
    }
}
