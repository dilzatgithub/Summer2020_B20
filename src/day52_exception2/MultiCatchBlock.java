package day52_exception2;

public class MultiCatchBlock {
    public static void main(String[] args) {
        int[] arr = {10,20};
        try {
            System.out.println(arr[1]);
        }catch (ArithmeticException e){
            System.out.println("ArithmeticException is handled");
        }catch (ClassCastException e){
            System.out.println("ClassCastException is done");
        }catch (Exception e ){
            System.out.println("Exception");
        }




    }
}
