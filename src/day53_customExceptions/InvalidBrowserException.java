package day53_customExceptions;

public class InvalidBrowserException extends RuntimeException {
    public InvalidBrowserException(){
        super("Invalid Browser name");
    }
}
class test2{
    public static void main(String[] args) {
        throw new InvalidBrowserException();
    }

}