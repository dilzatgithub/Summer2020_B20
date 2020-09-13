package day44_Constructor;

public class HumanResource {
    static employee employee1;
    static employee employee2;
    static employee employee3;
    static employee employee4;
    static employee employee5;
    static {
        employee1 = new employee();
        employee2 = new employee();
        employee3 = new employee();
        employee4 = new employee();
        employee5 = new employee();
        employee1.setInfo("Muhammed", 12312,4563432,"SDET",123000,'M');
        employee2.setInfo("dilzat", 1231221,4256432,"SDET",123000,'M');
        employee3.setInfo("kamran", 1231212,4456432,"SDET",123000,'M');
        employee4.setInfo("osman", 1232112,4556432,"SDET",123000,'M');
        employee5.setInfo("muradil", 1221312,4656432,"SDET",123000,'M');
    }

}
