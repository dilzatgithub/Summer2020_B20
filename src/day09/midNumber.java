package day09;

public class midNumber {
    public static void main(String[] args) {
        double a = 100;
        double b = 202;
        double c = 201;
        boolean aIsMed = (a>b && a<c) || (a>c && a<b);
        boolean bIsMed = (b>a && b<c) || (b>c && b<a);
        boolean cIsMed = !aIsMed && !bIsMed;
        double Med = 0;
        if(aIsMed){
            Med = a;
        }
        if(bIsMed){
            Med = b;
        }
        if(cIsMed){
            Med = c;
        }
        System.out.println(Med + " is the med number ! ");




    }
}
