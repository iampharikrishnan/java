package Leetcode.Week1;

import java.util.Scanner;
import java.util.Stack;

/**
 * A valid parentheses string is either empty "", "(" + A + ")", or A + B, where
 * A and B are valid parentheses strings, and + represents string concatenation.
 * 
 * For example, "", "()", "(())()", and "(()(()))" are all valid parentheses
 * strings. A valid parentheses string s is primitive if it is nonempty, and
 * there does not exist a way to split it into s = A + B, with A and B nonempty
 * valid parentheses strings.
 * 
 * Given a valid parentheses string s, consider its primitive decomposition: s =
 * P1 + P2 + ... + Pk, where Pi are primitive valid parentheses strings.
 * 
 * Return s after removing the outermost parentheses of every primitive string
 * in the primitive decomposition of s.
 * 
 * 
 * 
 * Example 1:
 * 
 * Input: s = "(()())(())" Output: "()()()" Explanation: The input string is
 * "(()())(())", with primitive decomposition "(()())" + "(())". After removing
 * outer parentheses of each part, this is "()()" + "()" = "()()()".
 * 
 * https://leetcode.com/problems/remove-outermost-parentheses/
 */

public class RemoveOuterParanthesis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        sc.close();
        System.out.println(removeOuterParentheses(n));
    }

    public static String removeOuterParentheses(String s) {
        Stack<Character> stk = new Stack<>();
        String output = "";
        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == '('){
                if(!stk.empty())
                    output+="(";
                stk.push('(');
            }
            else {
                stk.pop();
                if(!stk.empty())
                    output+=")";
            }
        }
        return output;
    }
}
