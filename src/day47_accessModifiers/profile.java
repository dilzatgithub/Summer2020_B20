package day47_accessModifiers;

public class profile {
    public static void main(String[] args) {
        Credentials obj1 = new Credentials("kamran",24);
        obj1.setUserName_Ssn("kamran0315",1234567);
        System.out.println(obj1);
    }
}
