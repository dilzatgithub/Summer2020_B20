package day52_exception2;

public class ThrowPractice {
    public static void main(String[] args) {
        String driverName = "chromee";
        if (driverName.equals("chrome")){
            System.out.println("set up chrome");
        } else if (driverName.equals("firefox")) {
            System.out.println("firefox is sey up");
        } else if (driverName.equals("opera")) {
            System.out.println("set up opera");
        }else {
            throw new RuntimeException("invalid name");
        }



    }
}
