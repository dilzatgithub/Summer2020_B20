package day14_Scanner;
import java.util.Scanner;
public class test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter vehicle's year:");
        int vehicleYear = input.nextInt();

        //WRITE YOUR CODE HERE:
        switch (vehicleYear){
            case 1995 :
                System.out.println("Your vehicle needs to be recalled!");
                break;
            case 1996 :
                System.out.println("Your vehicle needs to be recalled!");
                break;
            case 1997:
                System.out.println("Your vehicle needs to be recalled!");
                break;
            case 1998:
                System.out.println("Your vehicle needs to be recalled!");
                break;
            case 2001:
                System.out.println("Your vehicle needs to be recalled!");
                break;
            case 2002:
                System.out.println("Your vehicle needs to be recalled!");
                break;
            case 2004:
                System.out.println("Your vehicle needs to be recalled!");
                break;
            case 2005:
                System.out.println("Your vehicle needs to be recalled!");
                break;
            case 2006:
                System.out.println("Your vehicle needs to be recalled!");
                break;
            case 2015:
                System.out.println("Your vehicle needs to be recalled!");
                break;
            case 2016:
                System.out.println("Your vehicle needs to be recalled!");
                break;
            case 2017:
                System.out.println("Your vehicle needs to be recalled!");
                break;
            default:
                System.out.println("Your vehicle is fine, enjoy!");

        }
    }
}