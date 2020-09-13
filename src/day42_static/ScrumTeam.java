package day42_static;

import sun.jvm.hotspot.oops.OopUtilities;

import java.util.ArrayList;
import java.util.Arrays;

public class ScrumTeam {
    ArrayList<Tester> testers = new ArrayList<>();
    ArrayList<Developer> developers = new ArrayList<>();
    String PO;
    String BA;
    String SM;
    public void setInfo(String PO, String BA, String SM){
        this.BA = BA;
        this.PO = PO;
        this.SM = SM;
    }
    public void addTester(Tester tester){
        testers.add(tester);
    }
    public void addTester(Tester[] testers){
        if (testers.length == 0){
            return;
        }
        this.testers.addAll(Arrays.asList(testers));
    }
    public void removeTester( long employeeId){
        testers.removeIf( p -> p.employeeID == employeeId);
    }
    public void addDeveloper(Developer developer){
        developers.add(developer);
    }
    public void addDeveloper(Developer[] developers){
        if (developers.length == 0 ){
            return;
        }
        this.developers.addAll(Arrays.asList(developers));
    }
    public void removeDeveloper(long employeeID){
        developers.removeIf(p -> p.employeeID == employeeID);
    }
    public String toString(){
        return "Number of testers: " + testers.size()  +", Number of developers: " +
                developers.size()+ ", PO name: " + PO + ", BA name: " + BA + ", SM name: " + SM;

    }
}
