package OfficeHours.Practice_04_13_2021;

public class MultipleWords {
    public static void main(String[] args) {
        String words = "knife, wooden spoons, cups,forks, pan,pot, trash can, fridge";
        String [] arrWords = words.split(", ");

        for(String eachWords : arrWords){
            if(eachWords.contains(" ")){
                System.out.println(eachWords);
            }
        }
    }
}
