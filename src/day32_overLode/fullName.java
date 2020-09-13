package day32_overLode;

import java.util.Scanner;

public class fullName {
    public static String fullName(String firstName, String lastName){
        firstName = firstName.substring(0,1).toUpperCase()
                +firstName.substring(1).toLowerCase();
        lastName= lastName.substring(0,1).toUpperCase()
                +lastName.substring(1).toLowerCase();
        String fullName = firstName+" "+lastName;
        return fullName;

    }
}
