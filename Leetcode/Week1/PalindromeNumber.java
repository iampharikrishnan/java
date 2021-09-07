package Leetcode.Week1;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        sc.close();
        System.out.println(isPalindrome(n));
    }

    private static boolean isPalindrome(int n) {
        if(n<0)
            return false;
        int i=(int)Math.pow(10, String.valueOf(n).length()-1);
        while(n>9){
            if(n%10!=n/i)
                return false; 
            n %= i;
            n/=10;
        }
        return true;
    }
}
