package day14_Scanner;

import java.util.Scanner;

public class address {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter street number");
        int streetNumber = input.nextInt();
        input.nextLine();
        System.out.println("enter your street name");
        String streetName = input.nextLine();
        System.out.println("enter your city name");
        String cityName = input.nextLine();
        System.out.println("please enter your state name");
        String stateName = input.next();
        System.out.println("please enter your zip code");
        int zipcode = input.nextInt();
        input.nextLine();
        System.out.println("please enter your full name");
        String fullName = input.nextLine();
        System.out.println( "\n"+"Ship to : " +  fullName+"\n"+streetNumber+" "+streetName+
                "\n"+cityName+", "+stateName+", "+zipcode);






    }
}
