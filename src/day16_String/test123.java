//package day16_String;
//import java.util.*;
//
///*Declare 9 String variables firstName, lastName, fullName, email, street, state, city, address, contacts.
//Declare 2 int variables: age, zipcode
//Declare 2 double variables: height, weight.
//Declare boolean variable: isMarried (for marriage status).
//Declare 2 long variables:workPhoneNumber and personalPhoneNumber.
//
//-Create a Scanner object named scan.
//
//Execution flow with example:
//-Display prompt "Welcome to the patient portal!"
//-Display prompt "Please enter your personal information"
//
//-Display prompt "Enter your first name"
//James
//
//-Display prompt "Enter your last name"
//May
//
//-Display prompt "Enter your email"
//jamesmay@gmail.com
//
//-Display prompt "Enter your street"
//7925 Jones Branch Dr
//
//-Display prompt "Enter your city"
//McLean
//
//-Display prompt "Enter your state"
//VA
//
//-Display prompt "Enter your zip code"
//22102
//
//-Display prompt "Enter your work phone number"
//7896542314
//
//-Display prompt "Enter your personal phone number"
//2406542314
//
//-Display prompt "Enter your age"
//35
//
//-Display prompt "Enter your height"
//5.10
//
//-Display prompt "Enter your weight"
//173.2
//
//-Display prompt "Are you married?"
//true
//
//
//
//-build contacts variable by concatenating work phone, personal phone and email
//-build fullName variable by concatenating first name and last name
//-build address variable by concatenating street, city, state, zip code
//
////this is should be an output in the console (terminal)
//
//Patient personal information
//Full name: May, James
//Address: 7925 Jones Branch Dr, McLean, VA 22102
//Contacts: work phone number - 7896542314, personal phone number - 2406542314,  email: jamesmay@gmail.com
//Age: 35
//Height: 5.1
//Weight: 173.2 pounds
//Married?: true
//*/
//public class test123 {
//    public static void main(String[] args) {
//        //Enter your code here
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Welcome to the patient portal!");
//        System.out.println("Please enter your personal information");
//        System.out.println("Enter your first name");
//        String firstN = scan.next();
//        System.out.println("Enter your last name");
//        String lastN = scan.next();
//        // this part is already provided DO NOT CHANGE
//        System.out.println("Enter your email");
//        email = scan.next();
//        scan.nextLine();//to capture Enter key press
//        System.out.println("Enter your street");
//        street = scan.nextLine();
//        // continue for city
//        System.out.println("Enter your city");
//        String city = scan.next();
//        System.out.println("Enter your state");
//        String state = scan.next();
//        System.out.println("Enter your zip code");
//        int zip = scan.nextInt();
//        System.out.println("Enter your work phone number");
//        int workP = scan.nextInt();
//        System.out.println("Enter your personal phone number");
//        int perP = scan.nextInt();
//        System.out.println("Enter your age");
//        int age = scan.nextInt();
//        System.out.println("Enter your height");
//        double height = scan.nextDouble();
//        System.out.println("Enter your weight");
//        double weight = scan.nextDouble();
//        System.out.println("Are you married?");
//        boolean married = scan.nextBoolean();
//
//
//
//
//
//
//
//
//
//
//
//    }
//}