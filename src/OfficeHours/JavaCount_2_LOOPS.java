package OfficeHours;

public class JavaCount_2_LOOPS {
    public static void main(String[] args) {
        
        String str = "java is fun. java class today, not javascript";
        int count = 0;
        
        for(int i=0; i < str.length()-3; i++){
            
            String eachFourLetters = str.substring(i, i+4);
            if(eachFourLetters.equals("java")){
                count++;
            }
            System.out.println(eachFourLetters);
            
        }


        
    }
}
