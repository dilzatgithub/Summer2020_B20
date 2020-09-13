package day14_Scanner;
import java.util.Scanner;
public class Scanner_recap {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a number ");
        String age = scan.nextLine();
        System.out.println("enter your name");
        String name = scan.nextLine();
        System.out.println(age +" "+ name);


    }
}
