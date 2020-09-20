package day49_InheritanceRewiew.Compeny;

public class Employee extends Person {
    public double Salary;
    public int ID;
    public String jobTitle;

    public void setInfo(String name, int age, char Gender, double Salary,
                        int ID, String jobTitle) {
        setInfo(name, age, Gender);
        this.Salary = Salary;
        this.ID = ID;
        this.jobTitle = jobTitle;
    }

    public void work() {
        System.out.println(name + " is working");
    }

    public String toString() {
        return "Name is " + name + ", age is " + age + ", gender type: " + Gender + ", Salary= $" + Salary + ", Employee ID: " + ID
                + ", Job title is: " + jobTitle;
    }
}
