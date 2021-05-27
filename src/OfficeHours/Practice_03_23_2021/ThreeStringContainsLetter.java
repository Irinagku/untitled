package OfficeHours.Practice_03_23_2021;

public class ThreeStringContainsLetter {
    public static void main(String[] args) {

        String wordOne = "java";
        String wordTwo = "computer";
        String wordThree = "apples";
        String biggestWithWithA = "";

        if(wordOne.contains("a") && wordOne.length() > biggestWithWithA.length()) {
            biggestWithWithA = wordOne;
        }
        if(wordTwo.contains("a") && wordTwo.length() > biggestWithWithA.length()){
            biggestWithWithA = wordTwo;
        }

        if(wordThree.contains("a") && wordThree.length() > biggestWithWithA.length()){
            biggestWithWithA = wordThree;
        }

        if(biggestWithWithA.isEmpty()){
            System.out.println("No words contained A");
        }
        System.out.println("Longest word with A: " + biggestWithWithA);
    }

}
