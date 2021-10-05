package Leetcode.Week1;

import java.util.Scanner;
import java.util.Stack;

/**
 * Given a string s representing a valid expression, implement a basic calculator to evaluate it, and return the result of the evaluation.

Note: You are not allowed to use any built-in function which evaluates strings as mathematical expressions, such as eval().

 

Example 1:

Input: s = "1 + 1"
Output: 2

https://leetcode.com/problems/basic-calculator/
 */

public class BasicCalculator {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s=sc.nextLine();
        sc.close();
        System.out.println(calculate(s));
    }

    public static int calculate(String s) {
        Stack<String> stk = new Stack<>();
        for(int i=0;i<s.length();i++){
            if(stk.empty() || stk.peek()!="+" || stk.peek()!="-")
                stk.push(""+s.charAt(i));
            else if((stk.peek()=="+" || stk.peek()=="-") && s.charAt(i)!='('){
                if(stk.pop()=="+")
                    stk.push(String.valueOf(Integer.parseInt(stk.pop())+Integer.parseInt(stk.pop())));
                else
                stk.push(String.valueOf(Integer.parseInt(stk.pop())-Integer.parseInt(stk.pop())));
            }
        }
        return 0;
        
    }
}
