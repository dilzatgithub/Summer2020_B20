package day23_nestedloopss;

import java.util.Scanner;

public class rooms {
    public static void main(String[] args) {

        System.out.println("Welcome to Cybertek Inn");
        Scanner scan = new Scanner(System.in);
        int total = 0;
        while (true) {
            System.out.println("please choice from the following");
            System.out.println("1. King bed - $120");
            System.out.println("2. Queen bed - $100");
            System.out.println("3. Single bed - $80");
            int option = scan.nextInt();


            switch (option) {
                case 1:
                    total += 120;
                    break;
                case 2:
                    total += 100;
                    break;
                case 3:
                    total += 80;
                    break;
                default:
                    System.out.println("get out");
                    System.exit(0);
            }
            System.out.println("do you want to reserve other room?");
            String a = scan.next().toLowerCase();
            while (!(a.equals("yes")||a.equals("no"))){
                System.out.println("please re-enter");
                a = scan.next().toLowerCase();
            }
            if (a.equals("no")){
                break;
            }

        }

        System.out.println("you total is $"+ total);



    }
}
