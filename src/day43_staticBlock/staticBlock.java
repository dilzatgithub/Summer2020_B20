package day43_staticBlock;

public class staticBlock {


    public static void main(String[] args) {
        System.out.println("main method");
    }
    static {
        System.out.println("static block"); // always runs first
    }


}
