package day19_forLoop;

public class Continue {
    public static void main(String[] args) {
        for (int i = 0; i <= 50; i ++){
            if(i%2 == 0){
                continue;
            }
            System.out.print(i+ " ");
        }
        System.out.println();
        for (int i = 0; i <= 50; i ++){
            if(i%2 != 0){
                continue;
            }
            System.out.print(i+ " ");
        }
    }
}
