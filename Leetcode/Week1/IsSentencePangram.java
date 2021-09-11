package Leetcode.Week1;



import java.util.HashMap;


/**
 * A pangram is a sentence where every letter of the English alphabet appears at least once.

Given a string sentence containing only lowercase English letters, return true if sentence is a pangram, or false otherwise.

 

Example 1:

Input: sentence = "thequickbrownfoxjumpsoverthelazydog"
Output: true
Explanation: sentence contains at least one of every letter of the English alphabet.

https://leetcode.com/problems/check-if-the-sentence-is-pangram/
 */

import java.util.Scanner;

public class IsSentencePangram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        sc.close();
        System.out.println(checkIfPangram(n));
    }
    public static boolean checkIfPangram1(String sentence) {
        HashMap<Character,Integer> hm=new HashMap<>();
        for(int i=0;i<sentence.length();i++)
            hm.put(sentence.charAt(i), 0);
        if(hm.size()<26)
            return false;
        return true;
        
    }
    public static boolean checkIfPangram(String sentence) {
        String c="abcdefghijklmnopqrstuvwxyz";
        for(int i=0;i<26;i++){
            if(!sentence.contains(""+c.charAt(i)))
                return false;
        }
        return true;
        
    }
    // public static boolean checkIfPangram(String sentence) {
    //     Set<Character> c=new HashSet<>();
    //     c.addAll(sentence);
        
    //     return true;
        
    // }
}
