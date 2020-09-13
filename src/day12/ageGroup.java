package day12;

public class ageGroup {
    public static void main(String[] args) {
        int age = 155;
        String ageGroup = "";
        if(age>0 && age<= 150){
            if(age < 21){
               ageGroup = "teenager";
            }else if(age <= 55){
                ageGroup = "adult";
            }else {
                ageGroup = "senior";
            }
            System.out.println(ageGroup);
        }else {
            System.out.println("invalid");
        }


    }
}
