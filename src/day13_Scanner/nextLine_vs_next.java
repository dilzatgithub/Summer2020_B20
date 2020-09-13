package day13_Scanner;

import java.util.Scanner;

public class nextLine_vs_next {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter you salary");
        double salary = scan.nextDouble();
        scan.nextLine();
        System.out.println("enter your full name");
        String fullName = scan.nextLine();
        System.out.println("salary is: "+ salary);
        System.out.println("full name: " + fullName);

    }
}
