package day11_ternary;

public class Salary {
    public static void main(String[] args) {
        double salary = 30000;
        int jobHistory = 1;
        String result = "";
        if(salary >= 30000){
            if(jobHistory >=2 ){
                result = "eligible for loan";
            }else {
                result= "you need to work more";
            }

        }else {
            result = "not eligible for loan";
        }
        System.out.println(result);
    }

}
