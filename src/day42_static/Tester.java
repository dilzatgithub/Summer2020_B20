package day42_static;

public class Tester {
    String name;
    long employeeID;
    String jobTitle;
    double salary;
    char gender ;
    public void setInfo(String name, long employeeID, String jobTitle, double salary, char gender){
        this.name = name;
        this.employeeID = employeeID;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.gender = gender;
    }
    public void smokeTesting(){
        System.out.println(name + " is smoke testing");
    }
    public  void creatingTicket(){
        System.out.println(name + " is creating ticket");
    }
    public String toString(){
        return "name: "+ name + ", Gender: " + gender + ", job title: " + jobTitle+
                ", salary: " + salary+ ", employee ID: " + employeeID;
    }
}
