package day12;

public class switch_01 {
    public static void main(String[] args) {
        int day =2;
        System.out.print("it's ");
        String result = "";
        switch (day){
            case 1 :
                result = "monday";
                break;
            case 2 :
                result = "tuesday";
                break;
            case 3 :
                result = "wednesday";
                break;
            case 4 :
                result = "thursday";
                break;
            case 5 :
                result = "friday";
                break;
            case 6:
                result = "saturday";
                break;
            case 7:
                result = "sunday";
                break;
            default:
                result = "invalid";
                break;
        }
        System.out.println(result);



    }
}
