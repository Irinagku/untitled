package HomeworkPractice;

public class remove_duplicate {
    public static void main(String[] args) {

        String word = "mohammad";

        System.out.println(nonDup(word));
    }

    public static String nonDup (String name){

        String output = "";

        for( int i = 0; i < name.length(); i++){
            if(!output.contains("" +name.charAt(i))){
                output +=name.charAt(i);

            }
            
        }
        
        return output;
    }


}
