package day13_Scanner;

import java.util.Scanner;

public class NEXTPP {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter your street number");
        int streetNumber =input.nextInt();
        input.nextLine();
        System.out.println("please enter your street name");
        String StreetName =input.nextLine();
        System.out.println(streetNumber+StreetName);
    }
}
