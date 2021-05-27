package da13_multi_branch_if_statements;

public class LogicalLANDOperator {
    public static void main(String[] args) {
        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && true);
        System.out.println(false && false);

        System.out.println(10 > 5 && 1 == 1);
        System.out.println(2>6 && 2>1);

        int apples = 10, oranges = 5;
                boolean check = apples > 5 && oranges > 3;
        System.out.println("check");

        if(apples>6&&oranges>2){
            System.out.println("check = " + check);


        }
    }
}
