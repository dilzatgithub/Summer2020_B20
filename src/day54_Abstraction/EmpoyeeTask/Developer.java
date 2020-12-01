package day54_Abstraction.EmpoyeeTask;

import java.time.LocalDate;

public final class Developer extends Employee{
    public Developer(String name, char gender, LocalDate DOfb, String jobTitle, double salary) {
        super(name, gender, DOfb, jobTitle, salary);
    }
}
