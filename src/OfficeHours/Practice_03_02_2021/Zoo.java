package OfficeHours.Practice_03_02_2021;

public class Zoo {
    public static void main(String[] args){

        String name                = "ZOO of  Washington DC", foundedDate = "March 3, 2021", startTime = "7:00 AM", closingTime = "5:00 PM";
        boolean isOpenOnHolidays   = true, hasAquarium = false;
        int numberOfBigCats        = 12, numberOfHoofedAnimals = 9, numberOfReptiles = 17, numberOfBirds = 52,
                numberOfPrimates   = 21;
        short numberOfEmployees    = 87;
        double ticketCostForAdults = 29.99, ticketCostForUnder13 = 14.99;
        String parkRules = "-Do not feed our animal residents or throw things in exhibits, and stay on public paths.\n" +
                "-No scooters, skateboards or bicycles.These items must be left outside the park.\n" +
                "-Radios and speakers are prohibited. No playing ball during your visit.\n" +
                "-No pets. Only working service animals are permitted, in accordance with \n" +
                "the American with Disabilities Act. Dogs whose sole function is to provide comfort \n" +
                "or emotional support do not qualify as service animals under the ADA. Pets, comfort animals, \n" +
                "emotional support or therapy animals are not permitted at the Zoo. ";

        System.out.println("***************************************************************************************\n");
        System.out.println("============================== "  +  name +  " ====================================\n");
        System.out.println( "The Zoo founded on: \t\t       " + foundedDate);
        System.out.println( "Operating hours :\t\t\t\t   from   " + startTime+ " to " + closingTime);
        System.out.println( "The Zoo open on Holidays:\t\t   " + isOpenOnHolidays);
        System.out.println( "Has aquarium?: \t\t\t\t\t   " + false);
        System.out.println( "*****************************************************************************************");
        System.out.println( "The Zoo has  "  + numberOfBigCats + " big cats,"+ numberOfHoofedAnimals +
                "  hoofed animals," + numberOfReptiles + " reptiles, " + numberOfBirds + " birds, " + numberOfPrimates + " primates." );
        System.out.println( "Number of employees:\t\t\t\t" + numberOfEmployees);
        System.out.println( "Ticket price for adult: \t\t\t$" + ticketCostForAdults+ "// For children under 13 years old:  $"
                + ticketCostForUnder13);
        System.out.println("=========================================================================================\n");
        System.out.println( "###############################   PARK POLICY   #########################################\n"

                            +parkRules);
        System.out.println();
        System.out.println("***************************************************************************************");

    }
}
