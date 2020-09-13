package day11_ternary;

public class daysofWEEk {
    public static void main(String[] args) {
        int days = 8;

        if(days > 0 && days<= 7){
            String result= (days == 1)?"monday":(days == 2)?"tuesday":(days== 3)?"wednesday":
                    (days == 4 )?"thursday":(days == 5)?"friday":(days == 6)?
                            "saturday":"sunday";
            System.out.println(result);

        }else {
            System.out.println("there is no such day!");
        }





    }
}
