package day22_string_manipulation;

public class IndexOf_example {
    public static void main(String[] args) {

        String technologies = "java, html, css, selenium, testng, maven, cucumber";

        System.out.println(technologies.indexOf("html"));
        System.out.println(technologies.lastIndexOf(","));

        int indexOfJava = technologies.indexOf("java");
        System.out.println("java is at index " + indexOfJava);

        int idxOfCss = technologies.indexOf("css");
        System.out.println("css is at index " + idxOfCss);

        int indexOfCucumber = technologies.indexOf("cucumber");
        System.out.println(" cucumber is at index " + indexOfCucumber);

        if(technologies.contains("maven")){
            System.out.println("maven is present");
        }else{
            System.out.println("maven is nor present");
        }

        if(technologies.indexOf("maven") > -1){
            System.out.println("maven is present");
        }else{
            System.out.println("maven is not present");
        }
    }
}


