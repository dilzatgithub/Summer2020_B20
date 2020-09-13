package day47_accessModifiers;

public class Credentials {
    public String name;
    public int age;
    private String userName;
    private  long passWord;
    Credentials(String name,int age){
        this.name = name;
        this.age = age;
    }
    public void setUserName_Ssn(String userName, long passWord){
        this.userName = userName;
        this.passWord = passWord;
    }
    public long getPassWord(){
        return passWord;
    }
    public String getUserName(){
        return userName;
    }
    public String toString(){
        return name+"\n"+ age+"\n"+getUserName()+"\n"+ getPassWord();
    }
}
