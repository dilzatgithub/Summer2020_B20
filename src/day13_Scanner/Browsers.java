package day13_Scanner;

public class Browsers {
    public static void main(String[] args) {
        String browserName = "safari";
        switch(browserName){
            case "chrome" :
                System.out.println("Opening Chrome Browser");
                break;

            case "firefox":
                System.out.println("Opening Firefox Browser");
                break;
            case "safari":
                System.out.println("Opening Safari Browser");
                break;
            case "edeg":
                System.out.println("Opening edge Browser");
                break;
            case "opera":
                System.out.println("Opening OPERA Browser");
                break;
            default:
                System.out.println("invalid Browser Name");


            }

        }

    }

