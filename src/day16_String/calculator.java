package day16_String;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("first number");
        double n1 = input.nextDouble();
        System.out.println("2nd number");
        double n2 = input.nextDouble();
        System.out.println("enter the operator");
        char operator = input.next().charAt(0);
        boolean valid = operator == '*' || operator == '/'|| operator == '+'||operator == '-'||operator == '%';
        double result = (operator == '+')? n1 + n2:(operator == '-')?n1-n2: (operator == '*')?n1 *n2:(operator == '/')?n1 / n2 :n1 % n2;
        System.out.println(result);
            }
        }






