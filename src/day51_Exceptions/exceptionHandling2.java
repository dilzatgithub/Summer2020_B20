package day51_Exceptions;

public class exceptionHandling2 {
    public static void main(String[] args) {
        String exception = "";
        try {
            System.out.println(10/0);
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
        System.out.println("step 2");
    }
}
