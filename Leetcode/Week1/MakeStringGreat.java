package Leetcode.Week1;

import java.util.Scanner;
import java.util.Stack;

/**
 * Given a string s of lower and upper case English letters.

A good string is a string which doesn't have two adjacent characters s[i] and s[i + 1] where:

0 <= i <= s.length - 2
s[i] is a lower-case letter and s[i + 1] is the same letter but in upper-case or vice-versa.
To make the string good, you can choose two adjacent characters that make the string bad and remove them. You can keep doing this until the string becomes good.

Return the string after making it good. The answer is guaranteed to be unique under the given constraints.

Notice that an empty string is also good.

 

Example 1:

Input: s = "leEeetcode"
Output: "leetcode"
Explanation: In the first step, either you choose i = 1 or i = 2, both will result "leEeetcode" to be reduced to "leetcode".

https://leetcode.com/problems/make-the-string-great/
 */

public class MakeStringGreat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        sc.close();
        System.out.println(makeGood(n));
    }
    public static String makeGood(String s) {
        Stack<Character> stk= new Stack<Character>();
        String output="";
        for(int i=0;i<s.length();i++){
            if(stk.empty() || Math.abs(stk.peek()-s.charAt(i))!=32)
                stk.push(s.charAt(i));
            else
                stk.pop();
        }
        while(!stk.empty())
            output=stk.pop()+output;
        return output;
        
    }
}
