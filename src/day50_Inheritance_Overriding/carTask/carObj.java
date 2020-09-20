package day50_Inheritance_Overriding.carTask;

public class carObj {
    public static void main(String[] args) {
        mercedes mercedes = new mercedes();
        tesla tesla = new tesla();
        jeep jeep = new jeep();
        jeep.start();
        tesla.start();
        mercedes.start();
    }
}
