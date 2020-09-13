package day44_Constructor;

public class employee {
    String name;
    int id;
    int ssn;
    String jobTitle;
    double salary;
    char gender;
    static boolean isisEmployed;
    static boolean hasSalary;
    static {
        isisEmployed = true;
        hasSalary = true;
    }

    public void setInfo( String name,int id,int ssn,String jobTitle,double salary,char gender){
        this.gender = gender;
        this.id = id;
        this.name = name;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.ssn = ssn;
    }
    public String toString(){
        return "Name: "+ name+"\nGender: "+ gender+"\nEmployee ID: "+ id+"\nEmployee SSN: "+ ssn+
                "\nJob Title: "+ jobTitle+"\nSalary: "+ salary;
    }
}
