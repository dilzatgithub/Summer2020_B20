package day47_accessModifiers;

public class test1 {
    public test1(){
        System.out.println("de");
    }
    public void test1(){
        System.out.println("sted");
    }

    public static void main(String[] args) {
        test1 obj = new test1();
    }
}
