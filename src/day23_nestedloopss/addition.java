package day23_nestedloopss;

import java.util.Scanner;

public class addition {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {


            System.out.println("enter 2 numbers");
            double num1 = scan.nextInt();
            double num2 = scan.nextInt();
            double result = num1 + num2;
            System.out.println(result);
            System.out.println("do you want to continue? ");
            String a = scan.next();
            while (!(a.equalsIgnoreCase("yes")|| a.equalsIgnoreCase("no"))){
                System.out.println("invalid, please enter yes or no");
                System.out.println("do you want to continue?");
                a = scan.next().toLowerCase();

            }
            if (a.equalsIgnoreCase("no")){
                break;
            }



        }
        System.out.println("thanks for using this calculator");



    }
}
