package day11_ternary;

public class voteTernary {
    public static void main(String[] args) {
        int age = 19;
        String eligibility = (age >=21)? "can buy" : "cannot buy";
        System.out.println(eligibility);
        String citizen = "USA";
        String result = (age>= 19 && citizen == "USA")? " can vote": "can't vote";
        System.out.println(result);









    }
}
