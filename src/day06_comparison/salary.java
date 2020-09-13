package day06_comparison;

public class salary {
    public static void main(String[] args) {
        double rate = 50;
        double stateTax = 0.04;
        double federalTax = 0.22;
        double weeklyHours = 45;
        double salary = rate* weeklyHours* 48;
        double totalTax = salary*(stateTax+federalTax);
        double salaryAftertax = salary - totalTax;




        System.out.println("salary is: " + salary+  " USD");
        System.out.println("totalTax is : "+ salary*(stateTax+federalTax)+  " USD");
        System.out.println("salary after tax is: " +salaryAftertax+  " USD");


    }
}
