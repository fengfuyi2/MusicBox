import java.util.Scanner;

public class Main {
    public static void main(String[] args)throws Exception {
        System.out.println("Please enter an expression:");
        Scanner sc = new Scanner(System.in);

        String expression = sc.nextLine();
        BalancedParentheses balance = new BalancedParentheses();
        balance.balanceParentheses(expression);

        sc.close();


    }
}
