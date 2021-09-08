package Leetcode.Week1;

/**
 * You are given an integer array nums. The unique elements of an array are the elements that appear exactly once in the array.

Return the sum of all the unique elements of nums.

 

Example 1:

Input: nums = [1,2,3,2]
Output: 4
Explanation: The unique elements are [1,3], and the sum is 4.

https://leetcode.com/problems/sum-of-unique-elements/
 */

import java.util.HashMap;

public class SumOfUniqueElement {

    public int sumOfUnique(int[] nums) {
        HashMap<Integer,Integer> hm= new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int count= hm.getOrDefault(nums[i],0);
            hm.put(nums[i],count+1);
        }
        int sum=0;
        for( HashMap.Entry<Integer,Integer> i: hm.entrySet()){
            if(i.getValue()==1){ 
                sum = sum +i.getKey();
            }
        }
        return sum;
    }
}
