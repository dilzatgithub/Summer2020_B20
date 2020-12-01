package day54_Abstraction.EmpoyeeTask;

import java.time.LocalDate;

public final class Tester extends Employee{
    public Tester(String name, char gender, LocalDate DOfb, String jobTitle, double salary) {
        super(name, gender, DOfb, jobTitle, salary);
    }
    public void findBug(){
        System.out.println(name+ " found a bug!");
    }
}
