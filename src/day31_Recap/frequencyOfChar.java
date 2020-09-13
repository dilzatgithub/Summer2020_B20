package day31_Recap;
import Library.Util;
public class frequencyOfChar {
    public static void main(String[] args) {
        String str = "AABBBCCC";// ==> A2B3B3
        String result ="";
        String nonDop = Util.removeDup(str);// ABC
//        char ch1 = nonDop.charAt(0);
//        int count = Util.frequency(str,ch1);
//        result += ch1+""+ count;
//        char ch2 = nonDop.charAt(1);
//        int count2 = Util.frequency(str,ch2);
//        result += ch2+""+ count2;
        for (char each : nonDop.toCharArray()){
            int count = Util.frequency(str,each);
            result += each+""+ count;
        }


        System.out.println(result);






    }
}
