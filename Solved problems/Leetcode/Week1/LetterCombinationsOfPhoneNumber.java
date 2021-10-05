package Leetcode.Week1;

 import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * Given a string containing digits from 2-9 inclusive, return all possible letter combinations that the number could represent. Return the answer in any order.

A mapping of digit to letters (just like on the telephone buttons) is given below. Note that 1 does not map to any letters.

Example 1:

Input: digits = "23"
Output: ["ad","ae","af","bd","be","bf","cd","ce","cf"]

https://leetcode.com/problems/letter-combinations-of-a-phone-number/
 */

 /**
  * Element
  */
public class LetterCombinationsOfPhoneNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        sc.close();
        System.out.println(letterCombinations(s));
    }
    public static List<String> letterCombinations(String digits) {
        // List<String> ls=new LinkedList<String>();
        String []s=new String[]{"abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        String str="";
        for(int i=0;i<digits.length();i++){
            str+=s[Integer.parseInt(""+digits.charAt(i))-2];
        }
        
        return premuteString(str);
        
    }
    private static List<String> premuteString(String str) {
        
        for(int i=0;i<str.length();i++){
            // ls.add(""+str.charAt(i));
            premuteString(str.substring(0,i)+str.substring(i+1, str.length()));
        }
        return new LinkedList<String>();
        
    }
}
