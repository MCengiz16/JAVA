package DataStructure;

import java.util.Scanner;
/**
 * Demonstrates the use of a stack to evaluate postfix expressions.
 *LISTING 3 . 1
 * page 67
 * @author Lewis and Chase
 * @version 4.0
 */
public class PostfixTester
{
    /**
     * Reads and evaluates multiple postfix expressions.
     */
    public static void main(String[] args)
    {
        String expression, again;
        int result;
        Scanner in = new Scanner(System.in);
        PostfixEvaluator evaluator = new PostfixEvaluator();
        do
        {

            System.out.println("Enter a valid post-fix expression one token " +
                    "at a time with a space between each token " +
                    "(e.g. 5 4 + 3 2 1 - + *)");
            System.out.println("Each token must be an integer or an " +
                    "operator (+,-,*,/)");
            expression = in.nextLine();
            result = evaluator.evaluate(expression);
            System.out.println();
            System.out.println("That expression equals " + result);
            System.out.print("Evaluate another expression [Y/N]? ");
            again = in.nextLine();
            System.out.println();
        }
        while (again.equalsIgnoreCase("y"));
    }
}