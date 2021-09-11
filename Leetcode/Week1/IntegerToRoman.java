package Leetcode.Week1;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Roman numerals are represented by seven different symbols: I, V, X, L, C, D
 * and M.
 * 
 * Symbol Value I 1 V 5 X 10 L 50 C 100 D 500 M 1000 For example, 2 is written
 * as II in Roman numeral, just two one's added together. 12 is written as XII,
 * which is simply X + II. The number 27 is written as XXVII, which is XX + V +
 * II.
 * 
 * Roman numerals are usually written largest to smallest from left to right.
 * However, the numeral for four is not IIII. Instead, the number four is
 * written as IV. Because the one is before the five we subtract it making four.
 * The same principle applies to the number nine, which is written as IX. There
 * are six instances where subtraction is used:
 * 
 * I can be placed before V (5) and X (10) to make 4 and 9. X can be placed
 * before L (50) and C (100) to make 40 and 90. C can be placed before D (500)
 * and M (1000) to make 400 and 900. Given an integer, convert it to a roman
 * numeral.
 * 
 * 
 * 
 * Example 1:
 * 
 * Input: num = 3 Output: "III"
 * 
 * https://leetcode.com/problems/integer-to-roman/
 */

public class IntegerToRoman {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        System.out.println(intToRoman(n));
    }

    public static String intToRoman(int num) {
        HashMap<Integer, String> hm = new HashMap<>();
        hm.put(1, "I");
        hm.put(5, "V");
        hm.put(10, "X");
        hm.put(50, "L");
        hm.put(100, "C");
        hm.put(500, "D");
        hm.put(1000, "M");
        String output = "";
        int place = 1;
        while (num != 0) {
            int rem = num % 10;
            num /= 10;
            if(rem==0)continue; 
            if (hm.containsKey(rem + 1))
                output = hm.get(place) + hm.get((rem + 1)*place) + output;
            else if (hm.containsKey(rem)) {
                output = hm.get(rem*place) + output;
            } else {
                String tmp = "";
                while (rem != 0) {
                    if (rem > 5) {
                        tmp+=hm.get(5*place);
                        rem -= 5;
                    } else {
                        tmp+=hm.get(place);
                        rem -= 1;
                        // output=hm.get(5*place)+output;

                    }
                }
                output = tmp + output;
            }
            place *= 10;
        }
        return output;

    }
}
