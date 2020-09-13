package day42_static;

public class CapitalOne {
    public static void main(String[] args) {
        Tester[] testers = { new Tester(),new Tester(),new Tester()};
        testers[0].setInfo("Alia",15111,"Lead Tester",180000,'F');
        testers[1].setInfo("Naz",15222,"Tester",180000,'F');
        testers[2].setInfo("Kadirya",15333,"Tester",210000,'F');
        Developer[] developers= {new Developer(),new Developer(),new Developer(),new Developer(),new Developer()};
        developers[0].setInfo("waqar",2111,"Dev lead",450000,'M');
        developers[1].setInfo("Roza",3222,"Dev",550000,'F');
        developers[2].setInfo("burak",43333,"Dev",650000,'M');
        developers[3].setInfo("Virgiana",76543,"Dev",130000,'M');
        developers[4].setInfo("Akbar",0005,"Dev",120000,'M');




        ScrumTeam team1 = new ScrumTeam();
        team1.setInfo("Ramazan", "Hamit","Ismail");
        team1.addTester(testers);
        team1.addDeveloper(developers);

        System.out.println("=======================");
        for (Tester each : team1.testers){
            System.out.println(each.name + " : " +each.salary);
        }
        System.out.println("=======================");
        for (Developer each : team1.developers){
            System.out.println(each.name+" : " + each.salary);
        }
        team1.removeTester(15333);
        team1.removeDeveloper(2111);
        System.out.println(team1);








    }
}
