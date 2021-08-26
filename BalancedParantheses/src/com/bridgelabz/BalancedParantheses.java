package com.bridgelabz;
import java.util.Scanner;
/**
 * Purpose -To read an Arithmetic Expression such as (5+6)∗(7+8)/(4+3)(5+6) and
 * Ensure parentheses must appear in a balanced or not.
 * @author - Sakshi Shetty
 * @version - 16.0
 * @since - 2021-08-26
 */
public class BalancedParantheses {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter max size: ");
        int n=sc.nextInt();

        /* Creating Stack */
        StackLogic stack = new StackLogic(n);
        System.out.println();
        System.out.println("Parenthesis Matching");
        System.out.println();

        /* Accepting expression */
        System.out.println("Enter expression: ");
        String exp = sc.next();
        int len = exp.length();
        System.out.println("Matches and Mismatches: ");

        for (int i = 0; i < len; i++)
        {
            char ch = exp.charAt(i);

            if (ch == '(')
            {
                stack.push(i);
            }
            else if (ch == ')')
            {
                try
                {
                    long p = (stack.pop() + 1);
                    System.out.println("')' at index "+(i+1)+" matched with '(' at index "+p);
                }
                catch(Exception e)
                {
                    System.out.println("')' at index "+(i+1)+" is unmatched");
                }
            }
        }
        while (!stack.isEmpty() )
        {
            System.out.println("'(' at index "+(stack.pop() +1)+" is unmatched");
        }
    }
}
