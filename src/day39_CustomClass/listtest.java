package day39_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class listtest {
    public static void main(String[] args) {

        ArrayList<Integer> number = new ArrayList<>();
        number.addAll(Arrays.asList(2,97,2,56,46,73,6,2,3,7));
        String s = "";
        for (int i =0; i<number.size();i++){
            if (i == 2 || i == 5 || i == 9){
                continue;
            }
            if (number.get(i) == 2 || number.get(i)% 3 == 0){
                s += "1";
            }else {
                s += "0";
            }
        }
        System.out.println(s);




    }
}
