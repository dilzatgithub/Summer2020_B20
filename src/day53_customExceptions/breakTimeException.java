package day53_customExceptions;

public class breakTimeException extends RuntimeException{

    public  breakTimeException(){

        super("its time for break time");
    }
    public breakTimeException(String str){
        super(str);

    }


}
class test{
    public static void main(String[] args) {
        //throw new RuntimeException();
        throw new breakTimeException("you need to give us a break");


    }
}
