package day23_nestedloopss;

import java.util.Scanner;

public class month {
    public static void main(String[] args) {
        String[] month = {"jan","feb","mar","apr","may","jun","jul"
        ,"aug","sep","oct","nov","dec"};
        Scanner scan = new Scanner(System.in);
        System.out.println("please enter month");
        int n = scan.nextInt();
        System.out.println(month[n-1]);
        System.out.println("==========================================");
        String[] days = new String[7];
        days[0]= "monday";
        days[1]= "tuesday";
        days[2]= "wednesday";
        days[3]= "thursday";
        days[4]= "friday";
        days[5]= "saturday";
        days[6]= "sunday";
        for (int i = 0;i<= days.length-1;i++){
            System.out.print(days[i]+" ");
        }








    }
}
