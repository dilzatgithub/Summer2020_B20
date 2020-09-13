package day41_Static;

import java.util.ArrayList;

public class kamrans_carpetShop {
    public static void main(String[] args) {
//        carpet carpet1 = new carpet();
//        carpet carpet2 = new carpet();
//        carpet carpet3 = new carpet();
//        carpet carpet4 = new carpet();
//        carpet carpet5 = new carpet();
//        carpet1.setInfo();
//        carpet2.setInfo();
//        carpet3.setInfo();
//        carpet4.setInfo();
//        carpet5.setInfo();
        carpet[] carpets = {new carpet(),new carpet(),new carpet(),new carpet(),new carpet()};
        carpets[0].setInfo(4.5,3.5,17.5,false);
        carpets[1].setInfo(5.5,3.5,18.5,true);
        carpets[2].setInfo(4.5,5.5,19.5,false);
        carpets[3].setInfo(3.5,4.5,20.5,true);
        carpets[4].setInfo(6.5,5.5,21.5,true);
        ArrayList<carpet> persianCarpets = new ArrayList<>();
        ArrayList<carpet> regularCarpets = new ArrayList<>();
//
        for (carpet each : carpets){
            if (each.isPersian){
                persianCarpets.add(each);
            }else {
                regularCarpets.add(each);
            }
        }
        System.out.println(persianCarpets.size());
        System.out.println(regularCarpets.size());

//        for (carpet each : carpets){
//          each.getInfo();
//            System.out.println("============================");
//        }






    }
}
