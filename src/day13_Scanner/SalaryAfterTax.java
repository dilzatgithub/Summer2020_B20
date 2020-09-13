package day13_Scanner;
import java.util.Scanner;
public class SalaryAfterTax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your annual salary please: ");
        int Salary = input.nextInt();
        System.out.println("Please enter you state tax rate: ");
        double stateTaxRate = input.nextDouble();
        System.out.println("Please enter you Federal tax rate");
        double federalTaxRate = input.nextDouble();
        double stateTax = Salary * stateTaxRate;
        double federalTax = Salary * federalTaxRate;
        double taxAfterTax = Salary -(stateTax+federalTax);
        System.out.println("Your salary is: $"+ Salary);
        System.out.println("Your federal tax total is : $"+ federalTax);
        System.out.println("Your state tax total is : $"+ stateTax);
        System.out.println("Your salary after tax is : $"+taxAfterTax);


    }
}
