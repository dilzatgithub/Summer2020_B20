package day09;

public class alcohol {
    public static void main(String[] args) {
        int age = 26;
        boolean hasID = true;
        if(age>=21 && hasID){
            System.out.println(" is eligible to buy");
        }else {
            System.out.println("Not eligible to buy");
        }
    }
}
