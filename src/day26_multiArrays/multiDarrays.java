package day26_multiArrays;

import java.util.Arrays;

public class multiDarrays {
    public static void main(String[] args) {
        String[] tester = {"Liliia","Ddina","Cristina","Elkem"};
        String[] developers = {"Ahmed","Erfan","Roza","Sarah"};
        String [] sm = {"Nurmamat"};
        String[] po = {"Nadir"};
        String[] ba = {"Alex"};
        String [][] scrumTeam = {tester,developers,sm,po,ba,};
        System.out.println(Arrays.deepToString(scrumTeam));
        scrumTeam[4][0] = "Adam";
        System.out.println(Arrays.deepToString(scrumTeam));
        scrumTeam[1][2]  = "Amina";
        System.out.println(Arrays.deepToString(scrumTeam));
        String[] op2 ={"Osman"};
        scrumTeam[3] = op2;
        System.out.println(Arrays.deepToString(scrumTeam));
        System.out.println("========================================");

        for (String[] each: scrumTeam){
            for (String name: each){
                System.out.println(name);

            }

        }
        System.out.println("==============================================");
        int [][] scores = {{10,20,30,45},{60,55,75,105},{93,48,125,135}};
        for (int[] each : scores){
            Arrays.sort(each);
            for (int num : each){
                if (num%3 == 0){
                    System.out.print(num+" ");
                }



            }
        }









    }
}
