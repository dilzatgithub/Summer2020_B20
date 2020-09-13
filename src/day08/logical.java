package day08;

public class logical {
    public static void main(String[] args) {
        // !: opposite boolean
        String firstName = "john";
        String lastName = "deer";
        int age = 40;
        String citizenShip = "USA";
        boolean eligibleToVote = age >= 18 && citizenShip == "USA";
        System.out.println(firstName + " " + lastName + " is eligible to vote: " + eligibleToVote);



    }
}
