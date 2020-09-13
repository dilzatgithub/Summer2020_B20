package day11_ternary;

public class daysOfMonth {
    public static void main(String[] args) {
        int month = 13;
        boolean days28 = month == 2;
        boolean days30 = month == 4 || month == 6 || month == 9 || month == 11;
        boolean invalid = month < 1 || month > 12;
        String result = "";
        if(days28){
            result = "28days";
        }else if(days30){
            result = "30days";
        }else if(invalid){
            result = "invalid";
        }else {
            result = "31days";

        }
        System.out.println(result);


    }
}
