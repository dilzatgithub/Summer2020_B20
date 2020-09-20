package day51_Exceptions;

public class exceptionPractice {
    public static void main(String[] args) {
        System.out.println("hello");
        sleep(3);

//        try {
//            Thread.sleep(3000);
//        }catch (InterruptedException a ){
//
//        }
        System.out.println("world");
        sleep(5);
//        try {
//            Thread.sleep(5000);
//        }catch (InterruptedException a ){
//
//        }
        System.out.println("how are you");
    }


    public static void sleep(int seconds){

        try {
            Thread.sleep(seconds*1000);
        }catch (InterruptedException a){

        }
    }
}
