import java.util.HashMap;
import java.util.Scanner;

class Atoi {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String s = sc.nextLine();
        System.out.println(Atoi.myAtoi(s));
        sc.close();
    }
    public static int myAtoi(String s) {
        HashMap<Character, Integer> hm = new HashMap<>() {
            {
                put('+', 1);
                put('-', -1);
                put('0', 0);
                put('1', 1);
                put('2', 2);
                put('3', 3);
                put('4', 4);
                put('5', 5);
                put('6', 6);
                put('7', 7);
                put('8', 8);
                put('9', 9);
            }
        };
        int value = 0;
        int sign = 1, i = 0;
        s = s.trim();
        //hm.forEach((k,v)->System.out.println(k+" - "+v));


        while (i < s.length()) {
            // Check for if d char is present in HashMap
            if (hm.containsKey(s.charAt(i))) {
                if (s.charAt(i) == '+' || s.charAt(i) == '-') {
                    if(s.length()-1>10 || (s.length()==10 && hm.get(s.charAt(i+1))<3))
                        return Integer.MAX_VALUE;
                    if (s.charAt(i) == '-')
                        sign = -1;
                    
                }

                else {
                        value = (value * 10) + hm.get(s.charAt(i));

                }

                i++;
            } 
            else {
                return sign * value;

            }
            

        }

        return sign * value;
    }
}