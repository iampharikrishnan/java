package Leetcode.Week1;

/*
You are given a string s consisting of lowercase English letters. A duplicate removal consists of choosing two adjacent and equal letters and removing them.

We repeatedly make duplicate removals on s until we no longer can.

Return the final string after all such duplicate removals have been made. It can be proven that the answer is unique.

 

Example 1:

Input: s = "abbaca"
Output: "ca"
Explanation: 
For example, in "abbaca" we could remove "bb" since the letters are adjacent and equal, and this is the only possible move.  The result of this move is that the string is "aaca", of which only "aa" is possible, so the final string is "ca".


https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string/
*/

import java.util.Scanner;
import java.util.Stack;

public class AdjacentDuplicateRemove {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s=sc.nextLine();
        sc.close();
        System.out.println(removeDuplicates(s));
    }
    public static String removeDuplicates(String s) {
        Stack<Character> stk=new Stack<Character>();
        stk.push(s.charAt(0));
        for(int i=1;i<s.length();i++){
            if(stk.peek()==s.charAt(i))
                stk.pop();
            else
                stk.push(s.charAt(i));
            
        }
        String out="";
        while(!stk.isEmpty())
            out = ""+stk.pop()+out;
        return out;
    }
}
