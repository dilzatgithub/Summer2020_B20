package day28_recap_Arrays_Loops;

import java.util.Arrays;

public class multiArrays_01 {
    public static void main(String[] args) {
        String[] group1 = {"dilzat","muradil","kamran"};
        String[] group2 = {"dil","mur","kam","ael"};
        String[] group3 = {"dilzzz","murdaaaa","kamrannnn","aelshatttt"};
        String[] group4 = {"mei","you","mi","ma"};
        String[] group5 = {"qiu","mei","you","ba"};
        String[][] family = {group1,group2,group3,group4,group5};
        //System.out.println(Arrays.deepToString(family));
        for (int i =0;i<= family.length-1;i++){
            String[] each = family[i];
            for (int j = 0;j<= each.length-1;j++){
                System.out.print(family[i][j]+" ");
            }
            System.out.println();
        }






    }
}
