package day19_forLoop;

public class forLoop {
    public static void main(String[] args) {
        for (int i =0; i <= 100; i++) {
            if ( i% 2 != 0 &&   i % 3 == 0 && i % 5 == 0) {
                System.out.print(i + " ");
            }else if(i%2 == 0 && i % 3 == 0 && i % 5 == 0){
                System.out.println();
                System.out.print(i + " ");


            }
        }


    }
}
