package day20_WhileLoops;

import java.util.Scanner;

public class whilePractice3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String password = "abc123";
        System.out.println("please enter your password");
        String input = scan.nextLine();
        while (!input.equals(password)){
            System.out.println("invalid please reenter ");
            input = scan.nextLine();
        }
        System.out.println("logged in");







    }
}
