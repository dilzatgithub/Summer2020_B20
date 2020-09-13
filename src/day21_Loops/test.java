package day21_Loops;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        int propertyPrice = 0;
        int numberOfBedrooms, garageSpots;
        float metroAccessibility, schoolScore, highwayAccessibility;
        boolean backyard, smoking, garage;
        String houseType;
        Scanner scan = new Scanner(System.in);
        System.out.println("*****************************************");
        System.out.println("* Welcome to the RealEstate calculator! *");
        System.out.println("*****************************************");
        //WRITE YOUR CODE HERE
        System.out.println("Enter your property type:");
        houseType = scan.nextLine();
        if(houseType.equalsIgnoreCase("Condo")){
            propertyPrice = 50000;
            System.out.println("How many bedrooms do you have?");
            numberOfBedrooms = scan.nextInt();
            System.out.println("Do you have a backyard");
            backyard = scan.nextBoolean();
            if(backyard){
                System.out.println("Backyard is not available for condo!");
            }
            System.out.println("Do you have garage?");
            garage = scan.nextBoolean();
            System.out.println("How many spots?");
            garageSpots = scan.nextInt();
            if (garageSpots> 0 && garageSpots<= 10){
                propertyPrice = propertyPrice + 20000*garageSpots;
            }else {
                System.out.println("Pardon,  it's not a public parking!");
            }
            System.out.println("How close is metro station?");
            metroAccessibility = scan.nextFloat();
            System.out.println("How close is highway?");
            highwayAccessibility = scan.nextFloat();
            System.out.println("What's the rating of nearest school?");
            schoolScore = scan.nextFloat();
            System.out.println("Does any of your family members smoking?");
            smoking = scan.nextBoolean();
            if (numberOfBedrooms > 0 ){
                propertyPrice = propertyPrice + numberOfBedrooms*30000;
            }
            if (backyard){
                propertyPrice = propertyPrice +5000;
            }
            if (metroAccessibility <= 1){
                propertyPrice = propertyPrice + 10000;
            }else if (metroAccessibility >1 && metroAccessibility <=3 ){
                propertyPrice = propertyPrice + 5000;
            }
            if (highwayAccessibility>1  && highwayAccessibility <= 5){
                propertyPrice = propertyPrice + 8000;
            }else if (highwayAccessibility <= 1){
                propertyPrice = propertyPrice +15000;
            }else if(highwayAccessibility <= 20){
                propertyPrice = propertyPrice +4000;
            }
            if (schoolScore>= 8 && schoolScore <= 10){
                propertyPrice = propertyPrice +45000;
            }else if (schoolScore >= 4){
                propertyPrice = propertyPrice +20000;
            }else {
                propertyPrice = propertyPrice + 5000;
            }
            if (smoking){
                propertyPrice = propertyPrice - 5000;
            }






        }else if (houseType.equalsIgnoreCase("Townhouse")){
            System.out.println("How many bedrooms do you have?");
            numberOfBedrooms = scan.nextInt();
            System.out.println("Do you have a backyard");
            backyard = scan.nextBoolean();
            System.out.println("Do you have garage?");
            garage = scan.nextBoolean();
            System.out.println("How many spots?");
            garageSpots = scan.nextInt();
            if (garageSpots> 0 && garageSpots<= 10){
                propertyPrice = propertyPrice + 20000*garageSpots;
            }else {
                System.out.println("Pardon,  it's not a public parking!");
            }
            System.out.println("How close is metro station?");
            metroAccessibility = scan.nextFloat();
            System.out.println("How close is highway?");
            highwayAccessibility = scan.nextFloat();
            System.out.println("What's the rating of nearest school?");
            schoolScore = scan.nextFloat();
            System.out.println("Does any of your family members smoking?");
            smoking = scan.nextBoolean();
            if (numberOfBedrooms > 0 ){
                propertyPrice = propertyPrice + numberOfBedrooms*30000;
            }
            if (backyard){
                propertyPrice = propertyPrice + 5000;
            }
            if (metroAccessibility <= 1){
                propertyPrice = propertyPrice +10000;
            }else if (metroAccessibility >1 && metroAccessibility <=3 ){
                propertyPrice = propertyPrice +5000;
            }
            if (highwayAccessibility>1  && highwayAccessibility <= 5){
                propertyPrice = propertyPrice +8000;
            }else if (highwayAccessibility <= 1){
                propertyPrice = propertyPrice + 15000;
            }else if(highwayAccessibility <= 20){
                propertyPrice = propertyPrice + 4000;
            }
            if (schoolScore>= 8 && schoolScore <= 10){
                propertyPrice = propertyPrice + 45000;
            }else if (schoolScore >= 4){
                propertyPrice = propertyPrice + 20000;
            }else {
                propertyPrice = propertyPrice + 5000;
            }
            if (smoking){
                propertyPrice = propertyPrice - 5000;
            }





        }else if(houseType.equalsIgnoreCase("Single Family Home")) {
            System.out.println("How many bedrooms do you have?");
            numberOfBedrooms = scan.nextInt();
            System.out.println("Do you have a backyard");
            backyard = scan.nextBoolean();
            System.out.println("Do you have garage?");
            garage = scan.nextBoolean();
            System.out.println("How many spots?");
            garageSpots = scan.nextInt();
            if(garageSpots > 10){
                System.out.println("Pardon, it's not a public parking!");
            }

            System.out.println("How close is metro station?");
            metroAccessibility = scan.nextFloat();
            System.out.println("How close is highway?");
            highwayAccessibility = scan.nextFloat();
            System.out.println("What's the rating of nearest school?");
            schoolScore = scan.nextFloat();
            System.out.println("Does any of your family members smoking?");
            smoking = scan.nextBoolean();
            if (numberOfBedrooms > 0 ){
                propertyPrice = propertyPrice + numberOfBedrooms*30000;
            }
            if (backyard){
                propertyPrice = propertyPrice + 5000;
            }
            if (metroAccessibility <= 1){
                propertyPrice = propertyPrice + 10000;
            }else if (metroAccessibility >1 && metroAccessibility <=3 ){
                propertyPrice = propertyPrice + 5000;
            }
            if (highwayAccessibility>1  && highwayAccessibility <= 5){
                propertyPrice = propertyPrice + 8000;
            }else if (highwayAccessibility <= 1){
                propertyPrice = propertyPrice + 15000;
            }else if(highwayAccessibility <= 20){
                propertyPrice = propertyPrice + 4000;
            }
            if (schoolScore>= 8 && schoolScore <= 10){
                propertyPrice = propertyPrice + 45000;
            }else if (schoolScore >= 4){
                propertyPrice = propertyPrice + 20000;
            }else {
                propertyPrice = propertyPrice + 5000;
            }
            if (smoking){
                propertyPrice = propertyPrice - 5000;
            }



        }












        System.out.println("Market report has been generated.");
        System.out.println("Your estimate market price is: " + propertyPrice);



    }
}




