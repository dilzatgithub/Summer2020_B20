package day13_Scanner;

import java.util.Scanner;

public class Scanner_next {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter you company name");
        String company = scan.next();
        System.out.println("your company name : "+ company);
    }
}
