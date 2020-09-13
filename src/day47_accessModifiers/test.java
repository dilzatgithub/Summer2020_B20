package day47_accessModifiers;

public class test {
    public static void main(String[] args) {
        Encapsulations obj1 = new Encapsulations();
        System.out.println(obj1.getSsn());
        obj1.setSsn(7654321);
        System.out.println(obj1.getSsn());


    }
}
