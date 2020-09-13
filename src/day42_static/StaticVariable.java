package day42_static;

class test{
    int a ;
    static int b;
}
public class StaticVariable {
    public static void main(String[] args) {
        test o1 = new test();
        o1.a = 5;
        o1.b = 20;
        test o2 = new test();
        o2.a = 10;
        o2.b = 10;

        System.out.println(o1.a);
        System.out.println(o2.a);
    }
}
