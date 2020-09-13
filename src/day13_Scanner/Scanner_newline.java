package day13_Scanner;

import java.util.Scanner;

public class Scanner_newline {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("you full name");
        String fullName = scan.nextLine();
        System.out.println(fullName);



    }
}
