package day12;

import java.util.Scanner;

public class sumOfTheNumbers {
    public static void main(String[] args) {
        System.out.println("enter your number:");
        Scanner input = new Scanner(System.in);
        double num1 = input.nextDouble();
        System.out.println("enter 2nd number:");
        double num2 = input.nextDouble();
        System.out.println("the sum of your number is : "+ (num1+ num2));
    }
}
