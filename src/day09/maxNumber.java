package day09;

public class maxNumber {
    public static void main(String[] args) {
        double a = 500;
        double b = 2000;
        double c = 1000;

        boolean  aIsMax = a > b && a > c;
        boolean  bIsMax = aIsMax == false && b > c;
        boolean  cIsMax = aIsMax == false && bIsMax == false;
        double max = 0;
        if(aIsMax){
           max =a;

        }
        if(bIsMax){
            max = b;

        }
        if(cIsMax){
            max = c;
        }
        System.out.println(max + " is the max number! ");








    }
}
