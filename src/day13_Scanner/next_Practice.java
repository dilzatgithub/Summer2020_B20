package day13_Scanner;

import java.util.Scanner;

public class next_Practice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("please enter your first name");
        String firstName = scan.next();
        System.out.println("please enter your last name");
        String lastName = scan.next();
        System.out.println("your full name is: "+ firstName+" "+lastName);


    }
}
