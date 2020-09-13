package day40_recap;

import java.util.ArrayList;
import java.util.Arrays;

public class myOffers {
    public static void main(String[] args) {
        offer offer1 = new offer();
        offer offer2 = new offer();
        offer offer3 = new offer();
        offer offer4 = new offer();
        offer offer5 = new offer();
        offer offer6 = new offer();
        offer offer7 = new offer();
        offer1.setInfo(100000,"VA",true,true,true,
                "SDET",true);
        offer2.setInfo(75000,"VA",true,false,true,
                "SDET",true);
        offer3.setInfo(125000,"VA",true,true,false,
                "QA",true);
        offer4.setInfo(100000,"PA",true,false,true,
                "SDET",true);
        offer5.setInfo(100000,"CA",true,false,false,
                "QA",true);
        offer6.setInfo(120000,"CO",true,true,true,
                "SDET",true);
        offer7.setInfo(100000,"GA",true,false,false,
                "SDET",true);
        ArrayList<offer> jobOffers = new ArrayList<>();
        jobOffers.addAll(Arrays.asList(offer1,offer2,offer3,offer4,offer5,offer6,offer7));
        for (offer each : jobOffers){
            each.getInfo();
        }
        jobOffers.removeIf(each -> each.salary< 120000 || !each.location.equals("VA"));
        System.out.println(jobOffers.size());



    }
}
