package Leetcode.Week1;

// import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Given an array of integers nums, return the number of good pairs.

A pair (i, j) is called good if nums[i] == nums[j] and i < j.

 

Example 1:

Input: nums = [1,2,3,1,1,3]
Output: 4
Explanation: There are 4 good pairs (0,3), (0,4), (3,4), (2,5) 0-indexed.

https://leetcode.com/problems/number-of-good-pairs/
 */
public class NumberOfGoodPair {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int []price=new int[n];
        for(int i=0;i<n;i++)
            price[i]=sc.nextInt();
        sc.close();
        System.out.println(numIdenticalPairs(price));
    }
    public static int numIdenticalPairs(int[] nums) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        int pair=0;
        for(int i: nums){
            int count=hm.getOrDefault(i, 0);
            pair += count;
            hm.put(i, count+1);
        }
        return pair;
        
    }
}
