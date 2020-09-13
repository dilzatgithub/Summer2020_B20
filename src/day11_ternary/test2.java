package day11_ternary;

public class test2 {
    public static void main(String[] args) {
        int x = 1;
        int y = x++;
        int z = y;
        System.out.println(z++ +" "+ x-- +" " + " " +" " + z + " " +x);
        //                1 +       11 +           10     + 11
    }
}
