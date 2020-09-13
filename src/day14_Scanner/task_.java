package day14_Scanner;

import java.util.Scanner;

public class task_ {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("what is your gender?");
        String gender = input.next();
        input.nextLine();
        System.out.println("what is your age?");
        int age = input.nextInt();
        input.nextLine();
        System.out.println("what is your country name?");
        String countryName = input.nextLine();
        System.out.println("what is your zipCode?");
        int zipCode = input.nextInt();
        input.nextLine();
        System.out.println("please enter you full name");
        String fullName = input.nextLine();
        System.out.println("please enter your company name");
        String companyName = input.nextLine();
        System.out.println("your name is: "+fullName);
        System.out.println("your gender is: "+ gender);
        System.out.println("your age is: "+ age);
        System.out.println("your zipcode is: "+zipCode);
        System.out.println("your company name is: "+ companyName);
        System.out.println("your country name is: "+countryName);


    }
}
