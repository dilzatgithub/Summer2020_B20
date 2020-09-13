package day41_Static;

import java.util.ArrayList;
import java.util.Arrays;

public class carpetObjects2 {
    public static void main(String[] args) {
        carpet[] carpets = {new carpet(),new carpet(),new carpet(),new carpet(),new carpet()};
        carpets[0].setInfo(4.5,3.5,17.5,false);
        carpets[1].setInfo(5.5,3.5,18.5,true);
        carpets[2].setInfo(4.5,5.5,19.5,false);
        carpets[3].setInfo(3.5,4.5,20.5,true);
        carpets[4].setInfo(6.5,5.5,21.5,true);
        ArrayList<carpet> persianCarpets = new ArrayList<>();
        persianCarpets.addAll(Arrays.asList(carpets));
        persianCarpets.removeIf(each -> !each.isPersian);



        ArrayList<carpet> regularCarpets = new ArrayList<>();
        regularCarpets.addAll(Arrays.asList(carpets));
        //regularCarpets.removeIf(each-> each.isPersian);
        regularCarpets.removeAll(persianCarpets);


        System.out.println(persianCarpets.size());
        System.out.println(regularCarpets.size());


    }
}
