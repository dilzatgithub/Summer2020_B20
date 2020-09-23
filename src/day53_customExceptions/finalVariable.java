package day53_customExceptions;

import java.time.LocalDate;

public class finalVariable {
    public static void main(String[] args) {
        final  LocalDate dateOfBirth = LocalDate.of(2000,5,7);

        //dateOfBirth = LocalDate.of(1990,6,5);

        System.out.println(dateOfBirth);
    }
}
