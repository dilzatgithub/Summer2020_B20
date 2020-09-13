package day18_loopIntro;

import java.util.Scanner;

public class loop_Intro {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String firstName = scan.next();
        String lastName = scan.next();
        String initial =(lastName.substring(0,1) + firstName.substring(0,1));
        String upInitial = initial.toUpperCase();
        System.out.println(upInitial);



    }
}
