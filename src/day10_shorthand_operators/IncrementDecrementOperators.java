package day10_shorthand_operators;

public class IncrementDecrementOperators {
    public static void main(String[] args) {
         int i = 1;
        System.out.println("i = " + i);
        
        i++;
        System.out.println("i = " + i);
        i++;
        i++;
        ++i;
        ++i;
        System.out.println("i = " + i);

        int linesOfCodes = 15;
        //four different ways to add 1 //
        linesOfCodes = linesOfCodes +1;
        linesOfCodes += 1;
        linesOfCodes++;
        ++linesOfCodes;
        System.out.println("linesOfCodes = " + linesOfCodes);
         // type four different ways of descreasing by1

        int linesOfCode = 15;
        linesOfCode = linesOfCode -1;
        linesOfCode -= 1;
        linesOfCode --;
        --linesOfCode;
        
        char letter = 'a';

        System.out.println("letter = " + letter);
        letter++;
        System.out.println("letter = " + letter);
        letter++;
        ++letter;
        System.out.println("letter = " + letter);
        letter--;
        System.out.println("letter = " + letter);


        













        
        
        
    }
    
}
