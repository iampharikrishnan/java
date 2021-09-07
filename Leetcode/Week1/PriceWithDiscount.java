package Leetcode.Week1;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Given the array prices where prices[i] is the price of the ith item in a shop. There is a special discount for items in the shop, if you buy the ith item, then you will receive a discount equivalent to prices[j] where j is the minimum index such that j > i and prices[j] <= prices[i], otherwise, you will not receive any discount at all.

Return an array where the ith element is the final price you will pay for the ith item of the shop considering the special discount.

 

Example 1:

Input: prices = [8,4,6,2,3]
Output: [4,2,4,2,3]
Explanation: 
For item 0 with price[0]=8 you will receive a discount equivalent to prices[1]=4, therefore, the final price you will pay is 8 - 4 = 4. 
For item 1 with price[1]=4 you will receive a discount equivalent to prices[3]=2, therefore, the final price you will pay is 4 - 2 = 2. 
For item 2 with price[2]=6 you will receive a discount equivalent to prices[3]=2, therefore, the final price you will pay is 6 - 2 = 4. 
For items 3 and 4 you will not receive any discount at all.
 * 
 * @param prices
 * @return
 */ 

import java.util.Stack;

public class PriceWithDiscount {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int []price=new int[n];
        for(int i=0;i<n;i++)
            price[i]=sc.nextInt();
        sc.close();
        System.out.println(Arrays.toString(finalPrices(price)));
    }
    public static int[] finalPrices(int[] prices) {
        Stack<Integer> stk = new Stack<Integer>();
        for(int i=0;i<prices.length;){
            if(stk.isEmpty() || prices[i] > prices[stk.peek()]){
                stk.push(i);
                i++;
            }
            else{
                prices[stk.peek()] -= prices[i];
                stk.pop();
            }
        }
        return prices;
        
    }
}
