package day33_MethodsAndTime;

import java.time.LocalDate;
import java.util.Scanner;

public class birthday {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("please enter the names of student");
        String[] name = {scan.next(),scan.next(),scan.next(),
                scan.next(),scan.next(),};
        LocalDate[] days ={
                LocalDate.of(1995,2,20),
                LocalDate.of(1996,3,15),
                LocalDate.of(1995,4,12),
                LocalDate.of(1996,1,30),
                LocalDate.of(1995,6,2),
        } ;
        for (int i = 0; i<= name.length-1;i++){
            System.out.print(name[i]+ " " + days[i]);
            System.out.println();
        }
    }
}
