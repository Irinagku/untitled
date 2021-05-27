package day43_list_custom_classes;

public class Employee {
    String name;
    String jobTitle;

    public void work(){
        System.out.println(name + " works as " + jobTitle);
    }
}

class Job{
    public static void main(String[] args) {
        Employee employee1 = new Employee();
        employee1.name = "Irina";
        employee1.jobTitle = "SDET";
        employee1.work();

        Employee employee2 = new Employee();
        employee2.name = "Greg";
        employee2.jobTitle = "Dev";
        employee2.work();

        Employee employee3 = new Employee();
        employee3.name = "Tanya";
        employee3.jobTitle = "SDET";
        employee3.work();






    }
}
