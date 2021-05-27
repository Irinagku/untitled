package day20_string_manipulation;

public class StringIsEmpty {
    public static void main(String[] args) {


        String jobTitle = "";
        System.out.println(jobTitle.isEmpty());
        System.out.println(jobTitle.length());
        System.out.println(jobTitle.length() == 0);

        if(jobTitle.isEmpty()){
            System.out.println("Job title is missing, please resend");
        }else{
            System.out.println("Job title looks good");
        }

        System.out.println(jobTitle.equals(""));

        if("".equals(jobTitle)){

        }else{
            System.out.println("job title is empty");
        }

        String word = " ";
        System.out.println(word.isEmpty());
        System.out.println(word.length());

        String veggie = "carrots";
        System.out.println(veggie.isEmpty());

        if(!veggie.isEmpty()){
            System.out.println("we have " + veggie);
        }
    }

}
