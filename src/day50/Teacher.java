package day50;

public class Teacher extends Person{
    int teacherID;
    public void teach(String topic){
        System.out.println("Teacher is teaching" + topic);
    }

}
