package day58_polymorphism_Continue;

import day57_polymorphism_Intro.abstractionTask.Iphone;
import day57_polymorphism_Intro.abstractionTask.Phone;
import day57_polymorphism_Intro.abstractionTask.Samsung;

import java.util.ArrayList;
import java.util.Arrays;

public class phoneShop {
    public static void main(String[] args) {

            Phone[] phone = {
                    new Iphone("12", "6.1", 1000),
                    new Samsung("S20", "7", 1100),
                    new Iphone("12", "6.1", 1000),
                    new Samsung("S20", "7", 1100),
                    new Iphone("12", "6.1", 1000),
                    new Samsung("S20", "7", 1100),
                    new Iphone("12", "6.1", 1000),
                    new Samsung("S20", "7", 1100),
                    new Iphone("12", "6.1", 1000),
                    new Samsung("S20", "7", 1100),
                    new Iphone("12", "6.1", 1000),
                    new Samsung("S20", "7", 1100),
                    new Samsung("S20", "7", 1100),
                    new Iphone("12", "6.1", 1000),
                    new Samsung("S20", "7", 1100)
            };
            ArrayList<Phone> phoneShop = new ArrayList<>(Arrays.asList(phone));
            int countIphone = 0;
            int countSamsung = 0;
            int countHuaWei = 0;
//            for (int i = 0; i<= phoneShop.size()-1;i++){
//                if (phoneShop.get(i) instanceof Iphone){
//                    countIphone++;
//                }else if (phoneShop.get(i) instanceof Samsung){
//                    countSamsung++;
//                }else {
//                    countHuaWei++;
//                }
//            }
        for (Phone each: phoneShop) {
            if (each instanceof Iphone){
                countIphone++;
            }else if (each instanceof Samsung){
                countSamsung++;
            }else {
                countHuaWei++;
            }

        }
        System.out.println(countIphone);
        System.out.println(countSamsung);
        System.out.println(countHuaWei);



    }
}
