package day49_InheritanceRewiew.Compeny;

import java.util.ArrayList;
import java.util.Arrays;

public class ScrumTeam {
    public ArrayList<Tester> testers = new ArrayList<>();
    public ArrayList<Developer> developers = new ArrayList<>();



    public void addTesters(Tester tester){
        testers.add(tester);
    }
    public void addDevelopers(Developer developer){
        developers.add(developer);
    }
    public void addTesters(Tester[] testers){
        this.testers.addAll(Arrays.asList(testers));
    }
    public void addDevelopers(Developer[] developers){
        this.developers.addAll(Arrays.asList(developers));
    }
    public void removeTester(long ID){
        testers.removeIf(p -> p.ID == ID);
    }
    public void removeDeveloper(long ID){
        developers.removeIf(p-> p.ID == ID);
    }
    public String toString(){
        return "================================"+
                "\nDevelopers #"+developers.size()+
                "\nTesters #"+testers.size()+
                "\nCapacity: "+((developers.size()+testers.size())*8)+ " point (Dev.Team * 8 Days)"+
                "\nVelocity: "+((developers.size()+testers.size())*8)+ " point for current Sprint (No days Off)"+
                "\n================================";
    }

    public ScrumTeam(Tester[] testers,Developer[] developers){
        addTesters(testers);
        addDevelopers(developers);
    }


}
