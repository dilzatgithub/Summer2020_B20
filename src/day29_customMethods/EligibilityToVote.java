package day29_customMethods;

import com.sun.corba.se.spi.ior.IdentifiableFactory;
import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;

public class EligibilityToVote {
    public static void main(String[] args) {
        vote("kamran",16,false);
        eligible(17,false);
        calculator(10,'*',80);
    }


    public static void vote(String name,int age,boolean Citizen){
        boolean eligibleToVote = age >= 18 && Citizen == true;
        if (eligibleToVote){
            System.out.println(name + " is eligible to vote");
        }else {
            System.out.println(name+ " please grow up");
        }



    }


    public static void eligible(int age,boolean hasId){
        if (hasId && age>= 21){
            System.out.println("you are eligible");
        }else {
            System.out.println("get the fuck out");
        }
    }


    public static void calculator(double num1, char operator ,double num2){
        switch (operator){
            case '+' :
                System.out.println("Addition: " +(num1 + num2)); break;
            case '-':
                System.out.println("Subtraction: "+ (num1 - num2)); break;
            case '*':
                System.out.println("Multiplication: "+ (num1 * num2)); break;
            case '/':
                System.out.println("Division: "+ (num1 / num2)); break;
            case '%':
                System.out.println("Remainder: "+ (num1 % num2)); break;
            default:
                System.out.println("invalid ");

        }


    }


}
