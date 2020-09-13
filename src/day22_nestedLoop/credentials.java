package day22_nestedLoop;

import java.util.Scanner;

public class credentials {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("please enter your user name");
        String u = scan.next();
        System.out.println("please enter password");
        String p = scan.next();
        int attempt = 0;
        int times = 3;
        while (!(u.equals("dilzat") && p.equals("12345")) && attempt<= 4){

            if(attempt ==3 ){
                System.out.println("your account is locked!");
                System.exit(0);
            }
            System.out.println("invalid please re-enter " );
            System.out.println("please enter your user name");
            u = scan.next();
            System.out.println("please enter password");
            p = scan.next();
            attempt++;
        }
        System.out.println("logging in...");




    }
}
