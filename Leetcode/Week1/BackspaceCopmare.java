package Leetcode.Week1;

import java.util.Scanner;
import java.util.Stack;

/**
 * Given two strings s and t, return true if they are equal when both are typed into empty text editors. '#' means a backspace character.

Note that after backspacing an empty text, the text will continue empty.

 

Example 1:

Input: s = "ab#c", t = "ad#c"
Output: true
Explanation: Both s and t become "ac".

https://leetcode.com/problems/backspace-string-compare/
 */

public class BackspaceCopmare {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();
        sc.close();
        System.out.println(backspaceCompare(s,t));
    }

    public static boolean backspaceCompare(String s, String t) {
        Stack<Character> stk = new Stack<>();
        Stack<Character> stkt = new Stack<>();
        for(int i=0;i<s.length();i++){
            if(!stk.empty() && s.charAt(i)=='#')
                stk.pop();
            else if(t.charAt(i)!='#')
                stk.push(s.charAt(i));
        }
        for(int i=0;i<t.length();i++){
            if(!stkt.empty() && t.charAt(i)=='#')
                stkt.pop();
            else if(t.charAt(i)!='#')
                stkt.push(t.charAt(i));
        }
        System.out.println(stk);
        System.out.println(stkt);
        return stk.equals(stkt);
        
    }
}
