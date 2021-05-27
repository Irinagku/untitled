package OfficeHours.Practice_03_02_2021;
/*
Make a class PersonInfo
make a main method

Create variables and give value related to you:

    - String name
    - byte age
    - char gender
    - boolean student
    - short number of siblings
    - long favorite number
    - int number of seasons in your area
    - double birth date: (month.day)
    - int year
    - String full birthday date with year
    - String favorite quote

    - Print the person information
    - Challenge: print your name in a cool way (unicode)
    - Challenge: char star

 */

public class PersonInfo {
    public static void main(String[] args){
        String name, fullBirthDay, favoriteQuote;
        byte age = 39;
        char gender = 'F';
        boolean student;
        short numberOfSiblings;
        long favoriteNumber;
        int numberOfSeasons, year;
        double birthDate;

      name = "Adam";
      age = 30;
      gender = 'F';
      student = true;
      numberOfSiblings = 2;
      favoriteNumber = 4;
      birthDate = 4.6;
      year = 1991;
      fullBirthDay = "" + birthDate + "." + year ;
      favoriteQuote = "have a good mindset";

      System.out.println(fullBirthDay);
      System.out.println("Name;" + name);
      System.out.println("Full birthday:");



    }
}
