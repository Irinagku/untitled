package da13_multi_branch_if_statements;

public class calculatorV1 {
    public static void main(String[] args) {
        int num1 = 443;
        int num2 =50;
        char operator = '+';
        if(operator=='+'){
            System.out.println(num1+num2);
        }else if(operator=='-'){
            System.out.println(num1-num2);
        }else if(operator=='*'){
            System.out.println(num1*num2);
        }else if(operator=='/'){
            System.out.println("num1/num2");
        }else{
            System.out.println("invalid operator");
        }
    }
}
