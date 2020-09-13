package day07;

public class post_VS_pre {
    public static void main(String[] args) {
       int a = 50;
       int b = --a + a++ + a-- + a++;
       // 49 + 49 + 50 + 49
        System.out.println(b);

                int x = 4;
                int y = x * 4 - x++;
                // 4 * 4 - 4
                System.out.println(y);
        System.out.println("================================");
        int num = 100;
        num *= 50;
        System.out.println(num);











    }
}
