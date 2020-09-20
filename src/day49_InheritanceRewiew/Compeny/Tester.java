package day49_InheritanceRewiew.Compeny;

public class Tester extends Employee{
    public Tester(String name, int age, char Gender, double Salary,
                  int ID, String jobTitle){
        setInfo(name,age,Gender,Salary,ID,jobTitle);
    }
    public void smokeTesting(){
        System.out.println(name+" is running smoke Test, while drinking coffee!");
    }

    public void creatingTicket(){
        System.out.println(name+" is creating ticket on JIRA");
    }






}
