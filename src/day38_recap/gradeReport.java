package day38_recap;

import java.util.ArrayList;
import java.util.Arrays;

public class gradeReport {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(100, 90, 85, 75, 55, 45, 73, 73, 35, 47,
                60, 87, 77, 67, 57, 47, 93, 83, 73, 63, 53, 43));


        ArrayList<Integer> gradeA = new ArrayList<>();
        ArrayList<Integer> gradeB = new ArrayList<>();
        ArrayList<Integer> gradeC = new ArrayList<>();
        ArrayList<Integer> gradeD = new ArrayList<>();
        ArrayList<Integer> gradeF = new ArrayList<>();

        for (Integer each : list) {
            if (each >= 90 && each <= 100) {
                gradeA.add(each);
            }else if(each >= 80){
                gradeB.add(each);
            }else if (each >= 70){
                gradeC.add(each);
            }else if (each >= 60){
                gradeD.add(each);
            }else {
                gradeF.add(each);
            }


        }
        System.out.println(gradeA);
        System.out.println(gradeB);
        System.out.println(gradeC);
        System.out.println(gradeD);
        System.out.println(gradeF);






    }
}