package day08;

public class even_odd {
    public static void main(String[] args) {
        double number = 101;
        boolean even = number % 2 == 0;
        if(even){
            System.out.println(number + " is a even number!");
        }
        if(!even){
            System.out.println(number + " is a odd  number!");
        }

    }
}
