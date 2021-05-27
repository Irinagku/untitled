package HomeworkPractice;

public class Employee {
    public static void main(String[] args){

        String firstName = "Irina", lastName = "Tulus", companyName = "NAVY", jobTitle = " SDET \n" +
                "", officeAdsress = "1314 Sicard St SE, Washington DC 20374";
        int salary = 135000;
        byte startDay = 01, startMonth = 01;
        int startYear = 2022;
        boolean IsItFullTime = true;

        String fullName = firstName + " " + lastName;
        String fullStartDate = (startMonth + "." + startDay + "." + startYear);
        String email = (firstName + startDay + "@" + companyName + ".com");
        double salaryAfter3Years = ( salary + (startMonth * 10000));

        System.out.println("          #####  "+ fullName + "  #####");
        System.out.println("Company name: \t\t\t\t\t\t " + companyName);
        System.out.println("Job title:\t\t\t\t\t\t\t" + jobTitle);
        System.out.println("Office address; \t\t\t\t\t " + officeAdsress);
        System.out.println("Start Date;\t\t\t\t\t\t\t " + fullStartDate);
        System.out.println("Salary for start;\t\t\t\t\t $" + salary);
        System.out.println("Is the job full time?\t\t\t\t " + IsItFullTime);
        System.out.println("Employee's email:\t\t\t\t\t " + email);
        System.out.println("Salary in three year will raise up to  $" + salaryAfter3Years);



    }
}
