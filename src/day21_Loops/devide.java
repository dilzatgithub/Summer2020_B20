package day21_Loops;

public class devide {
    public static void main(String[] args) {
        int a = 15;
        int b = 3;
        int count =0;
        if(b == 0){
            System.out.println("invalid");
            System.exit(0);
        }
        while(a >= b){
            a -= b;
            count++;
        }
        System.out.println(count);
        System.out.println(a);




    }
}
