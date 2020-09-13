package day15_String;

import org.omg.CORBA.ARG_OUT;

import java.util.Scanner;

public class toLowerCase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter your first name");
        String firstName = input.next();
        firstName = firstName.substring(0,1).toUpperCase().concat(firstName.substring(1).toLowerCase()) ;
        System.out.println(firstName);






    }
}
