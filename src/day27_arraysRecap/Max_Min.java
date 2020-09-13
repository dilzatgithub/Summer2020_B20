package day27_arraysRecap;

public class Max_Min {
    public static void main(String[] args) {
        int[] number = {80,75,65,110,90,45,56,78};
        int max = number[0];
        int min = number[0];
        for (int each: number){
            if (each>max){
                max = each;
            }
            if (each<min){
                min = each;
            }
        }

        System.out.println(max+" "+ min);

    }
}
