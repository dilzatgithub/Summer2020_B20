package day10;

public class Character_id {
    public static void main(String[] args) {
        char cha = '&';
        boolean isAlpha = (cha >= 65 && cha <= 90) || (cha >= 97 && cha <= 122);
        boolean isNum = (cha >= 48 && cha <= 57);
        boolean isSpe = (!isAlpha && !isNum);

        if (isAlpha) {
            System.out.println(cha + " is alpha");
        } else {
            System.out.println(cha + " is not alpha");
        }
        if (isNum) {
            System.out.println(cha + " is number");
        } else {
            System.out.println(cha + " is not num");
            if (isSpe) {
                System.out.println(cha + " is special cha");
            }
            if(!isSpe){
                System.out.println(cha + " is not special cha");
            }


            }
        }
    }

