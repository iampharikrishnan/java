package Leetcode.Week1;

/**
 * 
 * Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

 

Example 1:

Input: nums = [1,2,3,1]
Output: true

https://leetcode.com/problems/contains-duplicate/
 */

import java.util.HashMap;
import java.util.Scanner;

public class ContainsDuplicate {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int []price=new int[n];
        for(int i=0;i<n;i++)
            price[i]=sc.nextInt();
        sc.close();
        System.out.println(containsDuplicate(price));
    }
    public static boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
        for(int i: nums){
            if(hm.containsKey(i))
                return true;
            hm.put(i,0);
        }
        return false;
    }
}
