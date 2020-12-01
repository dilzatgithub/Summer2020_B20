package day54_Abstraction.EmpoyeeTask;

import java.time.LocalDate;

public class Employee {


    public String name;
    final public char gender;
    final public LocalDate DOfb;
    public String jobTitle;
    public double salary;

    public Employee(String name, char gender, LocalDate DOfb, String jobTitle, double salary) {
        this.name = name;
        this.gender = gender;
        this.DOfb = DOfb;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", DOfb=" + DOfb +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }
}
