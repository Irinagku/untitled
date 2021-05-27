package HomeworkPractice;

public class CHAINING {
    public static void main(String[] args) {

        String message = "Sender: [Nadir] From Number<222-333-4444> Message: {Hello,Lets code some java}";
        
        
        String words = message.substring(message.indexOf("{")+1, message.indexOf("}"));
        System.out.println("words = " + words);

        int start = message.indexOf("[");
        int end = message.indexOf("]");

        message.substring(start, end);
        System.out.println(message.substring(start + 1, end));
        String sender = message.substring(start + 1, end);

        System.out.println("sender = " + sender);
       // int start1 = message.indexOf("<");
       // int end1 = message.indexOf(">");

        //String mobile = message.substring(start1 + 1, end1);


        String mobile = message.substring(message.indexOf("<")+1, message.indexOf(">"));
        System.out.println("mobile = " + mobile);
        String word = " pp ooo   ";

        System.out.println(word.replace(" ", ""));

        String city = "sykesville";
        System.out.println(city.substring(0, 1).toUpperCase()+city.substring(1));
        
        int i = 1;
        if(i<=5){
            System.out.println("i = " + i);
        }


    }


}
