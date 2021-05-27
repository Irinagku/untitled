package HomeworkPractice;

public class Max_minNum {
    public static void main(String[] args) {
        int [] numbers = {3,6,100,200,5,10,70};
        int maxNumber=numbers[0];
        int minNumber=numbers[0];

        for(int each : numbers){
            if(each > maxNumber){
                maxNumber=each;

            }if(each<minNumber) {
                minNumber=each;
            }
        }
        System.out.println("maximum number is - " + maxNumber);
        System.out.println("minimum number is - " + minNumber);
    }
}


