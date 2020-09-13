package day23_nestedloopss;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            while (true) {


                System.out.println("enter 2 numbers");
                double num1 = scan.nextInt();
                double num2 = scan.nextInt();
                System.out.println("please enter the operator");
                char a = scan.next().charAt(0);
                double result = (a == '+')?num1 + num2:(a == '-')?
                        num1 - num2:(a == '*')?num1*num2:
                        (a == '/')?num1/num1:(a == '%')?num1 % num2:0;
                System.out.println(result);
                System.out.println("do you want to continue? ");
                String b = scan.next();
                while (!(b.equalsIgnoreCase("yes")||
                        b.equalsIgnoreCase("no"))){
                    System.out.println("invalid, please enter yes or no");
                    System.out.println("do you want to continue?");
                    b = scan.next().toLowerCase();

                }
                if (b.equalsIgnoreCase("no")){
                    break;
                }



            }
            System.out.println("thanks for using this calculator");







    }
}
