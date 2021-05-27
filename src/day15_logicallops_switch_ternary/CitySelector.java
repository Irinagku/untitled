package day15_logicallops_switch_ternary;

public class CitySelector {
    public static void main(String[] args) {
        String city = "Miami";

        if(city.equals("Baltimore") || city.equals("Miami")){
            System.out.println("Willing to relocate to " + city);
        }else{
            System.out.println("I am not moving to - " + city );
        }

        String teacher = "Saim";
        //
        if(teacher.equals("Saim") || teacher.equals("Murodil")){
            System.out.println("It is Java class with " + teacher);
        }else{
            System.out.println("It is Soft Skills class with " + teacher);
        }

        if(teacher.equals("Saim") || teacher.equals("Murodil")){
            System.out.println("java class with " + teacher);
        }else if(teacher.equals("Nadir")){

        }else{
            System.out.println("Some class with " + teacher);
        }

        String company = "Google";
        double salary = 85_000;
        if(company.equals("Google") || salary>= 100_000){
            System.out.println("Starting to work");

        }else{
            System.out.println("My answer is no");
        }

    }


}
