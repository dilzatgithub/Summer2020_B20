package day47_accessModifiers;

public class accessModifiers {
    public static int publicVariable = 10;
    public static void publicMethods(){
        System.out.println("public methods");
    }
    static int defaultVariable = 200; // default
    static void defaultMethods(){
        System.out.println("default methods");
    }
    private static int privateVariable = 200;
    private static void privateMethods(){
        System.out.println("private methods");
    }
}
