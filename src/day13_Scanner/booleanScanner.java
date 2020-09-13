package day13_Scanner;

import java.util.Scanner;

public class booleanScanner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("your can has 4 door");
        boolean result = scan.nextBoolean();
        System.out.println(result);
    }
}
