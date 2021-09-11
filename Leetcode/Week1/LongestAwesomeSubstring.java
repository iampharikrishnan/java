package Leetcode.Week1;

import java.util.HashMap;
import java.util.Scanner;

/**
 * 
 * Given a string s. An awesome substring is a non-empty substring of s such that we can make any number of swaps in order to make it palindrome.

Return the length of the maximum length awesome substring of s.

 

Example 1:

Input: s = "3242415"
Output: 5
Explanation: "24241" is the longest awesome substring, we can form the palindrome "24142" with some swaps.

https://leetcode.com/problems/find-longest-awesome-substring/
 */

public class LongestAwesomeSubstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        sc.close();
        System.out.println(longestAwesome(n));
    }
    public static int longestAwesome(String s) {
        if(s=="")
            return 0;
        int max=Math.max(longestSubstring(s),1);
        if(max!=1)
            return max;
        int j=0;
        int occurance=0;
        for(int i=0;i<s.length();i++){
            // if()
            max=Math.max(Math.max(longestSubstring(s.substring(0, i)),longestSubstring(s.substring(i+1, s.length()))),max);
        }
        return max;
        
    }
    private static int longestSubstring(String substring) {
        HashMap<Character,Integer> hm = new HashMap<>();
        for(int i=0;i<substring.length();i++){
            int count = hm.getOrDefault(substring.charAt(i), 0);
            hm.put(substring.charAt(i), count+1);
        }
        int odd=0;
        for(HashMap.Entry<Character,Integer> e:hm.entrySet()){
            if(e.getValue()%2==1)
                odd++;
            if(odd>1)
                return -1;
                
        }
        
        return substring.length();
    }
}
