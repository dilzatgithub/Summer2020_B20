package day18_loopIntro;

import java.util.Scanner;

public class emailDomain {
    public static void main(String[] args) {
        System.out.println("Please enter you email");
        Scanner scan = new Scanner(System.in);
        String email = scan.next();
        int n1 = email.indexOf("@");
        int n2 = email.lastIndexOf(".com");
        String domain = email.substring(n1+1, n2);
        System.out.println(domain);






    }
}
